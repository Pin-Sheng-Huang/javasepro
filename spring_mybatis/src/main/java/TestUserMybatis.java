package spring_mybatis.src.main.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import spring_mybatis.domain.User;

public class TestUserMybatis {
    private static SqlSessionFactory sqlSessionFactory;
    public static Scanner sc;

    public static void main(String[] args) {
        String resource = "sqlMapConfig.xml"; // MyBatis 配置文件路径
        try (InputStream inputStream = Resources.getResourceAsStream(resource);
             Scanner sc = new Scanner(System.in)) { // 声明并初始化 Scanner 对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            while (true) {
                System.out.println("请输入操作命令：");
                System.out.println("create");
                System.out.println("get");
                System.out.println("update");
                System.out.println("delete");
                System.out.println("getAll");
                String command = sc.nextLine();

                // 执行增删改查操作
                switch (command) {
                    case "create":
                        createUser();
                        break;
                    case "get":
                        System.out.println("请输入要查找的用户名：");
                        String name = sc.nextLine();
                        getUserByName(name);
                        break;
                    case "update":
                        System.out.println("请输入要更新的用户名：");
                        String nameToUpdate = sc.nextLine();
                        updateUser(nameToUpdate);
                        break;
                    case "delete":
                        System.out.println("请输入要刪除的用户名：");
                        String deleteName = sc.nextLine();
                        deleteUser(deleteName);
                        break;
                    case "getAll":
                        getUserAll();
                        break;
                    default:
                        System.out.println("无效的命令");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("加载配置文件出错：" + e.getMessage());
        }
    }

    private static void createUser() {
        User user = new User();
        user.setUserName("asheng");
        user.setRealName("pin");
        user.setPassword("123456");

        try (org.apache.ibatis.session.SqlSession sqlSession = sqlSessionFactory.openSession()) {
            int insertCount = sqlSession.insert("spring_mybatis.domain.UserMapper.save", user);
            sqlSession.commit();

            if (insertCount > 0) {
                System.out.println("插入成功");
            } else {
                throw new Exception("插入失败");
            }
        } catch (Exception e) {
            System.out.println("创建用户异常：" + e.getMessage());
        }
    }

    private static void getUserAll() {
        try (org.apache.ibatis.session.SqlSession sqlSession = sqlSessionFactory.openSession()) {
            List<User> userList = sqlSession.selectList("spring_mybatis.domain.UserMapper.findAll");

            if (!userList.isEmpty()) {
                System.out.println("查询成功：");
                for (User user : userList) {
                    System.out.println(user);
                }
            } else {
                System.out.println("查询失败：用户不存在");
            }
        } catch (Exception e) {
            System.out.println("查询用户异常：" + e.getMessage());
        }
    }

    private static void getUserByName(String name) {
        try (org.apache.ibatis.session.SqlSession sqlSession = sqlSessionFactory.openSession()) {
            User user = sqlSession.selectOne("spring_mybatis.domain.UserMapper.findByName", name);

            if (user != null) {
                System.out.println("查询成功：" + user);
            } else {
                System.out.println("查询失败：用户不存在");
            }
        } catch (Exception e) {
            System.out.println("查询用户异常：" + e.getMessage());
        }
    }

    private static void updateUser(String name) {
        try (org.apache.ibatis.session.SqlSession sqlSession = sqlSessionFactory.openSession()) {
            User user = sqlSession.selectOne("spring_mybatis.domain.UserMapper.findByName", name);
            if (user != null) {
                System.out.println("当前用户信息：" + user);

                user.setRealName("QQ");
                user.setPassword("123456");

                int updateCount = sqlSession.update("spring_mybatis.domain.UserMapper.update", user);
                sqlSession.commit();

                if (updateCount > 0) {
                    System.out.println("更新成功");
                } else {
                    throw new Exception("更新失败");
                }
            } else {
                System.out.println("更新失败：用户不存在");
            }
        } catch (Exception e) {
            System.out.println("更新用户异常：" + e.getMessage());
        }
    }


    private static void deleteUser(String deleteName) {
        try (org.apache.ibatis.session.SqlSession sqlSession = sqlSessionFactory.openSession()) {
            int deleteCount = sqlSession.delete("spring_mybatis.domain.UserMapper.delete", deleteName);
            sqlSession.commit();

            if (deleteCount > 0) {
                System.out.println("删除成功");
            } else {
                throw new Exception("删除失败");
            }
        } catch (Exception e) {
            System.out.println("删除用户异常：" + e.getMessage());
        }
    }
}
