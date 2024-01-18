package spring_mybatis.src.main.java.com.handsome.dao.impl;
import com.handsome.dao.UserDao;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-05 12:19
 * @LastEditTime: 2023-07-05 12:19
 */

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建");
    }

    @Override
    public void save() {
        System.out.println("save running");
    }

    @Override
    public void init() {
        System.out.println("初始化方法..");
    }

    @Override
    public void destroy() {
        System.out.println("銷毀方法...");
    }
}
