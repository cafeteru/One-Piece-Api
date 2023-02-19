package io.github.onepieceapi.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.github.onepieceapi.model.Chapter;
import io.github.onepieceapi.repositories.ChapterRepository;
import io.github.onepieceapi.services.ChapterService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ChapterServiceImpl implements ChapterService {
    private final ChapterRepository chapterRepository;

    @Override
    public Page<Chapter> getAll(Pageable pageable) {
        return chapterRepository.findAll(pageable);
    }
}
