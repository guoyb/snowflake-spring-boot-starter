# snowflake-spring-boot-starter

#### 介绍
雪花算法发号器，自定义starter



#### 使用说明

1. 在启动类新增注解 @EnableSnowflake 
2. 直接在类中注入 Snowflake 类，调用genId即可生成雪花id

3. 默认开始时间为 2015-01-01 00:00:00 
4. 可以定义属性 snow.flake.start 自定义开始时间
5. 默认会根据本机的hostip和hostname获取数据中心id和机器id

6. 可以自定义属性 snow.flake.data 设置数据中心id，范围0-31（包含）
7. 可以自定义属性 snow.flake.work 设置机器id，范围0-31（包含）




#### 适用版本

2.1.5.RELEASE

