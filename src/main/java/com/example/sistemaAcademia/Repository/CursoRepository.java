package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
<<<<<<< HEAD

    // Buscar cursos por nombre (ej: "programación")
    List<Curso> findByNombreContainingIgnoreCase(String nombre);

    // Promedio de notas por curso
    @Query("SELECT new com.example.sistemaAcademia.DTO.NotaPromedioCursoDTO(c.nombre, AVG(i.nota_final)) " +
    "FROM Inscripcion i " +
    "JOIN i.cursoImpartido ci " +
    "JOIN ci.curso c " +
    "GROUP BY c.nombre")
    List<NotaPromedioCursoDTO> calcularNotaPromedioPorCurso();

    // Top 3 cursos con mejor promedio
    @Query("SELECT new com.example.sistemaAcademia.DTO.NotaPromedioCursoDTO(c.nombre, AVG(i.nota_final)) " +
    "FROM Inscripcion i " +
"JOIN i.cursoImpartido ci " +
"JOIN ci.curso c " +
"GROUP BY c.nombre " +
"ORDER BY AVG(i.nota_final) DESC")
    List<NotaPromedioCursoDTO> findTop3CursosByNotaPromedio();

    // Cantidad de estudiantes por ciclo
    @Query("SELECT new com.example.sistemaAcademia.DTO.EstudiantesPorCicloDTO(ci.ciclo, COUNT(DISTINCT i.estudiante.carnet)) " +
"FROM Inscripcion i " +
"JOIN i.cursoImpartido ci " +
"GROUP BY ci.ciclo")
    List<EstudiantesPorCicloDTO> contarEstudiantesPorCiclo();
    
}






=======
}

>>>>>>> parent of 3abd775 (Commit semana 8)
