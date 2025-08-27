package com.example.buscativa.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table( name = "tb_aluno")
@Getter
@Setter
@Entity
public class AlunoModel {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name = "cpf", nullable = false, unique = true)
    private String Cpf;

    @Column( name = "nome", nullable = false)
    String Nome;

    @Column(name = "matricula",  nullable = false, unique = true)
    private String Matricula;

    @Column(name = "data_nascimento", nullable = false)
    String Data_Nascimento;

}

