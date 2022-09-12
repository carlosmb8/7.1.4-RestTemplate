package com.example.resttemplateej71.repository;

import com.example.resttemplateej71.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    List<Persona> findByName(String name);
}
