package aoptest.config;

import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-15 18:23
 * @LastEditTime: 2023-07-15 18:23
 */
@Configuration
@ComponentScan("aoptest")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}


