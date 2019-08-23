package cn.guoyibin.boot.snowflake.autoconfigure.annotation;

import cn.guoyibin.boot.snowflake.autoconfigure.SnowflakeAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/**
 * 引入雪花算法的注解
 *
 * @author guoyibin
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SnowflakeAutoConfiguration.class)
public @interface EnableSnowflake {

}
