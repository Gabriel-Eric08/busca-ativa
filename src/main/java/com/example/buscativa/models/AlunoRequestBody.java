package com.example.buscativa.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoRequestBody {
    String nome;
    String matricula;
    String data_nascimento;
    String contato;
    String responsavel;
    String status;
}
enum Status {
    BAIXAPRIORIDADE,
    MEDIAPRIORIDADE,
    ALTAPRIORIDADE
}
