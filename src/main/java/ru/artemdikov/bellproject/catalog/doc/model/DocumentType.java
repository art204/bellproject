package ru.artemdikov.bellproject.catalog.doc.model;

import javax.persistence.*;

/**
 * Вид документа
 */
@Entity
@Table(name = "Document_Type")
public class DocumentType {
    /**
     * Код
     */
    @Id
    @Column(name = "code", columnDefinition = "CHAR(2)")
    private String code;

    /**
     * Название
     */
    @Column(name = "name", length = 150, nullable = false, unique = true)
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
