package com.example.sistemaAcademia.Service;

import com.example.sistemaAcademia.DTO.EstudianteDTO;
import com.example.sistemaAcademia.Entity.Estudiante;
import com.example.sistemaAcademia.Repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<EstudianteDTO> findAll() {
        return estudianteRepository.findAll()
                .stream()
                .map(this::convertirAEstudianteDTO)
                .collect(Collectors.toList());
    }

    public EstudianteDTO save(Estudiante estudiante) {
        Estudiante guardado = estudianteRepository.save(estudiante);
        return convertirAEstudianteDTO(guardado);
    }

    public void delete(Integer id) {
        estudianteRepository.deleteById(id);
    }

    // 🔹 Conversión de Entity -> DTO
    private EstudianteDTO convertirAEstudianteDTO(Estudiante estudiante) {
        return new EstudianteDTO(
                estudiante.getCarnet(),
                estudiante.getNombre(),
                estudiante.getApellido(),
                estudiante.getFecha_nacimiento()
        );
    }
}

