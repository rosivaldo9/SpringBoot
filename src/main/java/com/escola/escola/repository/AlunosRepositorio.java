package com.escola.escola.repository;

import com.escola.escola.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


public interface AlunosRepositorio extends JpaRepository<Alunos, Long> {


}
