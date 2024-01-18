package spring_mybatis.src.test.java.com.com.test.impl;

import com.com.test.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-06 20:43
 * @LastEditTime: 2023-07-06 20:43
 */
//<bean id = "userDao" class="com.com.test.impl.UserDaoimpl">
//@Component("userDao")
//    @Repository("userDao")
public class UserDaoimpl implements UserDao {
    @Override
    public void save() {
        System.out.println("running");
    }
}
