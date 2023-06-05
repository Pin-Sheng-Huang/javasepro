package com.elasticsearch.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
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
public class ESTest_Doc_Insert_Batch {
    public static void main(String[] args) throws Exception {

        RestHighLevelClient esClient = null;
        try {
            // 建立 ES 客户端
            esClient = new RestHighLevelClient(
                    RestClient.builder(new HttpHost("localhost", 9200, "http"))
            );

            //批量插入数据
            BulkRequest request = new BulkRequest();

            request.add(new IndexRequest().index("user").id("101").source(XContentType.JSON,"name","皇阿玛1","age",30,"sex","男"));
            request.add(new IndexRequest().index("user").id("102").source(XContentType.JSON,"name","皇阿玛2","age",310,"sex","男","hobby","游泳"));
            request.add(new IndexRequest().index("user").id("103").source(XContentType.JSON,"name","皇阿玛3","age",310,"sex","男","hobby","游泳"));
            request.add(new IndexRequest().index("user").id("104").source(XContentType.JSON,"name","皇阿玛4","age",310,"sex","男","hobby","游泳"));
            request.add(new IndexRequest().index("user").id("105").source(XContentType.JSON,"name","皇阿玛5","age",310,"sex","男","hobby","游泳"));
            request.add(new IndexRequest().index("user").id("106").source(XContentType.JSON,"name","皇阿玛6","age",310,"sex","女","hobby","游泳"));
            BulkResponse responses = esClient.bulk(request, RequestOptions.DEFAULT);
            System.out.println(responses.getTook());
            System.out.println(responses.getItems());

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
