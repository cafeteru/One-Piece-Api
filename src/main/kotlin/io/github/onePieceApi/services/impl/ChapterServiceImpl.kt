package io.github.onePieceApi.services.impl

import io.github.onePieceApi.model.Chapter
import io.github.onePieceApi.repositories.ChapterRepository
import io.github.onePieceApi.services.ChapterService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ChapterServiceImpl constructor(
    private val chapterRepository: ChapterRepository
) : ChapterService {

    override fun getAll(pageable: Pageable): Page<Chapter> {
        return chapterRepository.findAll(pageable)
    }

}
