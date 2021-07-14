package JDBC;

import java.sql.*;

/**
 * @author fangjiulin
 * @date 2021/7/14 17:16
 */
public class Update_Test {
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
            ps.setObject(1, 18857); // 注意：索引从1开始、
            ps.setObject(2, "zhangsan");
            ps.setObject(3, 20);
            //先插入一条数据
            int n = ps.executeUpdate();
            System.out.println("n的值:" + n);

            //插入完成后，再查询数据库
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
            //最后对插入的数据删除掉
            ps = connection.prepareStatement("DELETE FROM User WHERE id=18857");
            int n1 = ps.executeUpdate();


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
