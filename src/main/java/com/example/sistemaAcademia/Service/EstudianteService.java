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

    public List<EstudianteDTO> findAll(String apellido) {
        List<Estudiante> estudiantes;
        if (apellido != null && !apellido.isEmpty()) {
            estudiantes = estudianteRepository.findByApellidoContainingIgnoreCase(apellido);
        } else {
            estudiantes = estudianteRepository.findAll();
        }
        return estudiantes.stream().map(this::convertirAEstudianteDTO).collect(Collectors.toList());
    }

    public EstudianteDTO findById(Integer id) {
        return estudianteRepository.findById(id)
                .map(this::convertirAEstudianteDTO)
                .orElse(null);
    }

    public EstudianteDTO save(Estudiante estudiante) {
        Estudiante guardado = estudianteRepository.save(estudiante);
        return convertirAEstudianteDTO(guardado);
    }

    public void delete(Integer id) {
        estudianteRepository.deleteById(id);
    }

    private EstudianteDTO convertirAEstudianteDTO(Estudiante estudiante) {
        return new EstudianteDTO(
                estudiante.getCarnet(),
                estudiante.getNombre(),
                estudiante.getApellido(),
                estudiante.getFecha_nacimiento()
        );
    }
}
