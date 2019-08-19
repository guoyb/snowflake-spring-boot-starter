package blues.snowflake.spring.boot.autoconfigure.annotation;

import blues.snowflake.spring.boot.autoconfigure.SnowflakeAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SnowflakeAutoConfiguration.class)
public @interface EnableSnowflake {
}
