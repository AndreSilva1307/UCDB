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
}
