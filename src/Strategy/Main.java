package Strategy;

public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();

        lista.add(3);
        lista.add(1);
        lista.add(14);
        lista.add(8);
        lista.add(12);
        lista.add(7);
        lista.add(2);

        MyList listaDesordenada = lista.copy();

        lista.print();

        lista.sort();

        lista.print();

        System.out.println("-----");

        lista = listaDesordenada.copy();

        lista.setSortStrategy(new ShellSortStrategy());

        lista.print();

        lista.sort();

        lista.print();

        System.out.println("-----");

        lista = listaDesordenada.copy();

        lista.setSortStrategy(new HeapSortStrategy());

        lista = listaDesordenada.copy();

        lista.print();

        lista.sort();

        lista.print();

    }
}
