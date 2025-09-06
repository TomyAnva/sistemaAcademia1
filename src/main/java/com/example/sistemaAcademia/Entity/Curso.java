
package com.example.sistemaAcademia.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(nullable = false)
    private int creditos;

    @ManyToOne
    @JoinColumn(name = "id_requisitos")
    private Curso requisitos;
}
