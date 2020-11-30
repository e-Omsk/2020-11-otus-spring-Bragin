package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.dao.CsvDao;
import ru.otus.spring.dao.CsvDaoImpl;
import ru.otus.spring.service.CsvService;
import ru.otus.spring.service.CsvServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        CsvService service = context.getBean(CsvService.class);
        for(String st : service.getQuestions()) {
            System.out.println(st);
        }
        context.close();
    }
}
