package com.example.buscativa.controller;

import com.example.buscativa.models.ResponsavelRequestBody;
import com.example.buscativa.models.UserRequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping ("/Cadastro")
    public String CadastrarUser(@RequestBody UserRequestBody data){
        String nomeUser = data.getNomeUser();
        String senhaUser = data.getSenhaUser();
        String cargosUser = data.getCargosUser();
        String perimissoesUser = data.getPermissoesUser();

        return ("O usuário " + nomeUser + " foi cadastrado com sucesso!");
    }

    @GetMapping("/buscar/{nomeUser}")
    public String BuscarUser(@PathVariable String nomeUser){
        return ("O usuário " + nomeUser + " foi encontrado!");
    }

    @DeleteMapping("/excluir/{nomeUser}")
    public String ExcluirUser(@PathVariable String nomeUser){
        return ("O usuário " + nomeUser + " foi excluido do sistema!");
    }
}
