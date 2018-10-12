package com.imooc.cloudeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lizj
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurakaApplication.class, args);
    }
}
