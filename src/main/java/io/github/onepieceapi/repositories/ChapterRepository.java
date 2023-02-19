package io.github.onepieceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.onepieceapi.model.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
