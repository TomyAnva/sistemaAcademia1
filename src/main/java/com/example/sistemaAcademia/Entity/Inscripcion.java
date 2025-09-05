package com.example.sistemaAcademia.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_cursoimpartido", nullable = false)
    private CursoImpartido cursoImpartido;

    @ManyToOne
    @JoinColumn(name = "fk_estudiante", nullable = false)
    private Estudiante estudiante;

    @Column(name = "nota_final")
    private Double notaFinal;
}

