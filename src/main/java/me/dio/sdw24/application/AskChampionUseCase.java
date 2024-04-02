package me.dio.sdw24.application;

import me.dio.sdw24.domain.exception.ChampionNotFoundException;
import me.dio.sdw24.domain.model.Champion;
import me.dio.sdw24.domain.ports.ChampionsRepository;

import java.util.Optional;

public record AskChampionUseCase(ChampionsRepository championsRepository) {


    public String askChampion(Long championId, String question) {
        Champion champion = championsRepository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        // TODO: Evoluir a regra de negócio para considerar a integração com IAs Generativas.
        return champion.generateContextByQuestion(question);
    }

}
