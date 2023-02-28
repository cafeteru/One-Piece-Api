package io.github.onePieceApi.repositories

import io.github.onePieceApi.model.Chapter
import org.springframework.data.jpa.repository.JpaRepository

interface ChapterRepository : JpaRepository<Chapter, Long> {
}
