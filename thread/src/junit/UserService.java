package junit;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-18 19:48
 * @LastEditTime: 2023-06-18 19:48
 */

public class UserService {
    public  String loginName(String name, String password){
        if("asheng".equals(name)&&"123".equals(password)){
            return "登入成功";
        }else{
            return "失敗";
        }
    }

    public void QQ(){
        System.out.println(10/5);
        System.out.println("全部ok");

    }
}
