package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class CommenMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommenMapperApplication.class, args);
    }

}
