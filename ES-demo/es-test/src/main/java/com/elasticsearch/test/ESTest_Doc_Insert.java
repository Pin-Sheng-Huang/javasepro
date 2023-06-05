package com.elasticsearch.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-08 12:39
 * @LastEditTime: 2023-03-08 12:39
 */
//
//先到bat 打開連線
public class ESTest_Doc_Insert {
    public static void main(String[] args) throws Exception {
        //創建es客戶端
/*        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );*/
        //插入数据
//        IndexRequest request = new IndexRequest();
//        request.index("user").id("1001");
//
//        User user = new User();
//        user.setName("李四");
//        user.setSex("女");
//        user.setTel("0911501335");
//        user.setHobbit("打手枪");

        //把ES数据转换成json格式(jackson.databind) pom檔要加上这个配置
//        ObjectMapper mapper = new ObjectMapper();
//        String userJson = mapper.writeValueAsString(user);
//        request.source(userJson, XContentType.JSON);//request.source 数据源请求
//
//        IndexResponse response = esClient.index(request, RequestOptions.DEFAULT);
//        System.out.println(response.getResult());
//插入数据方法2
/*        Map<String, Object> user = new HashMap<>();
        user.put("name", "李四");
        user.put("sex", "女");
        user.put("tel", "0911501335");
        user.put("hobbit", "打手枪");
        IndexRequest request = new IndexRequest("user").id("1001").source(user);

        IndexResponse response = esClient.index(request, RequestOptions.DEFAULT);
        System.out.println(response.getResult());
*/
        //       esClient.close();
        RestHighLevelClient esClient = null;
        try {
            // 建立 ES 客户端
            esClient = new RestHighLevelClient(
                    RestClient.builder(new HttpHost("localhost", 9200, "http"))
            );

            // 准备插入数据
            IndexRequest request = new IndexRequest("user1");
            request.id("10010");

            User user = new User();
            user.setName("李四");
            user.setSex("女1");
            user.setTel("0911501335");
            user.setHobbit("打枪_");

            // 转换为 JSON 格式
            ObjectMapper mapper = new ObjectMapper();
            String userJson = mapper.writeValueAsString(user);

            request.source(userJson, XContentType.JSON);

            // 发送请求
            IndexResponse response = esClient.index(request, RequestOptions.DEFAULT);

            // 输出结果
            System.out.println(response.getResult());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (esClient != null) {
                    esClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
