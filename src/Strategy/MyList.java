package Strategy;

import java.util.ArrayList;

public class MyList {
    private SortStrategy strategy;
    private ArrayList<Integer> lista;

    public MyList() {
        this.strategy = new QuickSortStrategy();
        this.lista = new ArrayList<>();
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        strategy.sort(this);
    }

    public void add(Integer valor) {
        this.lista.add(valor);
    }

    public void remove(Integer valor) {
        this.lista.remove(valor);
    }

    public void print() {
        System.out.print("[ ");
        for(Integer valor : this.lista) {
            System.out.print(valor + " ");
        }
        System.out.println("]");
    }

    public MyList copy() {
        MyList novaLista = new MyList();
        novaLista.lista.addAll(this.lista); // cópia rasa dos elementos
        return novaLista;
    }

    public ArrayList<Integer> getLista() {
        return this.lista;
    }
}
