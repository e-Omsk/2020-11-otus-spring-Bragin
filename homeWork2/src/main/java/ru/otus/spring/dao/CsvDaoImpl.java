package ru.otus.spring.dao;

import ru.otus.spring.domain.Person;
import ru.otus.spring.domain.Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CsvDaoImpl implements CsvDao {
    private final String nameFile;
    private List<Questions> questions = new ArrayList<>();

    public CsvDaoImpl(String nameFile) {
        this.nameFile = nameFile;
    }

    public Person findName(String name, String lastName) {
        return new Person(name, lastName);
    }

    public List<Questions> getQuestions() throws IOException {
        BufferedReader  reader = new BufferedReader(new FileReader(nameFile));

        String line = null;
        Scanner scanner = null;

        while ((line = reader.readLine()) != null) {

            scanner = new Scanner(line);
            scanner.useDelimiter(",");

            String question = null;
            Map<Integer, String> answer = new HashMap<>();
            int trueAnswer = 0;

            while (scanner.hasNext()) {
                question = scanner.next().trim();
                for (int i = 0; i < 4; i++) {
                    answer.put(Integer.parseInt(scanner.next().trim()), scanner.next().trim());
                }
                trueAnswer = Integer.parseInt(scanner.next().trim());
            }
            questions.add(new Questions(question, answer, trueAnswer));
        }
        reader.close();
        return questions;
    }
}
