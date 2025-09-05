package com.example.sistemaAcademia.Service;

import com.example.sistemaAcademia.DTO.CursoDTO;
import com.example.sistemaAcademia.Entity.Curso;
import com.example.sistemaAcademia.Repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<CursoDTO> findAll(String nombre) {
        List<Curso> cursos;
        if (nombre != null && !nombre.isEmpty()) {
            cursos = cursoRepository.findByNombreContainingIgnoreCase(nombre);
        } else {
            cursos = cursoRepository.findAll();
        }
        return cursos.stream().map(this::convertirACursoDTO).collect(Collectors.toList());
    }

    public CursoDTO findById(Long id) {
        return cursoRepository.findById(id)
                .map(this::convertirACursoDTO)
                .orElse(null);
    }

    public CursoDTO save(Curso curso) {
        Curso guardado = cursoRepository.save(curso);
        return convertirACursoDTO(guardado);
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

    private CursoDTO convertirACursoDTO(Curso curso) {
        return new CursoDTO(
                curso.getId(),
                curso.getNombre(),
                curso.getCreditos(),
                curso.getRequisito() != null ? curso.getRequisito().getId() : null
        );
    }
}

