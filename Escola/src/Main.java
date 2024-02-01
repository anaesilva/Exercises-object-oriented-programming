import entity.Aluno;
import entity.Escola;
import service.AdminEscolas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setId(19);
        aluno1.setNome("Ana");
        aluno1.setIsApproved(true);
        aluno1.setEscolaPerc("Escola 1");

        Aluno aluno2 = new Aluno();
        aluno2.setId(18);
        aluno2.setNome("AS");
        aluno2.setIsApproved(true);
        aluno2.setEscolaPerc("Escola 1");

        Aluno aluno3 = new Aluno();
        aluno3.setId(14);
        aluno3.setNome("Joao");
        aluno3.setIsApproved(true);
        aluno3.setEscolaPerc("Escola 1");

        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);

        Escola escola = new Escola();
        escola.setId(1);
        escola.setNome("Escola 1");
        escola.setCnpj("12345");
        escola.setNumero(123);
        escola.setAlunos(alunoList);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Dados da escola: ");
        System.out.println("Id da escola: " + escola.getId());
        System.out.println("Nome da escola: " + escola.getNome());
        System.out.println("Cnpj da escola: " + escola.getCnpj());
        System.out.println("Numero da escola: " + escola.getNumero());
        System.out.println("Alunos inscritos: " + escola.getAlunos());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Aluno aluno4 = new Aluno();
        aluno4.setId(18);
        aluno4.setNome("Ana");
        aluno4.setIsApproved(true);
        aluno4.setEscolaPerc("Escola 2");

        Aluno aluno5 = new Aluno();
        aluno5.setId(18);
        aluno5.setNome("AS");
        aluno5.setIsApproved(true);
        aluno5.setEscolaPerc("Escola 2");

        Aluno aluno6 = new Aluno();
        aluno6.setId(14);
        aluno6.setNome("Joao");
        aluno6.setIsApproved(false);
        aluno6.setEscolaPerc("Escola 2");

        List<Aluno> alunosEscola2 = new ArrayList<>();
        alunosEscola2.add(aluno4);
        alunosEscola2.add(aluno5);
        alunosEscola2.add(aluno6);

        Escola escola2 = new Escola();
        escola2.setId(1);
        escola2.setNome("Escola 2");
        escola2.setCnpj("67890");
        escola2.setNumero(456);
        escola2.setAlunos(alunosEscola2);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Aluno aluno7 = new Aluno();
        aluno7.setId(18);
        aluno7.setNome("Ana");
        aluno7.setIsApproved(true);
        aluno7.setEscolaPerc("Escola 3");

        Aluno aluno8 = new Aluno();
        aluno8.setId(18);
        aluno8.setNome("AS");
        aluno8.setIsApproved(true);
        aluno8.setEscolaPerc("Escola 3");

        Aluno aluno9 = new Aluno();
        aluno9.setId(14);
        aluno9.setNome("Joao");
        aluno9.setIsApproved(false);
        aluno9.setEscolaPerc("Escola 3");

        List<Aluno> alunosEscola3 = new ArrayList<>();
        alunosEscola3.add(aluno7);
        alunosEscola3.add(aluno8);
        alunosEscola3.add(aluno9);

        Escola escola3 = new Escola();
        escola3.setId(1);
        escola3.setNome("Escola 3");
        escola3.setCnpj("54321");
        escola3.setNumero(789);
        escola3.setAlunos(alunosEscola3);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<Escola> list = new ArrayList<>();
        list.add(escola);
        list.add(escola2);
        list.add(escola3);

        System.out.println("Lista das escolas: ");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("Nomes das escolas: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNome());
        }

        System.out.println("---------------------------------------------------------------------");

        AdminEscolas admin = new AdminEscolas();
        admin.analisar(list);
    }
}