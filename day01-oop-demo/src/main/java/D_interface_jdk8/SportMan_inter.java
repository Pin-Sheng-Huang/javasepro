package D_interface_jdk8;

public interface SportMan_inter {
    /**
     * 1.JDK 8开始:有默认方法(实例方法)
     * ++默认方法,姐口不能创建对象,这个方法只能过继给实现类,由实现类的对象调用
     */
    public default void run(){
        go();//这边调用接口累的私有方法
        System.out.println("跑的贼快");
    }

    /**
     * 静态方法
     * 必须使用static修饰,默认用public修饰
     * --接口静态方法,必须接口名自己调用
     */
    public static void inAddr(){
        System.out.println("学习新增语法");
    }

    /**
     * 私有方法
     * --JDK9开始才支持
     * --必须在街口内部才能被访问
     */
    private void go(){
        System.out.println("开始跑~");
    }
}

class PingPongMan implements SportMan_inter{
    @Override
    public void run() {
//        SportMan_inter.super.run();
        System.out.println("PingPongMan很会跑");
    }
}

class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();

        SportMan_inter.inAddr();

    }
}
