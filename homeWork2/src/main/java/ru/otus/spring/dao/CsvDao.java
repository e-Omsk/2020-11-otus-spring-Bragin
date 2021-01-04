package ru.otus.spring.dao;

import ru.otus.spring.domain.Person;
import ru.otus.spring.domain.Questions;

import java.io.IOException;
import java.util.List;

public interface CsvDao {
    public Person findName(String name, String secondName);
    public List<Questions> getQuestions() throws IOException;
}
