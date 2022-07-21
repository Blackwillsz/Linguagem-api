package br.com.alura.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository linguagemRepository;

//    https://github.com/abrahamcalf/programming-languages-logos
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = linguagemRepository.findAll();
        return linguagens;
    }

}
