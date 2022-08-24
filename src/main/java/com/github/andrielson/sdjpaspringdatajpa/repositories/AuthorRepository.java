package com.github.andrielson.sdjpaspringdatajpa.repositories;

import com.github.andrielson.sdjpaspringdatajpa.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
