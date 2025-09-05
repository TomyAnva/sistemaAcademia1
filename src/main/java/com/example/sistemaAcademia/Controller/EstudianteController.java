package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.DTO.EstudianteDTO;
import com.example.sistemaAcademia.Entity.Estudiante;
import com.example.sistemaAcademia.Service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

@GetMapping
public List<EstudianteDTO> findAll(@RequestParam(required = false) String apellido) {
    return estudianteService.findAll(apellido);
}


    // 🔹 GET: recurso por ID
    @GetMapping("/{id}")
    public EstudianteDTO findById(@PathVariable Integer id) {
        return estudianteService.findById(id);
    }
    
    @PostMapping
    public EstudianteDTO save(@RequestBody Estudiante estudiante) {
        return estudianteService.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        estudianteService.delete(id);
    }
}

