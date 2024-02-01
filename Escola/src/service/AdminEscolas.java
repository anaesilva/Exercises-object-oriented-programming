package service;

import entity.Escola;

import java.util.List;

public class AdminEscolas {

    public void analisar(List<Escola> escola) {
        for (int i = 0; i < escola.size(); i++) {
            if (escola.get(i).getAlunos().get(i).getId() > 18 && escola.get(i).getAlunos().get(i).getIsApproved() == true) {
                System.out.println("Aluno Encontrado: " + escola.get(i).getAlunos().get(i));
            }
        }
    }
}
