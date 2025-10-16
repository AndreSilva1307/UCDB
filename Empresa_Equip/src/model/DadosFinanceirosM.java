package model;

public class DadosFinanceirosM {
    private String centroCusto;
    private String dataCompra;
    private int totalUnidades;
    private float valorUnidade;

    public DadosFinanceirosM(String centroCusto, String dataCompra, int totalUnidades, float valorUnidade) {
        this.centroCusto = centroCusto;
        this.dataCompra = dataCompra;
        this.totalUnidades = totalUnidades;
        this.valorUnidade = valorUnidade;
    }

    public String getCentroCusto() {
        return centroCusto;
    }
    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getTotalUnidades() {
        return totalUnidades;
    }
    public void setTotalUnidades(int totalUnidades) {
        this.totalUnidades = totalUnidades;
    }

    public float getValorUnidade() {
        return valorUnidade;
    }
    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public void imprimirDados() {
    System.out.println("----- Dados Financeiros -----");
    System.out.println("Centro de Custo: " + getCentroCusto());
    System.out.println("Data da Compra: " + getDataCompra());
    System.out.println("Total de Unidades: " + getTotalUnidades());
    System.out.println("Valor por Unidade: " + getValorUnidade());
    }
}
