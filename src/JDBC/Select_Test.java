package JDBC;

import java.sql.*;

/**
 * @author fangjiulin
 * @date 2021/7/14 17:16
 */
public class Select_Test {
    //使用Java对数据库进行操作时，必须使用PreparedStatement，严禁任何通过参数拼字符串的代码！
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USERNAME = "root";
    private static String PASSWORD = "123456";
    private static String URL = "jdbc:mysql://localhost:3306/flask?" +
            "serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";

    public static void main(String[] args) {
        //Statement stmt = null;
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //System.out.println("1111");
            // 执行查询
            //System.out.println(" 实例化Statement对象...");
            /*stmt = connection.createStatement();
            String sql = "select * from USER where id = '18854'";
            ResultSet rs = stmt.executeQuery(sql);*/
            ps = connection.prepareStatement("SELECT id, name, age FROM User WHERE id=?");
            ps.setObject(1, 18854); // 注意：索引从1开始
            ResultSet rs = ps.executeQuery();
            // 展开结果集数据库
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
            // 完成后关闭
            rs.close();
            //stmt.close();
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
