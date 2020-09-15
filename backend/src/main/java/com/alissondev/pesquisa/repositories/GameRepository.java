package com.alissondev.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissondev.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
