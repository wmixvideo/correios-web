package com.github.wmixvideo.correiosweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CorreiosWebApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(CorreiosWebApplication.class, args);
	}
}
