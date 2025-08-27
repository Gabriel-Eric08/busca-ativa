package com.example.buscativa.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class TurmasModel {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name = "nome", nullable = false)
    String Nome;

    @Column( name = "alunos", nullable = false, unique = true)
    String Alunos;

    @Column(name = "professor", nullable = false)
    String Professor;
}
