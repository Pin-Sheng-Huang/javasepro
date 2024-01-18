package spring_mybatis.src.test.java.com.handsome;

import com.handsome.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-05 13:22
 * @LastEditTime: 2023-07-05 13:22
 */

public class SpringTest {
    @Test
    //測試scope屬性
    public void test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao);System.out.println(userDao1);
    }
}
