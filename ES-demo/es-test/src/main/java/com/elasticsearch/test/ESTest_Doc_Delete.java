package com.elasticsearch.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

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
public class ESTest_Doc_Delete {
    public static void main(String[] args) throws Exception {
        RestHighLevelClient esClient = null;
        try {
            // 建立 ES 客户端
            esClient = new RestHighLevelClient(
                    RestClient.builder(new HttpHost("localhost", 9200, "http"))
            );
            DeleteRequest request = new DeleteRequest();
            request.index("user1").id("1001");
            DeleteResponse response = esClient.delete(request, RequestOptions.DEFAULT);
            System.out.println(response.toString());
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
