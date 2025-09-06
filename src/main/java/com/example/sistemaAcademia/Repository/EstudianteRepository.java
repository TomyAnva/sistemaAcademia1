package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
<<<<<<< HEAD

    List<Estudiante> findByApellidoContainingIgnoreCase(String apellido);
    
    @Query("SELECT new com.example.sistemaAcademia.DTO.EstudiantesPorCicloDTO(ci.clase.cicloAcademico, COUNT(DISTINCT i.estudiante)) " +
"FROM Inscripcion i JOIN i.cursoImpartido ci " +
"GROUP BY ci.clase.cicloAcademico")
    List<EstudiantesPorCicloDTO> contarEstudiantesPorCiclo();
}
=======
}
>>>>>>> parent of 3abd775 (Commit semana 8)
