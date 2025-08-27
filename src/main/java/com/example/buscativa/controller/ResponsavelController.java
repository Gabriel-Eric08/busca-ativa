package com.example.buscativa.controller;

import com.example.buscativa.models.ResponsavelRequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Responsavel")
public class ResponsavelController {

    @PostMapping("/Cadastro")
    public String CadastrarResponsavel(@RequestBody ResponsavelRequestBody data){
        String nomeResponsavel = data.getNomeResponsavel();
        String contatoResponsavel = data.getContatoResponsavel();
        String matriculaAluno = data.getMatriculaAluno();
        String idResponsavel = data.getIdResponsavel();

        return ("O reponsável " + nomeResponsavel + " foi cadastrado com sucesso!");
    }

    @GetMapping("/Buscar/{idResponsavel}")
    public String BuscarResponsavel(@PathVariable String idResponsavel){
        return ("O responsável de ID: " + idResponsavel + " foi encontrado!");
    }

    @DeleteMapping("/Excluir/{idResponsavel}")
    public String ExcluirResponsavel(@PathVariable String idResponsavel){
        return ("O responsável de ID: " + idResponsavel + " foi excluído do sistema!");
    }

}
