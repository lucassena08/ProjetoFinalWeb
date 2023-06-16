package br.ucsal.projetofinal.controller;


import br.ucsal.projetofinal.domain.estudante.DadosCadastroEstudante;
import br.ucsal.projetofinal.domain.estudante.Estudante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/estudantes")
public class EstudanteController {
    private List<Estudante> estudantes = new ArrayList<>();

   @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
       return "estudantes/formulario";
    }
   
   @GetMapping
   public String carregaPaginaListagem(Model model) {
	   model.addAttribute("lista",estudantes);
	   return "estudantes/listagem";
   }
   
    @PostMapping
    public String cadastraEstudante(DadosCadastroEstudante dados) {
        var estudante = new Estudante(dados);
        estudantes.add(estudante);

        System.out.println(estudantes);



        return "redirect:/estudantes";
    }
}
