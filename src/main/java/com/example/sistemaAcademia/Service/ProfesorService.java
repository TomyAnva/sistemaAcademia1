package com.example.sistemaAcademia.Service;

import com.example.sistemaAcademia.DTO.ProfesorDTO;
import com.example.sistemaAcademia.Entity.Profesor;
import com.example.sistemaAcademia.Repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    public List<ProfesorDTO> findAll() {
        return profesorRepository.findAll()
                .stream()
                .map(this::convertirAProfesorDTO)
                .collect(Collectors.toList());
    }

    public ProfesorDTO save(Profesor profesor) {
        Profesor guardado = profesorRepository.save(profesor);
        return convertirAProfesorDTO(guardado);
    }

    public void delete(Long id) {
        profesorRepository.deleteById(id);
    }

    // 🔹 Conversión de Entity -> DTO
    private ProfesorDTO convertirAProfesorDTO(Profesor profesor) {
        return new ProfesorDTO(
                profesor.getId_profesor(),
                profesor.getNombre_profesor(),
                profesor.getCorreo()
        );
    }
}


