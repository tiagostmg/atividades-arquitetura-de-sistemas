package TemplateMethod;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(double salario) {
        super(salario);
    }

    public double calcularDescontoPrev() {
        return this.getSalario() * 0.036;
    }

    public double calcularDescontoPlanoSaude() {
        return this.getSalario() * 0;
    }

    public double calcularOutrosDescontos() {
        return calcularDescontoISS() + calcularDescontoCLSS() + calcularDescontoIRPJ();
    }

    public double calcularDescontoISS() {
        return this.getSalario() * 0.01;
    }

    public double calcularDescontoCLSS() {
        return this.getSalario() * 0.04;
    }

    public double calcularDescontoIRPJ() {
        return this.getSalario() * 0.15;
    }

}
