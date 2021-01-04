package ru.otus.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.otus.spring.dao.CsvDaoImpl;

@PropertySource("classpath:application.properties")
@Configuration
public class DaoConfig {

    @Value("${db.url}")
    private String fileName;

    @Bean
    public CsvDaoImpl csvDao() {return new CsvDaoImpl(fileName);
    }
}
