package com.yp.redisdistributedlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class RedisDistributedLockApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDistributedLockApplication.class, args);
	}

}
