// Entity/Profesor.java
package com.example.sistemaAcademia.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesor;

    @Column(nullable = false, length = 40)
    private String nombre_profesor;

    @Column(nullable = false, length = 40)
    private String correo;
}

