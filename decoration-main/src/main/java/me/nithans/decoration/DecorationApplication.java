package me.nithans.decoration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource("classpath*:spring/appContext.xml")
public class DecorationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorationApplication.class, args);
    }

}

