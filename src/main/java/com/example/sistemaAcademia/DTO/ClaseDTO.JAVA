package com.example.sistemaAcademia.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursosPorProfesorDTO {
    private String nombreProfesor;
    private Long cantidadCursos;
}