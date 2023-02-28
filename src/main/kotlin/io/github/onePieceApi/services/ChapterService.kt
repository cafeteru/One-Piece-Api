package io.github.onePieceApi.services

import io.github.onePieceApi.model.Chapter
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ChapterService {
    fun getAll(pageable: Pageable): Page<Chapter>
}
