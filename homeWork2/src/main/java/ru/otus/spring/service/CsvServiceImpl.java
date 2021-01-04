package ru.otus.spring.service;

import ru.otus.spring.dao.CsvDao;
import ru.otus.spring.domain.Person;
import ru.otus.spring.domain.Questions;

import java.io.IOException;
import java.util.Scanner;

public class CsvServiceImpl implements CsvService {
    private final CsvDao dao;

    public CsvServiceImpl(CsvDao dao) {
        this.dao = dao;
    }

    public void startTest() throws IOException {
        Person person = interNameLastName();
        Scanner scanner = new Scanner(System.in);
        int numberQuestions = 0;
        int numberAnswer;
        int trueAnswer = 0;
        for (Questions questions : dao.getQuestions()) {
            System.out.println(numberQuestions++ + ". " +questions.getQuestion());
            for (int i = 0; i < questions.getAnswer().size(); i++) {
                System.out.println("   " + i + ". " + questions.getAnswer().get(i));
            }
            numberAnswer = scanner.nextInt();
            if (numberAnswer == questions.getTrueAnswer()) {
                trueAnswer++;
            }
        }
        System.out.println(person.getLastName() + " " + person.getName() + ",");
        System.out.println("из " + numberQuestions + " вопросов " + "количество правльных ответов: " + trueAnswer);
    }
    public Person interNameLastName() {
        String name;
        String lastName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("What is your last name?");
        lastName = scanner.nextLine();
        return dao.findName(name, lastName);
    }


}
