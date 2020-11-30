package ru.otus.spring.service;

import ru.otus.spring.dao.CsvDao;
import ru.otus.spring.dao.CsvDaoImpl;

import java.io.IOException;
import java.util.List;

public class CsvServiceImpl implements CsvService {
    private final CsvDao dao;

    public CsvServiceImpl(CsvDao dao) {
        this.dao = dao;
    }
    public List<String> getQuestions() throws IOException {
        return dao.getQuestions();
    }
}
