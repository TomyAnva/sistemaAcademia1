package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.sistemaAcademia.DTO.CursosPorProfesorDTO;
import com.example.sistemaAcademia.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    List<Profesor> findByCorreoContainingIgnoreCase(String correo);
@Query("SELECT new com.example.sistemaAcademia.DTO.CursosPorProfesorDTO(p.nombre_profesor, COUNT(c)) " + "FROM Profesor p JOIN Clase c ON p.id_profesor = c.profesor.id_profesor " +
"GROUP BY p.nombre_profesor")
    List<CursosPorProfesorDTO> contarCursosPorProfesor();
}

