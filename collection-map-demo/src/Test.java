import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.text.MessageFormat;
import java.util.ArrayList;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-23 16:07
 * @LastEditTime: 2023-04-23 16:07
 */

public class Test {
    private  static final String CONNECT_TIMEOUT = "--connect-timeout 30 --max-time 30 ";
    private static String osName ="windows";
    private static final String HEADER = "-H 'Content-Type:application/x-www-form-urlencoded'";
    public static void main(String[] args) {
        String params = MessageFormat.format("vendor_id={0}&version_key={1}", "7flsh9zy49", "258753642");
        String betUrl = MessageFormat.format("{0}{1}{2}", "http://q6v8api.cl668.com/", "/api/GetBetDetail?", params);
        System.out.println("params"+params);
        System.out.println("betUrl"+betUrl);
        ProcessBuilder pb = new ProcessBuilder(getCmdsPOSTheadJson(HEADER,params,betUrl));
        pb.redirectErrorStream(true);
        BufferedInputStream bufferedRead = null;
        System.out.println(pb);
    }
//    public static <JSONObject> JSONObject readPOSTheadJson(String head, String param, String url) throws Exception {
//        long start = System.currentTimeMillis();
//        ProcessBuilder pb = new ProcessBuilder(getCmdsPOSTheadJson(head, param, url));
//        pb.redirectErrorStream(true);
//        BufferedInputStream bufferedRead = null;
//        return getJsonObject(pb, bufferedRead, start);
//    }
    public static String[] getCmdsPOSTheadJson(String head, String param, String url) {
        String cmd = "curl -s"+CONNECT_TIMEOUT+"-L {0} -d {1} {2}";
        param = "\"" + param + "\"";//被加上了引号，是为了在命令行中执行该命令时，参数可以被正确地解析和识别
        url = "\"" + url + "\"";
        String cmdTemp = MessageFormat.format(cmd, head, param, url);
        System.out.println(("getCmdsPOSTheadJson cmdTemp ==> " + cmdTemp));
        return getOsCmd(cmdTemp);
    }
    private static String[] getOsCmd(String cmdTemp) {
        if (osName.equals("windows")) {
            String[] cmds = {"cmd", "/c", cmdTemp};
            return cmds;
        } else {
            return partitionCommandLine(cmdTemp);
        }
    }
        public static String[] partitionCommandLine (final String command) {
            final ArrayList<String> commands = new ArrayList<>();

            int index = 0;

            StringBuffer buffer = new StringBuffer(command.length());

            boolean isApos = false;
            boolean isQuote = false;
            while (index < command.length()) {
                final char c = command.charAt(index);

                switch (c) {
                    case ' ':
                        if (!isQuote && !isApos) {
                            final String arg = buffer.toString();
                            buffer = new StringBuffer(command.length() - index);
                            if (arg.length() > 0) {
                                commands.add(arg);
                            }
                        } else {
                            buffer.append(c);
                        }
                        break;
                    case '\'':
                        if (!isQuote) {
                            isApos = !isApos;
                        } else {
                            buffer.append(c);
                        }
                        break;
                    case '"':
                        if (!isApos) {
                            isQuote = !isQuote;
                        } else {
                            buffer.append(c);
                        }
                        break;
                    default:
                        buffer.append(c);
                }

                index++;
            }

            if (buffer.length() > 0) {
                final String arg = buffer.toString();
                commands.add(arg);
            }
            return commands.toArray(new String[commands.size()]);
        }

//    private static JSONObject getJsonObject(ProcessBuilder pb, BufferedInputStream bufferedRead, long start)
//            throws IOException, InterruptedException, JSONException, SocketTimeoutException {
//        Process p;
//        String result = null;
//        try {
//            p = pb.start();
//            bufferedRead = new BufferedInputStream(p.getInputStream());
//            result = IOUtils.toString(bufferedRead, "utf-8");
//            p.waitFor();
//            p.destroy();
//            String resultStr = result.length() > 1000 ? result.substring(0, 1000) : result;
//            logger.info("获取的结果 ：" + resultStr);
//            if (null != result && !("".equals(result))) {
//                return new JSONObject(result);
//            } else {
//                checkIsTimeOut(start, null);
//                return null;
//            }
//        } catch (JSONException e) {
//            logger.error("错误的报文:{} {}", result, pb.command().toString());
//            throw e;
//        } finally {
//            if (null != bufferedRead) {
//                bufferedRead.close();
//            }
//        }
//    }
}
