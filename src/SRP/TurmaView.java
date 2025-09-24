package SRP;

import java.util.List;

public class TurmaView{

    public void imprimeDados(Aluno aluno){
        System.out.println("nome:" + aluno.getNome() + " matricula:" + aluno.getMatricula());

    }

    public void imprimeDados(List<Aluno> listaAlunos){

        for(Aluno aluno : listaAlunos){   
            System.out.println("nome:" + aluno.getNome() + " matricula:" + aluno.getMatricula());
        }

    }

    public void mostraDados(){
        System.out.println("Mostra ns tela dados do aluno");
    }
}