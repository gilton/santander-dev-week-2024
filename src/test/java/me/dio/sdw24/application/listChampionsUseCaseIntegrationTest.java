package me.dio.sdw24.application;


import me.dio.sdw24.domain.model.Champion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class listChampionsUseCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase listChampioinsUseCase;

    @Test
    public void listChampions_testSuccess() {
        List<Champion> championList = listChampioinsUseCase.findAll();
        assertEquals(12, championList.size());
    }
}
