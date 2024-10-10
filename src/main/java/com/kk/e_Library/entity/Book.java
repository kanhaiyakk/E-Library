package com.kk.e_Library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.Category;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class Book {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;
    private String author;

//    @Column(unique = true)
//    private String isbn;
    private Double price;
    private String description;
    private Category category;
    public enum Category{
        FICTION,
        NON_FICTION
    }


}
