package TemplateMethod;

public abstract class Funcionario {

    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularDescontoPrev();
    public abstract double calcularDescontoPlanoSaude();
    public abstract double calcularOutrosDescontos();

    public double calcSalarioLiquido() {

        double prev = calcularDescontoPrev();
        double saude = calcularDescontoPlanoSaude();
        double outros = calcularOutrosDescontos();

        return this.salario - prev - saude - outros;

    }

    public double getSalario() {
        return this.salario;
    }

}
