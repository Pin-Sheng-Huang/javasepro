package aoptest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 CREATE TABLE `city` (
 `ID` int NOT NULL AUTO_INCREMENT,
 `Name` char(35) NOT NULL DEFAULT '',
 `CountryCode` char(3) NOT NULL DEFAULT '',
 `District` char(20) NOT NULL DEFAULT '',
 `Population` int NOT NULL DEFAULT '0',
 PRIMARY KEY (`ID`),
 KEY `CountryCode` (`CountryCode`),
 CONSTRAINT `city_ibfk_1` FOREIGN KEY (`CountryCode`) REFERENCES `country` (`Code`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4080 DEFAULT CHARSET=latin1
 */

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "123456";

        try {
            // 连接到数据库
            Connection connection = DriverManager.getConnection(url, username, password);

            // 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 执行查询
            String query = "SELECT * FROM city";
            ResultSet resultSet = statement.executeQuery(query);

            // 处理查询结果
            while (resultSet.next()) {
                // 从结果集中获取数据
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                // 打印数据
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // 关闭资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
