package AOP_Demo;

public interface UserManager {
    void login(String username,String password);
    void delete(String username,String password);
    String[] select(String username,String password);
}
