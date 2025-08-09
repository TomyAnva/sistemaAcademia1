package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
