package com.example.sistemaAcademia.Service;
import com.example.sistemaAcademia.Entity.Estudiante;
import com.example.sistemaAcademia.Repository.EstudianteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EstudianteService {
    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
    public void delete(Integer id) {
        estudianteRepository.deleteById(id);
    }
}
