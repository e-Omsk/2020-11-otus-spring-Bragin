package ru.otus.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring.dao.CsvDao;
import ru.otus.spring.service.CsvService;
import ru.otus.spring.service.CsvServiceImpl;

@Configuration
public class ServicesConfig {

    @Bean
    public CsvService csvService(CsvDao csvDao) {
        return new CsvServiceImpl(csvDao);
    }
}
