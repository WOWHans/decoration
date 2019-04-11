package me.nithans.decoration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:spring/appContext.xml")
public class DecorationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorationApplication.class, args);
    }

}

