import aoptest.config.JdbcConfig;
import aoptest.config.SpringConfig;
import aoptest.domain.City;
import aoptest.service.CityService;

import aoptest.service.impl.CityServiceImpl;
//import org.junit.Assert;
//import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import com.mchange.v2.c3p0.DriverManagerDataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringConfig.class)
public class AopCityTest {

    @Autowired
    private CityService cityService;



    public static void main(String[] args) {
  /*  */    CityService cityService = new CityServiceImpl();
        List<City> all = cityService.findAll();
        System.out.println(all);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = context.getBean(DataSource.class);

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM city");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
//    @Test
////    public void testFindAll() {
////        List<City> all = cityService.findAll();
//////        Assert.assertNotNull(all);
//////        Assert.assertFalse(all.isEmpty());
////        System.out.println(all);
////    }
//
//    public static void main(String[] args) {
//        // 创建 Spring 上下文
//        GenericApplicationContext context = new GenericApplicationContext();
//        context.registerBean(SpringConfig.class);
//        context.refresh();
//
//        // 获取数据源 bean
//        DataSource dataSource = context.getBean(DataSource.class);
//
//        // 连接数据库并执行查询
//        try (Connection connection = dataSource.getConnection()) {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM city");
//
//            // 处理查询结果
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String country = resultSet.getString("country");
//
//                System.out.println("ID: " + id + ", Name: " + name + ", Country: " + country);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // 关闭 Spring 上下文
//            context.close();
//        }
//    }

