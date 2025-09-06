package com.example.sistemaAcademia.Repository;

<<<<<<< HEAD
import com.example.sistemaAcademia.DTO.CursosPorProfesorDTO;
import com.example.sistemaAcademia.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    List<Profesor> findByCorreoContainingIgnoreCase(String correo);

    @Query("SELECT new com.example.sistemaAcademia.DTO.CursosPorProfesorDTO(p.nombre_profesor, COUNT(ci)) " +
        "FROM Profesor p JOIN CursoImpartido ci ON p.id_profesor = ci.profesor.id_profesor " +
        "GROUP BY p.nombre_profesor")
    List<CursosPorProfesorDTO> contarCursosPorProfesor();
=======
import com.example.sistemaAcademia.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
>>>>>>> parent of 3abd775 (Commit semana 8)
}
