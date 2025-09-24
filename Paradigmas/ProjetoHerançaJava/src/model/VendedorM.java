package model;

public class VendedorM extends EmpregadoM {
    private double valorVendas;
    private double comissao; 

    public VendedorM(EmpregadoM empregado, double valorVendas, double comissao) {
        super(empregado.getNome(), empregado.getEndereco(), empregado.getTelefone(),
              empregado.getCodigoSetor(), empregado.getSalarioBase(), empregado.getImposto());
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
    return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
    this.valorVendas = valorVendas;
    }

    public double getComissao() {
    return comissao;
    }

    public void setComissao(double comissao) {
    this.comissao = comissao;
    }

    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * getImposto() / 100) + (valorVendas * comissao / 100);
    }

    public void imprimirVendedorM() {
        System.out.println("...:: Vendedor M ::...");
        System.out.println("Valor Vendas  :" + this.getValorVendas());
        System.out.println("Comissão        :" + this.getComissao() + "%");
        System.out.println();
    }

    public void imprimirVendedorEmpregadoPessoaM() {
        super.imprimirEmpregadoPessoaM();
        System.out.println("Valor Vendas  :" + this.getValorVendas());
        System.out.println("Comissão        :" + this.getComissao() + "%");
        System.out.println();
    }
    
}
