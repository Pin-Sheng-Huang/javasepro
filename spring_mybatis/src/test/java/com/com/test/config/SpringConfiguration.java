package spring_mybatis.src.test.java.com.com.test.config;

import com.com.test.config.DataSourceConfiguration;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-07 17:04
 * @LastEditTime: 2023-07-07 17:04
 */
//标志该类是Spring的核心配置类
@Configuration
//<context:component-scan base-package="com.com.test"></context:component-scan>-
@ComponentScan("com.com.test")//掃描哪個包底下的
@Import(DataSourceConfiguration.class)//加載多個文件,多個的話就用逗號分隔
public class SpringConfiguration {

}
