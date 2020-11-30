package ru.otus.spring.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDaoImpl implements CsvDao {
    private final String nameFile;
    private List<String> questions = new ArrayList<String>();

    public CsvDaoImpl(String nameFile) {
        this.nameFile = nameFile;
    }
    public List<String> getQuestions() throws IOException {
        BufferedReader  reader = new BufferedReader(new FileReader(nameFile));
        String line = null;
        while ((line = reader.readLine()) != null) {
            questions.add(line);
        }
        reader.close();
        return questions;
    }
}
