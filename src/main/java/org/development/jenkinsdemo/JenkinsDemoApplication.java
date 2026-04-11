package org.development.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        System.out.println("hello from maven");
        System.out.println("hello from maven , check 1");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
