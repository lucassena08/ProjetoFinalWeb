package br.ucsal.projetofinal.controller;


import br.ucsal.projetofinal.domain.diciplina.DadosCadastroDiciplina;
import br.ucsal.projetofinal.domain.diciplina.Diciplina;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/diciplinas")
public class DiciplinaController {
    private List<Diciplina> diciplinas = new ArrayList<>();

   @GetMapping
    public String carregaPaginaFormulario() {
       return "diciplinas/formulario";
    }
    @PostMapping
    public String cadastraDiciplina(DadosCadastroDiciplina dados) {
        var diciplina = new Diciplina(dados);
        diciplinas.add(diciplina);

        System.out.println(diciplinas);

        return "diciplinas/formulario";
    }
}
