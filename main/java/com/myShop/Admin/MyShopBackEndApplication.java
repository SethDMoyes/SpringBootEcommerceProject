package com.myShop.Admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.myShop.common.entity", "com.myShop.Admin.User"})
public class MyShopBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShopBackEndApplication.class, args);
	}

}
