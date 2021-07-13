package JDBC;

import java.sql.*;

/**
 * @author fangjiulin
 * @date 2021/7/13 18:09
 */
public class MySQLDemo {
    //需要将mysql-connector-java-5.1.44.jar放到C:\Program Files\Java\jdk1.8.0_291\jre\lib\ext中
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USERNAME = "root";
    private static String PASSWORD = "123456";
    private static String URL = "jdbc:mysql://localhost:3306/flask?" +
            "serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";

    public static void main(String[] args) {
        Statement stmt = null;
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //System.out.println("1111");
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = connection.createStatement();
            String sql = "select * from USER";
            ResultSet rs = stmt.executeQuery(sql);
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
            stmt.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
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
