package ru.otus.spring.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person")
public class PersonTest {

    @DisplayName("корректно создается конструктором")
    @Test
    void shouldHaveCorrectConstructor() {
        Person person = new Person("Max", "Zinger");
        assertEquals("Max", person.getName());
        assertEquals("Zinger", person.getLastName());
    }
}
