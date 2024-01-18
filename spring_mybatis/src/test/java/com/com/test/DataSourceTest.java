package spring_mybatis.src.test.java.com.com.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-06 17:25
 * @LastEditTime: 2023-07-06 17:25
 */
@Configuration
public class DataSourceTest {
    @Autowired
    @Test
    //测试手动创建c3p0数据源(spring容器产生数据源对象)
    public void test3() throws PropertyVetoException, SQLException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource ds = (DataSource) app.getBean("dataSource");
        Connection c = ds.getConnection();
        System.out.println(c);
        c.close();
//        DataSource ds = app.getBean(DataSource.class);

    }

    //public void test3() {
//    try (ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml")) {
//        DataSource ds = app.getBean("dataSource", DataSource.class);
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
//
//        // 执行查询语句
//        String sql = "SELECT 1";
//        int result = jdbcTemplate.queryForObject(sql, Integer.class);
//
//        if (result == 1) {
//            System.out.println("数据库连接成功！");
//        } else {
//            System.out.println("数据库连接失败！");
//        }
//    } catch (BeansException e) {
//        // 处理异常
//        System.out.println("数据库连接异常：" + e.getMessage());
//    }
//}
    @Test
    //测试手动创建Druid数据源
    public void test2() throws PropertyVetoException, SQLException {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/db_uu");
        ds.setUsername("root");
        ds.setPassword("123456");
        Connection c = ds.getConnection();
        System.out.println(c);
        c.close();

    }

    @Test
    //测试手动创建c3p0数据源
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/db_uu");
        ds.setUser("root");
        ds.setPassword("123456");
        Connection c = ds.getConnection();
        System.out.println(c);
        c.close();

    }
}
