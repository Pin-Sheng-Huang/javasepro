package JwtUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-05-05 15:18
 * @LastEditTime: 2023-05-05 15:18
 */

public class test2 {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        String secretKey = "mysecretkey";

// 根据 secretKey 生成 Key
        KeySpec keySpec = new PBEKeySpec(secretKey.toCharArray(), secretKey.getBytes(), 65536, 256);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] secretKeyBytes = keyFactory.generateSecret(keySpec).getEncoded();
        Key key = new SecretKeySpec(secretKeyBytes, SignatureAlgorithm.HS256.getJcaName());

// 使用 Key 对 JWT 进行签名和加密
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 10000);
        Date expirationDate = calendar.getTime();
        String token = Jwts.builder()
                .setIssuer("Adonis")
                .setSubject("UU")
//                .setAudience("loveforever")
//                .setIssuedAt(new Date(520131400000L))
//                .setAudience("一万年")
//                .setExpiration(new Date(System.currentTimeMillis() + 60000))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
        System.out.println(token);
        try {
            Jwts.parser().setSigningKey(key).parseClaimsJws(token);
            System.out.println("验证成功");
        } catch (JwtException e) {
            System.out.println("验证失败");
            e.printStackTrace();
        }
        //解析
        Claims body = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(token)
                .getBody();
        System.out.println(body);

    }
}
