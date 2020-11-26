package projeto.p3;

public class Caminhao {
    private String categoria;
    private ModeloCam modeloC;
    private PrecoCam precoC;

    public enum ModeloCam {

         
        ModeloC_FH460("CAMINHÃO FH460 - VOLVO"),
        ModeloC_ATEGO2425("CAMINHÃO ATEGO2425 - MERCEDES"),
        ModeloC_ACELO815("CAMINHÃO ACELO815 - MERCEDES"),
        ModeloC_VM260("CAMINHÃO VM260 - VOLVO "),
        ModeloC_R440("CAMINHÃO R440 - SCANIA");

        private final String modelo;

        ModeloCam(String modeloC) {
            this.modelo = modeloC;
        }

        public String getModeloC() {
            return this.modelo;
        }
    }

    public enum PrecoCam {

        PRECO_HB20(1000),
        PRECO_CORSA(300),
        PRECO_LOGAN(1100),
        PRECO_ARGO(1100),
        PREÇO_ONIX(1100);

        private final double preco;

        PrecoCam(double preco) {
            this.preco = preco;
        }

        public double getPrecoC() {
            return this.preco;
        }
    }
    
    public Caminhao(ModeloCam modelo) {
        this.modeloC = modelo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public String imprimir() {
        return this.modeloC + " " + this.categoria + " " + this.precoC + " ";
    }
}

    /*private double peso;
    private ModeloC caminhao;
    private Preco preco;
    //private final ModeloC modelo;

    public enum ModeloC {

         
        ModeloC_FH460("FH460 - VOLVO"),
        ModeloC_ATEGO2425("ATEGO2425 - MERCEDES"),
        ModeloC_ACELO815("ACELO815 - MERCEDES"),
        ModeloC_VM260("VM260 - VOLVO "),
        ModeloC_R440("R440 - SCANIA");

        private final String caminhao;

        Modelo(String ModeloC) {
            this.ModeloC = ModeloC;
        }

        String getModeloC() {
            return this.ModeloC;
        }
    }

    public enum Preco {

        PRECO_FH460(1000),
        PRECO_ATEGO2425(300),
        PRECO_ACELO815(1100),
        PRECO_VM260(1100),
        PREÇO_R440(1100);

        private final double preco;

        Preco(double preco) {
            this.preco = preco;
        }

        double getPreco() {
            return this.preco;
        }
    }
    
    public Caminhao(ModeloC modelo) {
        this.modelo = modelo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public String imprimir() {
        return this.modelo + " " + this.peso + " " + this.preco + " ";
    }
}*/
    

