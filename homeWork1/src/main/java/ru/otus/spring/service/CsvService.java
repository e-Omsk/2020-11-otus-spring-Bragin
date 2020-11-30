package ru.otus.spring.service;

import java.io.IOException;
import java.util.List;

public interface CsvService {
    public List<String> getQuestions() throws IOException;
}
