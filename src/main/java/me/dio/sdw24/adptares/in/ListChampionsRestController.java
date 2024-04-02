package me.dio.sdw24.adptares.in;


import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import me.dio.sdw24.application.ListChampionsUseCase;
import me.dio.sdw24.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "/campeões", description = "Endpoint do domínio de Campeões LOL")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase userCase) {

    @GetMapping
    public List<Champion> findAllChampions() {
        return userCase.findAll();
    }
}