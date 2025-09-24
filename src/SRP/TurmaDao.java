import java.util.ArrayList;
import java.util.List;

public class TurmaDao{

    public List<Aluno> load(){
        List<Aluno> lista = new ArrayList<Aluno>();
        lista.add(new Aluno("Joao", "123"));
        lista.add(new Aluno("Pedro", "456"));
        lista.add(new Aluno("Marcos", "833"));
        lista.add(new Aluno("Rafael", "537"));
        lista.add(new Aluno("Tiago", "437"));
        lista.add(new Aluno("Igor", "699"));

        return lista;
    }

    public void save(Aluno aluno){
        System.out.println("Aluno: " + aluno.getNome() + ", salvo como sucesso");
    }

    public void update(){

    }

    public void delete(){

    }
}