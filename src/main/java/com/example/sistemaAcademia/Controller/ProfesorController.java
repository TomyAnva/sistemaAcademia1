package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.Entity.Profesor;
import com.example.sistemaAcademia.Service.ProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    public List<Profesor> listar() {
        return profesorService.findAll();
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return profesorService.save(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        profesorService.delete(id);
    }
}
