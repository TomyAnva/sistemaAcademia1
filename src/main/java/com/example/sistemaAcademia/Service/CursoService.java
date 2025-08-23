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

    public List<CursoDTO> findAll() {
        return cursoRepository.findAll()
                .stream()
                .map(this::convertirACursoDTO)
                .collect(Collectors.toList());
    }
    
    public CursoDTO save(Curso curso) {
        Curso guardado = cursoRepository.save(curso);
        return convertirACursoDTO(guardado);
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

    // 🔹 Conversión de Entity -> DTO
    private CursoDTO convertirACursoDTO(Curso curso) {
        return new CursoDTO(
                curso.getId_curso(),
                curso.getNombre(),
                curso.getCreditos(),
                curso.getRequisitos() != null ? curso.getRequisitos().getId_curso() : null
        );
    }
}

