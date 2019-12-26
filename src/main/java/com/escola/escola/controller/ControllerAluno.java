package com.escola.escola.controller;

import com.escola.escola.model.Alunos;
import com.escola.escola.repository.AlunosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerAluno {

    @Autowired
    private AlunosRepositorio all;

    @RequestMapping(value ="/cadastrarAluno", method = RequestMethod.GET)
    public String index(){
        return "/cadastrarAluno";
    }

    @RequestMapping(value = "/cadastrarAluno", method = RequestMethod.POST)
    public String salvar(Alunos aluno){
        all.save(aluno);
        return "redirect:/cadastrarAluno";
    }

    @RequestMapping(value = "/alunos", method = RequestMethod.GET)
    public ModelAndView lista(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Alunos> alunos= all.findAll();
        mv.addObject("aluno", alunos);
        return mv;
    }



}
