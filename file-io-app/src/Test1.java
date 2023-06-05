import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-05-04 19:43
 * @LastEditTime: 2023-05-04 19:43
 */

public class Test1 {
    public static void main(String[] args) {
        Map<String, Object> mp = new HashMap<>();
        mp.put("id",1);
        mp.put("name","Adonis");

        String secretKey = "your-secret-key"; // 这里替换成你自己的密钥
        // 创建 JWT 的构建器
       JwtBuilder builder = Jwts.builder();
        System.out.println(secretKey);

    }
}
