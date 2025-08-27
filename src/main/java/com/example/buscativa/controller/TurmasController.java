package com.example.buscativa.controller;

import com.example.buscativa.models.TurmaRequestBody;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/turmas")
public class TurmasController {

    @PostMapping("/cadastrar")
    public String CadastrarTurma(@RequestBody TurmaRequestBody data){
        int id = data.getId();
        String nome = data.getNome();
        String alunos = data.getAlunos();
        String professor = data.getProfessor();
        return ("A turma com o id:" + id + "Foi cadastrada com sucesso!");
    }

    @GetMapping("/buscar/{id}")
    public String BuscarTurma (@PathVariable  String id){
        return ("A turma com o id:" + id + "Foi encontrada com sucesso!");
    }

    @DeleteMapping("/deletar/{turma}")
    public String DeletarTurma (@PathVariable String id){
    return ("A turma com o id:" + id + "Foi deletada com sucesso!");
    }

}

