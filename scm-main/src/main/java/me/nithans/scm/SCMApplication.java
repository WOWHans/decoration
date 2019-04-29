package me.nithans.scm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:spring/appContext.xml")
public class SCMApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCMApplication.class, args);
    }

}

