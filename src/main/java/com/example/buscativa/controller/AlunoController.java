package com.example.buscativa.controller;

import com.example.buscativa.models.AlunoRequestBody;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

     @PostMapping("/cadastro")
     public String CadastrarAluno(@RequestBody AlunoRequestBody data) {
        String nome = data.getNome();
        String matricula = data.getMatricula();
        String data_nascimento = data.getData_nascimento();
        String responsavel = data.getResponsavel();
        String status =  data.getStatus();
        String contato =  data.getContato();

        return "O aluno " + nome + " foi registrado com sucesso!";
     }

     @GetMapping("/buscar/{matricula}")
     public String BuscarAluno(@PathVariable String matricula){
         return"o aluno com a matricula:" +matricula+ "foi encontrado";
     }

     @DeleteMapping("/excluir/{matricula}")
     public String ExcluirAluno(@PathVariable String matricula){
        return"o aluno com a matricula:" +matricula+ "foi excluido do sistema";
     }



}
