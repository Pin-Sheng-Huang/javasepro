package work_TOKEN_RandomStringGenerator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/**
DG踢人token
 */

public class RandomStringGenerator {
    public static String generateToken(String agentAccount, String apiKey, String randomString) {
        String tokenData = agentAccount + apiKey + randomString;
        try {
            MessageDigest md5Digest = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md5Digest.digest(tokenData.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            return "token=" + stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String agentAccount = "DG023002K95A45926147"; // 替换为实际的代理账号
        String apiKey = "https://api1.smaklick.com"; // 替换为实际的API key
        String randomString = "abc123"; // 替换为实际的随机字符串
        String token = generateToken(agentAccount, apiKey, randomString);
        System.out.println("Token: " + token);
    }
}
