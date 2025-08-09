package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.Entity.Curso;
import com.example.sistemaAcademia.Service.CursoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    public List<Curso> findAll() {
        return cursoService.findAll();
    }

    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cursoService.delete(id);
    }

}
