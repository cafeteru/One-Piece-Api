package io.github.onePieceApi.services.impl

import io.github.onePieceApi.model.Character
import io.github.onePieceApi.repositories.CharacterRepository
import io.github.onePieceApi.services.CharacterService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class CharacterServiceImpl constructor(
    private val characterRepository: CharacterRepository
) : CharacterService {

    override fun getAll(pageable: Pageable): Page<Character> {
        return characterRepository.findAll(pageable)
    }

}
