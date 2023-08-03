package com.novatec.qrpet.tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.novatec.qrpet.tarefas.api", "com.novatec.qrpet.tarefas.service"})
public class ApplicartionQrPet {
    public static void main(String[] args) {
        SpringApplication.run(ApplicartionQrPet.class, args);
        System.out.println("Esta rodando");

    }
}
