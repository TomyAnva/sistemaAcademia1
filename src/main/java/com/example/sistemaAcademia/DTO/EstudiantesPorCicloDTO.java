package com.example.sistemaAcademia.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EstudiantesPorCicloDTO {
    private String cicloAcademico;
    private Long cantidadEstudiantes;
} 
