package work_TOKEN_RandomStringGenerator;

import lombok.Value;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-11 12:54
 * @LastEditTime: 2023-07-11 12:54
 */

public class DGapi {
//    /** url **/
//    private String url;
    /** API key **/
    private String key ="970aad9561434bddbe14ccf8543ef0eb";
    /** agentName **/
    private String agentName = "DG023002HT";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public  static void main(String[] args) {
        DGapi d = new DGapi();

        String random = UUID.randomUUID().toString();
        String token = DGapi.MD5(d.getAgentName() + d.getKey() + random);
        System.out.println("random: "+random);
        System.out.println("token: "+token);
    }


    //MD5生成
    public static String MD5(String sourceStr) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes("UTF-8"));
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
