package io.github.onepieceapi.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.github.onepieceapi.model.Character;

@Service
public interface CharacterService {
    Page<Character> getAll(Pageable pageable);
}
