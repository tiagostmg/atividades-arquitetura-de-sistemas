package TemplateMethod;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(double salario) {
        super(salario);
    }

    public double calcularDescontoPrev() {
        return this.getSalario() * 0.02;
    }

    public double calcularDescontoPlanoSaude() {
        return this.getSalario() * 0.03;
    }

    public double calcularOutrosDescontos() {
        return this.getSalario() * 0.01;
    }

}
