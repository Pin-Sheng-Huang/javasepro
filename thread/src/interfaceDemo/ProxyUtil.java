package interfaceDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-25 16:20
 * @LastEditTime: 2023-06-25 16:20
 */

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) throws NoSuchMethodException {
        /*
        ClassLoader loader(类加载器)(用于指定一个加载器),
        Class<?>[] interfaces(指定代理涨怎样,也就是哪些方法),
        InvocationHandler h
        * * */
        //Star starProxy = ProxyUtil.createProxy(s);
        //starProxy.sing("XXX") 和starProxy.dance()
       Star starproxy =  (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
               new Class[]{Star.class}, new InvocationHandler() {
                   @Override
                   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       //代理对象要做的事情会在这边写代码
                       String methodName = method.getName();
                       if (methodName.equals("sing")) {
                           System.out.println("准备话筒,收钱300万");
                       } else if (methodName.equals("dance")) {
                           System.out.println("准备场地,收钱壹仟万...");
                       }
                           return method.invoke(bigStar,args);//让歌手唱歌or跳舞
                   }
               });
        // 在创建代理对象后，调用BigStar类的构造函数，并传递name参数

        return starproxy;
    }
}

class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        BigStar bs = new BigStar("黄阿昇");
        Star starProxy = ProxyUtil.createProxy(bs);
        String s = starProxy.sing("HELLO HELLO");//starProxy 调用invoke方法 ,参数method 是sing方法
        System.out.println(s);
        starProxy.dance();
    }

}

