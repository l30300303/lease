package main.com.liu.lease.common.mybatisplus;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.liu.lease.web.*.mapper")
public class MybatisPlusConfiguration {
}
