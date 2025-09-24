package SRP;

public class Main{
    public static void main(String[] args){

        Turma t252 = new Turma();
        System.out.println(t252.getTotalAlunos());

        t252.imprimeListaChamada();
        Aluno sadas = new Aluno("aaaaa", "0234992834");
        t252.add(sadas);

        t252.imprimeListaChamada();
    }
}   