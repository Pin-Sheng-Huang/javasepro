import java.util.Scanner;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-15 22:34
 * @LastEditTime: 2023-04-15 22:34
 */

public class ID {

        // 身份证字号验证的正则表达式
        private static final String ID_CARD_LETTER_REGEX = "^[A-Z]{1}[0-9]{9}$";
        // 身份证号码验证的正则表达式
        private static final String ID_CARD_NUMBER_REGEX = "^[0-9]{9}$";

        /**
         * 验证台湾身份证号码是否合法
         * @param idCard 台湾身份证号码
         * @return true表示合法，false表示不合法
         */
        public static boolean isValidTaiwanIdCard(String idCard) {
            String numberPart = idCard.substring(1, 10);
            System.out.println(numberPart);
            if (idCard == null || idCard.length() != 10 || !idCard.matches(ID_CARD_LETTER_REGEX) || ! numberPart.matches(ID_CARD_NUMBER_REGEX)
                 || isValidChecksum(idCard)) {
                return false;
            }
            return true;
        }

        /**
         * 验证台湾身份证号码中的校验位是否合法
         * @param idCard 台湾身份证号码
         * @return true表示合法，false表示不合法
         */
        private static boolean isValidChecksum(String idCard) {
            String letterPart = idCard.substring(0, 1);
            int letterValue = letterPart.charAt(0) - 'A' + 10;
            String numberPart = idCard.substring(1, 10);
            char[] numberArray = numberPart.toCharArray();
            int[] factor = { 1, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
            int sum = letterValue / 10 + letterValue % 10 * 9;
            for (int i = 0; i < 9; i++) {
                sum += (numberArray[i] - '0') * factor[i];
            }
            return (sum % 10 == 0);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String p = sc.next();
            String idCard = "A123456789"; // 台湾身份证号码
            System.out.println("台湾身份证号码是否合法：" + isValidTaiwanIdCard(idCard));
            System.out.println(isValidTaiwanIdCard(p));
        }

}
