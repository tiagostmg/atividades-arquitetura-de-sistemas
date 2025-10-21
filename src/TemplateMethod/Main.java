package TemplateMethod;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new FuncionarioCLT(1265);

        System.out.println("O salario do clt é: " + f1.calcSalarioLiquido());

        Funcionario f2 = new FuncionarioPublico(3500);

        System.out.println("O salario do funcionario publico é: " + f2.calcSalarioLiquido());

        Funcionario f3 = new FuncionarioPJ(9000);

        System.out.println("O salario do pj é: " + f3.calcSalarioLiquido());
    }
}
