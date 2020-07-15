package com.ozymern.spring.microservices.commons;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//excluir datasource, para que no sea necesario tener h2 u otram base de datos
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringMicroservicesCommonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesCommonsApplication.class, args);
    }

}
