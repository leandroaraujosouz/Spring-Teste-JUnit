package com.generation.junit.junit.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.junit.junit.model.ContatoModel;


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
