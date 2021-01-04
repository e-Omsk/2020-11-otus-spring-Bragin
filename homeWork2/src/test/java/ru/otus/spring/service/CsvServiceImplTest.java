package ru.otus.spring.service;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import ru.otus.spring.dao.CsvDao;

public class CsvServiceImplTest {

    @Mock
    private CsvDao csvDao;
    private CsvService csvService;

    @BeforeEach
    void setUp() {
        csvService = new CsvServiceImpl(csvDao);
    }

}
