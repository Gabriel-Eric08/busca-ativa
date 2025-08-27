package com.example.buscativa.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponsavelRequestBody {
    String nomeResponsavel;
    String contatoResponsavel;
    String matriculaAluno;
    String idResponsavel;
}
