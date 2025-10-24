package TemplateMethod.Atividade;


public abstract class ReportGenerator {

    public ReportGenerator() {}

    public void generateReport() {
        loadData();
        sortData();
        formatData();
        System.out.println("--- Relatório Gerado com Sucesso --- \n");
    }

    public void loadData() {
        System.out.println("Loading data...");
    }

    public void sortData() {
        System.out.println("Sorting data...");
    }

    public void formatData() {
        System.out.println("Formating data...");
    }
}
