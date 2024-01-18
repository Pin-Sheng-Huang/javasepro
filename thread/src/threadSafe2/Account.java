package threadSafe2;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-07 00:47
 * @LastEditTime: 2023-06-07 00:47
 */

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount, String name) {
        if (amount <= balance) {
            try {
                Thread.sleep(100); // 模擬其他耗時操作
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(name + " 取款金額：" + amount + "，剩餘餘額：" + balance);
        } else {
            System.out.println("餘額不足");
        }
    }
}

class WithdrawThread implements Runnable {
    private Account account;
    private int amount;
    private String name;

    public WithdrawThread(Account account, int amount, String name) {
        this.account = account;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        account.withdraw(amount, name);
    }
}

class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);

        Thread thread1 = new Thread(new WithdrawThread(account, 1000, "AV導演"));
        Thread thread2 = new Thread(new WithdrawThread(account, 1000, "AV女優"));
        Thread thread3 = new Thread(new WithdrawThread(account, 1000, "AV女優2"));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

