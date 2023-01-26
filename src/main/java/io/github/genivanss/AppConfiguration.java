package io.github.genivanss;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration; //trocada pela annotation @Development que foi customizada
//import org.springframework.context.annotation.Profile;//trocada pela annotation @Development que foi customizada

//@Configuration //trocada pela annotation @Development que foi customizada
//@Profile("development") //trocada pela annotation @Development que foi customizada
@Development //annotation customizada
public class AppConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

    /*//código anterior ao uso do application.properties
    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }*/


    
}
