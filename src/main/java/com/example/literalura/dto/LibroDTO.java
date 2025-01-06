package com.example.literalura.dto;

public record LibroDTO(
        Long id,
        String titulo,
        String idioma,
        Long cantidadDescargas
) {
}
