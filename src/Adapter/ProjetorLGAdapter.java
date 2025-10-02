package Adapter;

public class ProjetorLGAdapter implements Projetor {
    private ProjetorLG projetorLG;

    public ProjetorLGAdapter(ProjetorLG projetorLG) {
        this.projetorLG = projetorLG;
    }

    public void liga() {
        projetorLG.enable(1);
    }

}
