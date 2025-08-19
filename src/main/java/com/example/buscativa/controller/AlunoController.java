package com.example.buscativa.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
@RequestMapping("/aluno")
public class AlunoController {

    //Cadastrar

    @PostMapping
    public String AdicionarNome() {
        return "Nome Cadastrado com sucesso;";
    }

    @PostMapping
    public String AdicionarMatricula() {
        return "Matricula realizada com sucesso";
    }

    @PostMapping
    public String AdicionarTurma() {
        return "Cadastrado na turma com sucesso";
    }

    @PostMapping
    public String AdicionarContato() {
        return " contato cadastrado com sucesso";
    }

    @PostMapping
    public String AdicionarResponsavel() {
        return "Responsavel cadastrado com sucesso";
    }

    @GetMapping()
    public String BuscarNome() {
        return "Nome:";
    }

    @GetMapping("/matricula")
    public String BuscarMatricula() {
        return "Matricula:";
    }

    @GetMapping
    public String BuscarTurma() {
        return "Turma:";
    }

    @GetMapping
    public String BuscarContato() {
        return "Contato:";
    }

    @GetMapping
    public String BuscarResponsavel() {
        return "Responsavel";
    }
    @PutMapping
    public String AtualizarNome() {
        return "Nome Atualizado";
    }

    @PutMapping
    public String AtualizarTurma() {
        return "Turma Atualizada";
    }

    @PutMapping
    public String AtualizarContato() {
        return "Contato atualizado";
    }

    @PutMapping
    public String AtualizarResponsavel() {
        return "Responsável atalizado";
    }

    @DeleteMapping
    public String ExcluirMatricula() {
        return "Matricula Deletada";
    }

}
