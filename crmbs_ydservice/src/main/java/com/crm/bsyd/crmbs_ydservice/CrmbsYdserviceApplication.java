package com.crm.bsyd.crmbs_ydservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.crm.bsyd.crmbs_ydservice.mapper") //扫描的mapper
//如果没有配置数据库 需要把数据库exclude掉
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CrmbsYdserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmbsYdserviceApplication.class, args);
	}

}
