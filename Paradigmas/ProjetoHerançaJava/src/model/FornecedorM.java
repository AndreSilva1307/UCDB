package model;

public class FornecedorM extends PessoaM {
    private double valorCredito;
    private double valorDivida;

    public FornecedorM(String nome, EnderecoM endereco, TelefoneM telefone, 
                       double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return getValorCredito() - getValorDivida();
    }

    public void imprimirFornecedorM() {
        System.out.println("...:: Fornecedor M ::...");
        System.out.println("Valor Crédito   :" + this.getValorCredito());
        System.out.println("Valor Dívida    :" + this.getValorDivida());
        System.out.println();
    }

    public void imprimirFornecedorPessoaM() {
        super.imprimirPessoaM();
        System.out.println("Valor Crédito   :" + this.getValorCredito());
        System.out.println("Valor Dívida    :" + this.getValorDivida());
        System.out.println();
    }
}
