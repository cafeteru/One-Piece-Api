package io.github.onepieceapi.controllers;

import static io.github.onepieceapi.constants.Urls.ALL_URL;
import static io.github.onepieceapi.constants.Urls.CHARACTER_URL;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.onepieceapi.model.Character;
import io.github.onepieceapi.services.CharacterService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(CHARACTER_URL)
@AllArgsConstructor
public class CharacterController {
    private final CharacterService characterService;

    @GetMapping(ALL_URL)
    public ResponseEntity<Page<Character>> getCharacter(Pageable pageable) {
        return ResponseEntity.ok(characterService.getAll(pageable));
    }
}
