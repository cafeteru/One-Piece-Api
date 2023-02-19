package io.github.onepieceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.onepieceapi.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
