package com.elasticsearch.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-08 12:39
 * @LastEditTime: 2023-03-08 12:39
 */
//
//先到bat 打開連線
public class ESTest_Index_Delete {
    public static void main(String[] args) throws Exception {
        //創建es客戶端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );
        //查询索引
        DeleteIndexRequest request = new DeleteIndexRequest("user");
        AcknowledgedResponse deleteIndexResponse = esClient.indices().delete(request, RequestOptions.DEFAULT);
        //響應狀態
        System.out.println(deleteIndexResponse.isAcknowledged());
        esClient.close();
    }
}
