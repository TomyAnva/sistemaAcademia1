package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.Entity.Estudiante;
import com.example.sistemaAcademia.Service.EstudianteService;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/estudiantes") 
public class EstudianteController {

    private final EstudianteService estudianteService;  

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping
    public List<Estudiante> findAll() {
        return estudianteService.findAll();
    }

    @PostMapping
    public Estudiante save(@RequestBody Estudiante estudiante) {
        return estudianteService.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        estudianteService.delete(id);
    }
}
