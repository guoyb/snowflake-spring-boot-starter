package cn.guoyibin.boot.snowflake.autoconfigure;

import cn.guoyibin.boot.snowflake.autoconfigure.core.Snowflake;
import cn.guoyibin.boot.snowflake.autoconfigure.core.SnowflakeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SnowflakeProperties.class)
public class SnowflakeAutoConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(SnowflakeAutoConfiguration.class);

    @Bean
    @ConditionalOnProperty(prefix = SnowflakeProperties.PREFIX,name = "start")
    public Long start(SnowflakeProperties snowflakeProperties) {
        return snowflakeProperties.getStart();
    }

    @Bean
    @ConditionalOnProperty(prefix = SnowflakeProperties.PREFIX,name = "data")
    public Integer data(SnowflakeProperties snowflakeProperties) {
        return snowflakeProperties.getData();
    }


    @Bean
    @ConditionalOnProperty(prefix = SnowflakeProperties.PREFIX,name = "work")
    public Integer work(SnowflakeProperties snowflakeProperties) {
        return snowflakeProperties.getWork();
    }


    @Bean
    public Snowflake snowflake(SnowflakeProperties snowflakeProperties){
        Snowflake snowflake = new Snowflake();
        if (snowflakeProperties.getStart() != null) {
            snowflake.setSTART_TIME(snowflakeProperties.getStart());
        }
        if (snowflakeProperties.getData() != null){
            snowflake.setDATA_ID(snowflakeProperties.getData());
        }
        if (snowflakeProperties.getWork() != null){
            snowflake.setWORK_ID(snowflakeProperties.getWork());
        }
        logger.info("雪花算法starter组件加载完成！");
        return snowflake;
    }
}
