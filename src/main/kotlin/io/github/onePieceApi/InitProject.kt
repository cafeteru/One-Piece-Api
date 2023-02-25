package io.github.onePieceApi

import io.github.onePieceApi.model.Character
import io.github.onePieceApi.repositories.CharacterRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class InitProject constructor(
    private val characterRepository: CharacterRepository
) {

    @PostConstruct
    fun init() {
        val luffy = Character()
        luffy.surname = "Monkey"
        luffy.name = "D. Luffy"

        characterRepository.save(luffy)
    }
}
