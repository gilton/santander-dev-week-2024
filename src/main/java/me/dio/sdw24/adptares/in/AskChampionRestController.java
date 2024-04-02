package me.dio.sdw24.adptares.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dio.sdw24.application.AskChampionUseCase;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Campeões", description = "Endpoint do domínio de Campeões LOL")
@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampionResponse(
            @PathVariable Long championId,
            @RequestBody AskChampionResquest question) {
        String answer = useCase.askChampion(championId, question.question());

        return new AskChampionResponse(answer);
    }

    public record AskChampionResquest(String question) { }
    public record AskChampionResponse(String answer) { }

}
