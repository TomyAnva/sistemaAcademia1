package com.example.sistemaAcademia.Controller;

import com.example.sistemaAcademia.DTO.ProfesorDTO;
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
public List<ProfesorDTO> findAll(@RequestParam(required = false) String correo) {
    return profesorService.findAll(correo);
}


    // 🔹 GET: recurso por ID
    @GetMapping("/{id}")
    public ProfesorDTO findById(@PathVariable Long id) {
        return profesorService.findById(id);
    }

    @PostMapping
    public ProfesorDTO save(@RequestBody Profesor profesor) {
        return profesorService.save(profesor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        profesorService.delete(id);
    }
}

