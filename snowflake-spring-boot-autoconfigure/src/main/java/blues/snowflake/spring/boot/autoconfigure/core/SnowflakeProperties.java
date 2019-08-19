package blues.snowflake.spring.boot.autoconfigure.core;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "snow.flake")
public class SnowflakeProperties {

    public static final String PREFIX = "snow.flake";

    private Long start;

    private Integer data;

    private Integer work;

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }
}
