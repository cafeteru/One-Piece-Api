package io.github.onepieceapi;

import org.springframework.stereotype.Service;

import io.github.onepieceapi.model.Character;
import io.github.onepieceapi.repositories.CharacterRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class InitProject {
    private CharacterRepository characterRepository;

    @PostConstruct
    public void init() {
        log.info("Project initialized");
        var character = Character.builder().surname("Monkey").name("D. Luffy").build();
        characterRepository.save(character);
    }
}
