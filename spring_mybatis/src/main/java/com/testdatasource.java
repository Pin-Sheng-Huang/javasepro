package spring_mybatis.src.main.java.com;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-06 19:07
 * @LastEditTime: 2023-07-06 19:07
 */

public class testdatasource {
    public static void main(String[] args) throws PropertyVetoException, SQLException {

            //读取配置文件
            ResourceBundle rb = ResourceBundle.getBundle("jdbc");
            String driver = rb.getString("jdbc.driver");
            String url = rb.getString("jdbc.url");
            String username = rb.getString("jdbc.username");
            String pwd = rb.getString("jdbc.pwd");
            //创建数据源对象 设置连接参数
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            ds.setUser(username);
            ds.setPassword(pwd);
            Connection c = ds.getConnection();
            System.out.println(c);
            c.close();


    }
}
