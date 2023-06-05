package D_generictiy_Demo;

import java.util.ArrayList;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-08 14:46
 * @LastEditTime: 2023-04-08 14:46
 */

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmw = new ArrayList<>();
        bmw.add(new BMW());
        go(bmw);
        ArrayList<Benz> benz = new ArrayList<>();
        benz.add(new Benz());
        go(benz);

        Benz b = new Benz();
        b.start();
        b.run();
        BMW B = new BMW();
        B.start();
        B.run();

    }

    public static void go(ArrayList<? extends Car> cars) {
        if(cars.equals("BMW")){
            System.out.println("帅");

        }
    }
}

class Car {
    void start(){
        System.out.println("引擎发动。。。");
    }
    void run() {    }
}

class Benz extends Car {
    @Override
    void start() {
        super.start();
    }

    @Override
    void run() {
        System.out.println("Benz is running."); // 改写父类的 run() 方法
    }

}

class BMW extends Car {
    @Override
    void run() {
        System.out.println("BMW is running."); // 改写父类的 run() 方法
    }

}
