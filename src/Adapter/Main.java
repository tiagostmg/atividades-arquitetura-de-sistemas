package Adapter;

public class Main {
    public static void main(String[] args) {
        //SAMSUNG
        ProjetorSamsung projetorSamsung = new ProjetorSamsung();

        ProjetorSamsungAdapter projetorSamsungAdapter = new ProjetorSamsungAdapter(projetorSamsung);

        //LG
        ProjetorLG projetorLG = new ProjetorLG();

        ProjetorLGAdapter projetorLGAdapter = new ProjetorLGAdapter(projetorLG);

        //SCM
        SistemaControleMultimidia sistemaControleMultimidia = new SistemaControleMultimidia();

        sistemaControleMultimidia.init(projetorSamsungAdapter);

        sistemaControleMultimidia.init(projetorLGAdapter);
    }
}
