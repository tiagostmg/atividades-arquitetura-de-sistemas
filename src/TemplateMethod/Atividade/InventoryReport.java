package TemplateMethod.Atividade;

public class InventoryReport extends ReportGenerator {

    public InventoryReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Loading inventory data...");
    }

    @Override
    public void sortData() {
        System.out.println("Sorting inventory data...");
    }

    @Override
    public void formatData() {
        System.out.println("Formating inventory data...");
    }
}
