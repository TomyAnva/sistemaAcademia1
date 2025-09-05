package com.example.sistemaAcademia.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO {

    private Long idCurso;
    private String nombre;
    private int creditos;

    // En lugar de enviar toda la entidad requisito, enviamos solo su id
    private Long requisitoId;
    
}

