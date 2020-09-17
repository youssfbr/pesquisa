package com.alissondev.pesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alissondev.pesquisa.dto.RecordDTO;
import com.alissondev.pesquisa.dto.RecordInsertDTO;
import com.alissondev.pesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordController {
	
	@Autowired
	public RecordService service;
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
		RecordDTO newDTO = service.insert(dto);
		
		return ResponseEntity.ok().body(newDTO);
	}

}
