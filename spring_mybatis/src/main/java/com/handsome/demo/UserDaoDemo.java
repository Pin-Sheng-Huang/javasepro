package spring_mybatis.src.main.java.com.handsome.demo;

import com.handsome.dao.UserDao;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
spring 配置applicationContext
 */

public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
        app.close();//銷燬方法
    }
}
