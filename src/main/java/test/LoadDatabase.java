package main.java.test;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Precargando " + repository.save(new Curso("5to Secundaria", "5B")));
            log.info("Precargando " + repository.save(new Curso("3ro Primaria", "3A")));
        };
    }
}
