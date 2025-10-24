package TemplateMethod.Atividade;

public class CustomerReport extends ReportGenerator {

    public CustomerReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Loading customer data...");
    }

    @Override
    public void sortData() {
        System.out.println("Sorting customer data...");
    }

    @Override
    public void formatData() {
        System.out.println("Formating customer data...");
    }
}
