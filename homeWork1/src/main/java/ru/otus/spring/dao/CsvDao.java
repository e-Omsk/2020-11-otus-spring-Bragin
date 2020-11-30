package ru.otus.spring.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CsvDao {
    public List<String> getQuestions() throws IOException;
}
