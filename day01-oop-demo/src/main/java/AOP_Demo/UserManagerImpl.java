package AOP_Demo;
import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-26 16:28
 * @LastEditTime: 2023-06-26 16:28
 */
@Service
public class UserManagerImpl implements UserManager{
    @Override
    @PerformanceLog
    public void login(String username, String password) {
        if ("admin".equals(username) || "123456".equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    @Override
    @PerformanceLog
    public void delete(String username, String password) {
        System.out.println("删除用户：" + username);
    }

    @Override
    @PerformanceLog
    public String[] select(String username, String password) {
        if ("阿昇".equals(username) || "123".equals(password)) {
            String[] userInformation = new String[2];
            userInformation[0] = "User: " + username;
            userInformation[1] = "Password: " + password;
            return userInformation;
        }
        return null;
    }

}
