package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
         public  String boasVindas(){
            return "Essa é minha primeira mensagem nessa rota";
        }

        //adicionar ninja (create)
        @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
        }


    // mostrar todos os ninjas (read)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar todos os Ninjas";
    }

        // mostrar ninja por ID (read)
    @GetMapping("/todosID")
    public String mostrarNinjasID(){
        return "Mostrar Ninja por ID";
    }

        // Alterar dados dos ninjas (update)
    @PutMapping("/alterar")
    public String alterarNinjasID() {
        return "Alterar Ninja por ID";
    }

        // Deletar ninja (Delete)
        @DeleteMapping("/deletarID")
    public String deletarNinjasporID() {
        return "Deletar Ninja por ID";
        }
}
