package junit;

import org.junit.*;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-18 19:52
 * @LastEditTime: 2023-06-18 19:52
 */

public class TestUserService {
    @Before
    public void before(){  System.out.println("Before测试方法前执行");   }
    @After
    public void After(){  System.out.println("After测试方法后执行");   }

    @BeforeClass
    public static void beforeClass(){  System.out.println("BeforeClass测试方法前执行");   }
    @AfterClass
    public static void AfterClass(){  System.out.println("AfterClass测试方法后执行");   }
    //测试方法必须是公开无返回值
    //必须@Test ,沒有的話就導個包
    @Test
    public void testloginName(){
        UserService u = new UserService();
        String rs = u.loginName("asheng","123");
        //進行預期結果的正確性測試：斷言
        Assert.assertEquals("您的功能業務出問題","登入成功",rs);
    }
    @Test
    public void testQQ(){
        UserService u = new UserService();
        u.QQ();
    }
}
