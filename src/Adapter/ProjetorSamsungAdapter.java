package Adapter;

public class ProjetorSamsungAdapter implements Projetor {
    private ProjetorSamsung projetorSamsung;

    public ProjetorSamsungAdapter(ProjetorSamsung projetorSamsung) {
        this.projetorSamsung = projetorSamsung;
    }

    public void liga() {
        projetorSamsung.turnON();
    }
}
