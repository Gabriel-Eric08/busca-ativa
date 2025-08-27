package com.example.buscativa.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurmaRequestBody {
    int Id;
    String Nome;
    String Alunos;
    String Professor;
}

