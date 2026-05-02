package com.bookstore.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    private String title;
    private String author;
    private String description;
    private LocalDate published_date;
    private Double price;
    private String genre;
    private String isbn;
    private String image_url;
    private String pdf_url;
}