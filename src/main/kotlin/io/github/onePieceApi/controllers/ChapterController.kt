package io.github.onePieceApi.controllers

import io.github.onePieceApi.constants.Urls.ALL_URL
import io.github.onePieceApi.constants.Urls.CHAPTER_URL
import io.github.onePieceApi.model.Chapter
import io.github.onePieceApi.services.ChapterService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(CHAPTER_URL)
class ChapterController constructor(
    private val chapterService: ChapterService
) {

    @GetMapping(ALL_URL)
    fun getCharacter(pageable: Pageable): ResponseEntity<Page<Chapter>> {
        val result = chapterService.getAll(pageable)
        return ResponseEntity.ok(result)
    }
}
