package com.alissondev.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissondev.pesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
