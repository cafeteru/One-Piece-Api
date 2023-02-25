package io.github.onePieceApi.services

import io.github.onePieceApi.model.Character
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface CharacterService {
    fun getAll(pageable: Pageable): Page<Character>
}
