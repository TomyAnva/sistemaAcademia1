package com.example.sistemaAcademia.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CursoImpartido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cursoimpartido;

    @ManyToOne
    @JoinColumn(name = "idcurso", nullable = false)
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "idprofesor", nullable = false)
    private Profesor profesor;

    private String semestre;
    private String ciclo;
}
