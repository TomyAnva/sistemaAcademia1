// Controllers/ReporteController.java
package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.DTO.CursosPorProfesorDTO;
import com.example.sistemaAcademia.DTO.EstudiantesPorCicloDTO;
import com.example.sistemaAcademia.DTO.NotaPromedioCursoDTO;
import com.example.sistemaAcademia.Repository.CursoRepository;
import com.example.sistemaAcademia.Repository.EstudianteRepository;
import com.example.sistemaAcademia.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Reporte 1: Número total de cursos por profesor
    @GetMapping("/cursos-por-profesor")
    public List<CursosPorProfesorDTO> getCursosPorProfesor() {
        return profesorRepository.contarCursosPorProfesor();
    }

    // Reporte 2: Nota promedio por curso
    @GetMapping("/nota-promedio-por-curso")
    public List<NotaPromedioCursoDTO> getNotaPromedioPorCurso() {
        return cursoRepository.calcularNotaPromedioPorCurso();
    }

    // Reporte 3: Estudiantes inscritos por ciclo académico
    @GetMapping("/estudiantes-por-ciclo")
    public List<EstudiantesPorCicloDTO> getEstudiantesPorCiclo() {
        return estudianteRepository.contarEstudiantesPorCiclo();
    }

    // Reporte 4: Top 3 cursos con la nota promedio más alta
    @GetMapping("/top3-cursos-promedio")
    public List<NotaPromedioCursoDTO> getTop3CursosPromedio() {
        return cursoRepository.findTop3CursosByNotaPromedio().stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}
