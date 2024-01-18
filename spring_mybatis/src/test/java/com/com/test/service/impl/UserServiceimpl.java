package spring_mybatis.src.test.java.com.com.test.service.impl;

import com.com.test.UserDao;
import com.com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-06 20:44
 * @LastEditTime: 2023-07-06 20:44
 */
//<bean id = "userService" class="com.com.test.service.impl.UserServiceimpl">
//@Component("userService")
//@Service("userService")
public class UserServiceimpl implements UserService {

    //<property name="userDao" ref="userDao"></property> 等同于下方两个注解
//    @Autowired
//    @Qualifier("userDao") //想注入谁就写入该Bean的id
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
