package com.example.sistemaAcademia.Service;

import com.example.sistemaAcademia.Entity.Profesor;
import com.example.sistemaAcademia.Repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public void delete(Long id) {
        profesorRepository.deleteById(id);
    }
}

