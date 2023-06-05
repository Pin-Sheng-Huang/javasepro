package D_RSA;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-06 12:39
 * @LastEditTime: 2023-03-06 12:39
 */

public class RSAExample {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        //生成公钥和私钥
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");//生成RSA密钥对
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");//生成安全随机数生成器
        keyGen.initialize(2048, random);//初始化密钥对生成器，设置密钥长度为2048位，使用随机数生成器生成种子
        KeyPair pair = keyGen.generateKeyPair();//生成密钥对
        PrivateKey privateKey = pair.getPrivate();//获取私钥
        PublicKey publicKey = pair.getPublic();//和公钥
        //使用公钥进行加密
        String plaintext = "Hello, World!";
        Cipher cipher = Cipher.getInstance("RSA");//创建一个RSA密码器实例，设置为加密模式，
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);//使用公钥进行初始化
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());//将明文字符串转换为字节数组，加密并存储在字节数组encrypted中

        System.out.println("原本: " + new String(encrypted));

        //使用私钥进行解密
//        Cipher cipher_remove = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);//创建一个RSA密码器实例，设置为解密模式,使用私钥进行初始化
        byte[] decrypted = cipher.doFinal(encrypted);//将密文数组解密并存储在字节数组decrypted中
        String decryptedText  = new String(decrypted);//将字节数组转换为字符串

        // Print the original message and the decrypted message
        System.out.println("Decrypted message: " + decryptedText);

    }
}
