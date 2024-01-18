package com.com.test.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-07 18:26
 * @LastEditTime: 2023-07-07 18:26
 */


//context:property-placeholder location="jdbc.properties"></context:property-placeholder>
@PropertySource("jdbc.properties")//指定要加载的属性文件路径
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.pwd}")
    private String pwd;

    @Bean("dataSource")//放在容器当中,Spring会将当前方法的返回值已指定名称存储到Spring容器
    public DataSource getdataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driver);
        ds.setJdbcUrl(url);
        ds.setUser(username);
        ds.setPassword(pwd);

//        ds.setDriverClass("com.mysql.jdbc.Driver");
//        ds.setJdbcUrl("jdbc:mysql://localhost:3306/db_uu");
//        ds.setUser("root");
//        ds.setPassword("123456");
        return ds;
    }


}
