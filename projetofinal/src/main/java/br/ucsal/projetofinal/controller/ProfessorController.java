package br.ucsal.projetofinal.controller;


import br.ucsal.projetofinal.domain.professor.DadosCadastroProfessor;
import br.ucsal.projetofinal.domain.professor.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/professores")
public class ProfessorController {
    private List<Professor> professores = new ArrayList<>();

   @GetMapping
    public String carregaPaginaFormulario() {
       return "professores/formulario";
    }
    @PostMapping
    public String cadastraProfessor(DadosCadastroProfessor dados) {
        var professor = new Professor(dados);
        professores.add(professor);

        System.out.println(professores);

        return "professores/formulario";
    }
}
