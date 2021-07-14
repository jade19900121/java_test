package JDBC;

import java.sql.*;

/**
 * @author fangjiulin
 * @date 2021/7/14 21:47
 */
public class Batch_Test {
    //使用Java对数据库进行操作时，必须使用PreparedStatement，严禁任何通过参数拼字符串的代码！
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USERNAME = "root";
    private static String PASSWORD = "123456";
    private static String URL = "jdbc:mysql://localhost:3306/flask?" +
            "serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            ps = connection.prepareStatement("INSERT INTO USER (id, name, age) VALUES (?,?,?)");

            for (int i = 1; i <= 10; i++) {
                ps.setInt(1, i); // 注意：索引从1开始、
                ps.setString(2, "zhangsan" + i);
                ps.setInt(3, 20 + i);
                //先插入一条数据
                //int n = ps.executeUpdate();
                //System.out.println("n的值:" + n);
                ps.addBatch(); // 添加到batch
            }
            // 执行batch:
            int[] ns = ps.executeBatch();
            for (int n : ns) {
                System.out.println(n + " inserted."); // batch中每个SQL执行的结果数量
            }
            /*插入完成后，再查询数据库*/
            ps = connection.prepareStatement("SELECT id, name, age FROM User");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 姓名: " + name);
                System.out.print(", 年龄: " + age);
                System.out.print("\n");
            }


            /*最后对插入的数据删除掉*/
            for (int i = 1; i <= 10; i++) {
                ps = connection.prepareStatement("DELETE FROM User WHERE id=?");
                ps.setInt(1, i);
                int n1 = ps.executeUpdate();
            }

            // 完成后关闭
            rs.close();
            ps.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (ps != null)
                    ps.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
