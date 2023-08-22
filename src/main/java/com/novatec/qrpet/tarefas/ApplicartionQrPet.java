package com.novatec.qrpet.tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.novatec.qrpet.tarefas.controller", "com.novatec.qrpet.tarefas.service", "com.novatec.qrpet.tarefas.dto", "com.novatec.qrpet.tarefas.interfaces", "com.novatec.qrpet.tarefas.configuration"})
public class ApplicartionQrPet {
    public static void main(String[] args) {
        SpringApplication.run(ApplicartionQrPet.class, args);
        System.out.println("Esta rodando");

    }
}
