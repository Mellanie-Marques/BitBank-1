package br.edu.ifpb.pweb2.bitbank.controller;


import br.edu.ifpb.pweb2.bitbank.model.Correntista;
import br.edu.ifpb.pweb2.bitbank.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

@RequestMapping("/save")
public String save(Correntista correntista, Model model) {
    correntistaRepository.save(correntista);
    model.addAttribute("correntista", correntistaRepository.findAll());
    return "correntista/list";
}

    @RequestMapping("/form")
    public String getForm(Correntista correntista, Model model){
        model.addAttribute("correntista", correntista);
        return "correntistas/form";
    }
}
