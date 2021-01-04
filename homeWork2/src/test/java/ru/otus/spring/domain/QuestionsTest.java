package ru.otus.spring.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Клас Questions")
public class QuestionsTest {

    @DisplayName("корректно создается конструктор")
    @Test
    void shouldHaveCorrectConstructor() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Answer");
        Questions questions = new Questions("What have i do?",
                map,
                1);
        assertEquals("What have i do?", questions.getQuestion());
        assertEquals(map, questions.getAnswer());
        assertEquals(1, questions.getTrueAnswer());
    }
}
