package io.github.onePieceApi.controllers

import io.github.onePieceApi.constants.Urls.ALL_URL
import io.github.onePieceApi.constants.Urls.CHARACTER_URL
import io.github.onePieceApi.model.Character
import io.github.onePieceApi.services.CharacterService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(CHARACTER_URL)
class CharacterController constructor(
    private val characterService: CharacterService
) {

    @GetMapping(ALL_URL)
    fun getCharacter(pageable: Pageable): ResponseEntity<Page<Character>> {
        val result = characterService.getAll(pageable)
        return ResponseEntity.ok(result)
    }
}
