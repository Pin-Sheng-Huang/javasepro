package spring_mybatis.src.main.java.com.handsome.factory;

import com.handsome.dao.UserDao;
import com.handsome.dao.impl.UserDaoImpl;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-05 17:31
 * @LastEditTime: 2023-07-05 17:31
 */

public class staticFactory {

    public static UserDao getUserDao(){

        return new UserDaoImpl();
    }
}
