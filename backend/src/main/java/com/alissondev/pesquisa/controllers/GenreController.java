package com.alissondev.pesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alissondev.pesquisa.entities.Genre;
import com.alissondev.pesquisa.repositories.GenreRepository;

@RestController
@RequestMapping(value = "/genre")
public class GenreController {
	
	@Autowired
	private GenreRepository genreRepository;

	@GetMapping
	public ResponseEntity<List<Genre>> findAll() {
		
		List<Genre> list = genreRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
