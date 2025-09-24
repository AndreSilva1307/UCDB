package model;

public class EmpregadoM extends PessoaM {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public EmpregadoM(String nome, EnderecoM endereco, TelefoneM telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public EmpregadoM(PessoaM pessoa, int codigoSetor, double salarioBase, double imposto) {
        super(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone());
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * getImposto() / 100);
    }

    public void imprimirEmpregadoM() {
        System.out.println("...:: Empregado M ::...");
        System.out.println("Código Setor   :" + this.getCodigoSetor());
        System.out.println("Salário Base    :" + this.getSalarioBase());
        System.out.println("Imposto    :" + this.getImposto() + "%");
        System.out.println();
    }

    public void imprimirEmpregadoPessoaM() {
        super.imprimirPessoaM();
        System.out.println("Código Setor   :" + this.getCodigoSetor());
        System.out.println("Salário Base    :" + this.getSalarioBase());
        System.out.println("Imposto    :" + this.getImposto() + "%");
        System.out.println();
    }
}
