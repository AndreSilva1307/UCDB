package model;

public class OperarioM extends EmpregadoM {
    private double valorProducao;
    private double comissao; 

    public OperarioM(EmpregadoM empregado, double valorProducao, double comissao) {
        super(empregado.getNome(), empregado.getEndereco(), empregado.getTelefone(),
              empregado.getCodigoSetor(), empregado.getSalarioBase(), empregado.getImposto());
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
    return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
    this.valorProducao = valorProducao;
    }

    public double getComissao() {
    return comissao;
    }

    public void setComissao(double comissao) {
    this.comissao = comissao;
    }

    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * getImposto() / 100) + (valorProducao * comissao / 100);
    }

    public void imprimirOperarioM() {
        System.out.println("...:: Operário M ::...");
        System.out.println("Valor Produção  :" + this.getValorProducao());
        System.out.println("Comissão        :" + this.getComissao() + "%");
        System.out.println();
    }

    public void imprimirOperarioEmpregadoPessoaM() {
        super.imprimirEmpregadoPessoaM();
        System.out.println("Valor Produção  :" + this.getValorProducao());
        System.out.println("Comissão        :" + this.getComissao() + "%");
        System.out.println();
    }
}
