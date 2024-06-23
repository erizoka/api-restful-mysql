package br.com.erizoka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erizoka.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
