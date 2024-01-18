import java.security.SecureRandom;
import java.util.Base64;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-10 18:55
 * @LastEditTime: 2023-07-10 18:55
 */

public class RandomStringGenerator {
    private static final int RANDOM_STRING_LENGTH = 16;

    public static String generateRandomString() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[RANDOM_STRING_LENGTH];
        secureRandom.nextBytes(randomBytes);
        return Base64.getEncoder().encodeToString(randomBytes);
    }

    public static void main(String[] args) {
        String randomString = generateRandomString();
        System.out.println("Random String: " + randomString);

    }
}
