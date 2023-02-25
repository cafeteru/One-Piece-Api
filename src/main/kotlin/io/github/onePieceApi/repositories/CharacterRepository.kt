package io.github.onePieceApi.repositories

import io.github.onePieceApi.model.Character
import org.springframework.data.jpa.repository.JpaRepository

interface CharacterRepository : JpaRepository<Character, Long> {
}
