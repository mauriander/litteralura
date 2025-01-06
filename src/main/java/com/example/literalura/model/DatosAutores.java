package com.example.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores(
        @JsonAlias("name")
        String nombre,
        @JsonAlias("birth_year")
        String anioNacimiento ,
        @JsonAlias("death_year")
        String anioFallecimiento

) {
}