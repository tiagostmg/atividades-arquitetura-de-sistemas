package TemplateMethod;

public class FuncionarioPublico extends Funcionario {
    public FuncionarioPublico(double salario) {
        super(salario);
    }

    public double calcularDescontoPrev() {
        return this.getSalario() * 0.035;
    }

    public double calcularDescontoPlanoSaude() {
        return this.getSalario() * 0.047;
    }

    public double calcularOutrosDescontos() {
        return (this.getSalario() * 0.01) + calcularDescontao();
    }

    public double calcularDescontao() {
        return this.getSalario() * 0.04;
    }

}
