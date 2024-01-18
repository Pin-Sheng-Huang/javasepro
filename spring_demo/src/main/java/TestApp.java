import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.neo4j.driver.util.Resource;
import spring_mybatis.dao.EmployeesDao;
import spring_mybatis.domain.Employees;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-11 19:26
 * @LastEditTime: 2023-07-11 19:26
 */

public class TestApp {
    public static void main(String[] args) throws IOException {
        String resource = "sqlMapConfig.xml"; // MyBatis配置文件的路径
        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
                Connection connection = sqlSession.getConnection();
                if (connection != null) {
                    System.out.println("成功连接到数据库！");
                    // 进行其他数据库操作...

                    EmployeesDao employeesDao = sqlSession.getMapper(EmployeesDao.class);
                    Employees em = employeesDao.findById(2);
                    System.out.println(em);
//                    System.out.println(employeesDao.findAll());
                } else {
                    System.out.println("无法连接到数据库！");
                }
            }
        } catch (IOException e) {
            System.out.println("加载配置文件出错：" + e.getMessage());
        }
    }
}
