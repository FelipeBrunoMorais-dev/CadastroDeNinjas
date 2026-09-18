package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    public NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){

        return ninjaService.listarNinjass();
    }

        // mostrar ninja por ID (read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id) ;
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
