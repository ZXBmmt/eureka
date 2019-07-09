package com.mmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppEureka {

	public static void main(String[] args) {
		final SpringApplication application = new SpringApplication(AppEureka.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run(args);
	}
}
