package com.example.sistemaAcademia.Service;
import com.example.sistemaAcademia.Entity.Curso;
import com.example.sistemaAcademia.Repository.*;
import java.util.List;

public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

}
