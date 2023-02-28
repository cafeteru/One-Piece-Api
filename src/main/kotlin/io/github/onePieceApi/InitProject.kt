package io.github.onePieceApi

import io.github.onePieceApi.model.Chapter
import io.github.onePieceApi.model.Character
import io.github.onePieceApi.repositories.ChapterRepository
import io.github.onePieceApi.repositories.CharacterRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class InitProject constructor(
    private val characterRepository: CharacterRepository,
    private val chapterRepository: ChapterRepository
) {

    @PostConstruct
    fun init() {
        val luffy = Character()
        luffy.surname = "Monkey"
        luffy.name = "D. Luffy"
        characterRepository.save(luffy)

        createChapter("Romance Dawn - Amanecer de una aventura", 1)
        createChapter("El hombre del sombrero de paja, Luffy", 2)
        createChapter("Zoro, el cazador de recompensas", 3)
        createChapter("El capitán Morgan, \"Él del brazo de hacha\"", 4)
        createChapter("El rey de los piratas", 5)
        createChapter("El primero", 6)
        createChapter("Amigos", 7)
        createChapter("Aparece Nami", 8)
    }

    private fun createChapter(title: String, number: Int) {
        val chapter = Chapter()
        chapter.title = title
        chapter.number = number
        chapterRepository.save(chapter)
    }
}
