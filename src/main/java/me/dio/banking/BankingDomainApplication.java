package me.dio.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BankingDomainApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingDomainApplication.class, args);
    }
}
