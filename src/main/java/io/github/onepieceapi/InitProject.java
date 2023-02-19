package io.github.onepieceapi;

import org.springframework.stereotype.Service;

import io.github.onepieceapi.constants.Urls;
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
        Character luffy = new Character();
        luffy.setSurname("Monkey");
        luffy.setName("D. Luffy");

        Character zoro = new Character();
        zoro.setSurname("Roronoa");
        zoro.setName("Zoro");

        characterRepository.save(luffy);
        characterRepository.save(zoro);
    }
}
