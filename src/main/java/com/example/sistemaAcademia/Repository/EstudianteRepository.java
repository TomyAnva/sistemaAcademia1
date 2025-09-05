package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.DTO.EstudiantesPorCicloDTO;
import com.example.sistemaAcademia.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    List<Estudiante> findByApellidoContainingIgnoreCase(String apellido);
    @Query("SELECT new com.example.sistemaAcademia.DTO.EstudiantesPorCicloDTO(clase.ciclo_academico, COUNT(DISTINCT i.estudiante.carnet)) " +
"FROM Inscripcion i JOIN Clase clase ON i.curso.id_curso = clase.curso.id_curso " +
"GROUP BY clase.ciclo_academico")
    List<EstudiantesPorCicloDTO> contarEstudiantesPorCiclo();
}

