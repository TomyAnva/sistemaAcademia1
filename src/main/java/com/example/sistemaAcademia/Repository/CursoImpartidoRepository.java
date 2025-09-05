// Repositories/ClaseRepository.java
package com.example.sistemaAcademia.Repository; 

import com.example.sistemaAcademia.Entity.CursoImpartido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoImpartidoRepository extends JpaRepository<CursoImpartido, Long> {
}
