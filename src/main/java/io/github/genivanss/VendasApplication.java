package io.github.genivanss;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import io.github.genivanss.domain.entity.Cliente;

import io.github.genivanss.domain.repositorio.Clientes;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            Cliente cliente1 = new Cliente("Genivan");
            clientes.salvar(cliente1);

            Cliente cliente2 = new Cliente("Maria");
            clientes.salvar(cliente2);

            List<Cliente> todosClientes = (List<Cliente>) clientes.obterTodos();
            todosClientes.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
