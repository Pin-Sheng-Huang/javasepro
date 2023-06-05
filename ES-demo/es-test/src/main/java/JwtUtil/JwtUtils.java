package JwtUtil;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-05-05 14:16
 * @LastEditTime: 2023-05-05 14:16
 */

public class JwtUtils {


    public static void main(String[] args) {
        String secretKey = "my-sexy-dick";
        JwtBuilder builder = Jwts.builder().setIssuer("Adonis")
                .setSubject("UUCHEN")
                .setAudience("MYBABE")
                .setExpiration(new Date(System.currentTimeMillis()+3600000))
                .setIssuedAt(new Date());;
        // 添加 JWT 的标准声明（例如发行人、主题、受众等）
        builder.setIssuer("Adonis")
                .setSubject("UUCHEN")
                .setAudience("MYBABE")
                .setExpiration(new Date(System.currentTimeMillis()+3600000))
                .setIssuedAt(new Date());
        // 添加自定义声明（例如用户 ID 等）
        builder.claim("user_id", "123456");
        // 使用密钥对 JWT 进行签名
        byte[] secretKeyBytes = secretKey.getBytes();
        SecretKeySpec keySpec = new SecretKeySpec(secretKeyBytes, "HmacSHA256");

        Key key = new SecretKeySpec(secretKeyBytes, SignatureAlgorithm.HS256.getJcaName());


        String token = Jwts.builder()
                .setSubject("user123").signWith(SignatureAlgorithm.HS256, key).compact();

        System.out.println("JWT Token: " + token);

        // 解析 JWT
        Jws<Claims> claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token);

        System.out.println("Issuer: " + claims.getBody().getIssuer());
        System.out.println("Subject: " + claims.getBody().getSubject());
        System.out.println("Audience: " + claims.getBody().getAudience());
        System.out.println("Expiration: " + claims.getBody().getExpiration());
        System.out.println("Issued At: " + claims.getBody().getIssuedAt());
        System.out.println("User ID: " + claims.getBody().get("user_id"));
    }
}
