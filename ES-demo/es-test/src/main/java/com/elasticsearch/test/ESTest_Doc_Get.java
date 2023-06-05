package com.elasticsearch.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;


/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-08 12:39
 * @LastEditTime: 2023-03-08 12:39
 */
//
//先到bat 打開連線
public class ESTest_Doc_Get {
    public static void main(String[] args) throws Exception {
        RestHighLevelClient esClient = null;
        try {
            // 建立 ES 客户端
            esClient = new RestHighLevelClient(
                    RestClient.builder(new HttpHost("localhost", 9200, "http"))
            );

            // 准备查询数据
            GetRequest request = new GetRequest();
            request.index("user1").id("10010");

            // 发送请求
            GetResponse response = esClient.get(request, RequestOptions.DEFAULT);

            // 输出结果
            System.out.println(response.getSourceAsString());

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
