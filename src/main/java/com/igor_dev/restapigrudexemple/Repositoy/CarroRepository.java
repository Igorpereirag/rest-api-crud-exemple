package com.igor_dev.restapigrudexemple.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor_dev.restapigrudexemple.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    
}
