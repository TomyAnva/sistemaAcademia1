// Repositories/InscripcionRepository.java
package com.example.sistemaAcademia.Repository;

import com.example.sistemaAcademia.Entity.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}