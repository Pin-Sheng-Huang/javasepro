package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-28 19:49
 * @LastEditTime: 2023-06-28 19:49
 */

public class Client {
    private static UserManager userManager;
    private static Scanner scanner;

    public static void main(String[] args) {
        userManager = new UserManager();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 注册");
            System.out.println("2. 登录");
            System.out.println("3. 查看注册会员数");
            System.out.println("4. 显示注册会员信息");
            System.out.println("0. 退出");
            System.out.print("请输入选项：");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    registerUser();
                    break;
                case "2":
                    loginUser();
                    break;
                case "3":
                    displayRegisteredUserCount();
                    break;
                case "4":
                    displayRegisteredUsers();
                    break;
                case "0":
                    System.out.println("程序已退出。");
                    return;
                default:
                    System.out.println("无效的选项，请重新输入。");
            }

            System.out.println();
        }
    }

    public static void registerUser() {
        System.out.print("请输入用户名：");
        String username = scanner.nextLine();

        System.out.print("请输入密码：");
        String password = scanner.nextLine();

        String registrationResult = userManager.register(username, password);
        System.out.println(registrationResult);
    }

    public static void loginUser() {
        System.out.print("请输入用户名：");
        String username = scanner.nextLine();

        System.out.print("请输入密码：");
        String password = scanner.nextLine();

        String loginResult = userManager.login(username, password);
        System.out.println(loginResult);
    }

    public static void displayRegisteredUserCount() {
        int registeredUserCount = userManager.getRegisteredUserCount();
        System.out.println("注册会员数：" + registeredUserCount);
    }

    public static void displayRegisteredUsers() {
        userManager.displayRegisteredUsers();
    }
}

class UserManager {
    private Map<String, User> users;
    private Map<String, String> tokens;

    public UserManager() {
        users = new HashMap<>();
        tokens = new HashMap<>();
    }

    public String register(String username, String password) {
        if (users.containsKey(username)) {
            return "Registration failed. Username already exists.";
        }

        User user = new User(username, password);
        users.put(username, user);

        String token = generateToken();
        tokens.put(username, token);

        return "注册成功. Token: " + token;
    }

    public String login(String username, String password) {
        User user = users.get(username);
        if (user == null || !user.getPassword().equals(password)) {
            return "登陆失败. Invalid username or password.";
        }

        String token = tokens.get(username);
        return "登陆成功. Token: " + token;
    }

    public int getRegisteredUserCount() {
        return users.size();
    }

    public void displayRegisteredUsers() {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue().getPassword();
            String token = tokens.get(username);
            System.out.println("姓名: " + username + ", 密码: " + password+",Token:"+token);
        }
    }

    private String generateToken() {
        return UUID.randomUUID().toString();
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
