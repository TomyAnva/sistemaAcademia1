// DTO/NotaPromedioCursoDTO.java
package com.example.sistemaAcademia.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotaPromedioCursoDTO {
    private String nombreCurso;
    private Double notaPromedio;
}