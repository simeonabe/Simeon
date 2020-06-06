package com.example.Simeon.repositories;

import com.example.Simeon.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
