package TemplateMethod.Atividade;

public class SalesReport extends ReportGenerator{
    public SalesReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Loading sales data...");
    }

    @Override
    public void sortData() {
        System.out.println("Sorting sales data...");
    }

    @Override
    public void formatData() {
        System.out.println("Formating sales data...");
    }
}
