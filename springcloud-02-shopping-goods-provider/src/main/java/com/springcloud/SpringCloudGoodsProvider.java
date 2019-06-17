package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.springcloud.dao") //设置Mybatis接口所在的位置
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudGoodsProvider {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGoodsProvider.class, args);
	}

}
