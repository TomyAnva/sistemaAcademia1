package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.DTO.CursoDTO;
import com.example.sistemaAcademia.Entity.Curso;
import com.example.sistemaAcademia.Service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }


@GetMapping
public List<CursoDTO> findAll(@RequestParam(required = false) String nombre) {
    return cursoService.findAll(nombre);
}


    // 🔹 GET: recurso por ID
    @GetMapping("/{id}")
    public CursoDTO findById(@PathVariable Long id) {
        return cursoService.findById(id);
    }

    @PostMapping
    public CursoDTO save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cursoService.delete(id);
    }
}

