/**
 * @author fangjiulin
 * @date 2021/7/16 16:04
 */
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcPool {

    public static void main(String[] args) throws Exception {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/flask");
        config.setUsername("root");
        config.setPassword("123456");
        config.addDataSourceProperty("connectionTimeout", "1000"); // 连接超时：1秒
        config.addDataSourceProperty("idleTimeout", "60000"); // 空闲超时：60秒
        config.addDataSourceProperty("maximumPoolSize", "10"); // 最大连接数：10
        DataSource ds = new HikariDataSource(config);
        List<User> users = queryStudents(ds);
        users.forEach(System.out::println);
    }

    static List<User> queryStudents(DataSource ds) throws SQLException {
        List<User> users = new ArrayList<User>();
        try (Connection conn = ds.getConnection()) { // 在此获取连接
            try (PreparedStatement ps = conn
                    .prepareStatement("SELECT * FROM user WHERE id = ? AND age >= ?")) {
                ps.setInt(1, 18854); // 第一个参数grade=?
                ps.setInt(2, 30); // 第二个参数score=?
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        users.add(extractRow(rs));
                    }
                }
            }
        } // 在此“释放”连接
        return users;
    }

    static User extractRow(ResultSet rs) throws SQLException {
        User std = new User();
        std.setId(rs.getInt("id"));
        std.setName(rs.getString("name"));
        std.setAge(rs.getInt("age"));
        return std;
    }
}
