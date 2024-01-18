package TestDemo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-27 20:03
 * @LastEditTime: 2023-06-27 20:03
 */

public class RedPacketGame {
    public static void main(String[] args) {
        List<Integer> employeeAmounts = distributeRedPacketAmounts(200, 40, 1, 100);

        int totalAmount = 0;
        // 打印每个员工获得的红包金额
        for (int i = 0; i < employeeAmounts.size(); i++) {
            int amount = employeeAmounts.get(i);
            totalAmount += amount;
            System.out.println("员工" + (i + 1) + "获得红包金额：" + amount + "元");
        }
        System.out.println("发放总金额：" + totalAmount + "元");
    }

    // 将红包金额分配给员工
    private static List<Integer> distributeRedPacketAmounts(int totalAmount, int employeeCount, int minAmount, int maxAmount) {
        List<Integer> distributedAmounts = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < employeeCount; i++) {
            int remainingAmount = totalAmount - (employeeCount - i - 1) * minAmount;
            int amount = random.nextInt(remainingAmount - minAmount + 1) + minAmount;
            amount = Math.min(amount, maxAmount);

            totalAmount -= amount;
            distributedAmounts.add(amount);
        }

        return distributedAmounts;
    }
}

