package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

