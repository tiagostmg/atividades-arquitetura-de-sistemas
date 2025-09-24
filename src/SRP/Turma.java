package SRP;

import java.util.List;
import java.util.ArrayList;

public class Turma{

    private List<Aluno> listaAluno;
    private TurmaDao tDao;
    private TurmaView tView;


    public Turma(){
        this.tDao = new TurmaDao();   
        this.listaAluno = tDao.load();
        this.tView = new TurmaView();
    }

    public float calculaMedia(){
        return 0.0f;
    }

    public List<Aluno> getAlunos(){
        return listaAluno;
    }

    public void imprimeListaChamada(){
        tView.imprimeDados(listaAluno);
    }

    public int getTotalAlunos(){
        int totalAlunos = listaAluno.size();
        return totalAlunos;
    }

    public Aluno add(Aluno aluno){
        this.listaAluno.add(aluno);
        tDao.save(aluno);
        return null;
    }

    public void delete(Aluno aluno){

    }
}