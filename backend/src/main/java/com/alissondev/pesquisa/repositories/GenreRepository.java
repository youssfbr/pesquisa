package com.alissondev.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissondev.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
