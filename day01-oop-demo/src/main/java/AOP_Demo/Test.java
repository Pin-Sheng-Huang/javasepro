package AOP_Demo;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-26 16:47
 * @LastEditTime: 2023-06-26 16:47
 */

public class Test {
    public static void main(String[] args) {
        UserManager userManager = new UserManagerImpl();
        System.out.println("Testing login method:");
        userManager.login("admin", "123456");
        System.out.println();

        // Test the delete method
        System.out.println("Testing delete method:");
        userManager.delete("john", "password");
        System.out.println();

        // Test the select method
        System.out.println("Testing select method:");
        String[] userInfo = userManager.select("阿昇", "123");
        System.out.println("User Information:");
        System.out.println(userInfo[0]);
        System.out.println(userInfo[1]);
    }
}
