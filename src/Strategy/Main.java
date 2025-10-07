package Strategy;

public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();

        lista.sort();

        lista.setSortStrategy(new ShellSort());

        lista.sort();

        lista.setSortStrategy(new HeapSortStrategy());

        lista.sort();
    }
}
