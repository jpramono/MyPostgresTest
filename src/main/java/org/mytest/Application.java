package org.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
//    @IntegrationComponentScan
    @EnableIntegration
    @EnableAutoConfiguration
public class Application {

    public static void main(String Args[]){
        SpringApplication.run(Application.class, Args);
    }
}
