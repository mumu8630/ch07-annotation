package com.nuc.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nuc.annotation.mapper")
public class AnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationApplication.class, args);
    }

}
