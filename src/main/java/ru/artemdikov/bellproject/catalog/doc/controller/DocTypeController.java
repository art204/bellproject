package ru.artemdikov.bellproject.catalog.doc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.artemdikov.bellproject.catalog.doc.dto.DocumentTypeDto;
import ru.artemdikov.bellproject.catalog.doc.service.DocTypeService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Контроллер для работы со справочником видов документов
 * @author Artem Dikov
 */
@RestController
@RequestMapping(value = "/api/docs", produces = APPLICATION_JSON_VALUE)
public class DocTypeController {

    private final DocTypeService documentTypeService;

    /**
     * Конструктор - создание нового объекта контроллера
     * @param documentTypeService - сервис для работы со справочником видов документов
     */
    @Autowired
    public DocTypeController(DocTypeService documentTypeService) {
        this.documentTypeService = documentTypeService;
    }

    /**
     * Вернуть список всех видов документов
     * @return возвращает список всех видов документов
     */
    @GetMapping("")
    public List<DocumentTypeDto> allDocs() {
        return documentTypeService.docTypes();
    }
}
