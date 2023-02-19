package io.github.onepieceapi.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.github.onepieceapi.model.Character;
import io.github.onepieceapi.repositories.CharacterRepository;
import io.github.onepieceapi.services.CharacterService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;

    @Override
    public Page<Character> getAll(Pageable pageable) {
        return characterRepository.findAll(pageable);
    }
}
