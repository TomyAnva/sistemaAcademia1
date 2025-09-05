package com.example.sistemaAcademia.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {

    private Integer carnet;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}
