package com.mobile.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class MobileApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MobileApplication.class, args);
	}

}
