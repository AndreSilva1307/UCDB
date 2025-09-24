package model;

public class AdministradorM extends EmpregadoM {
    private double ajudaDeCusto;

    public AdministradorM(String nome, EnderecoM endereco, TelefoneM telefone, int codigoSetor,
                          double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public AdministradorM(EmpregadoM empregado, double ajudaDeCusto) {
        super(
            empregado.getNome(),
            empregado.getEndereco(),
            empregado.getTelefone(),
            empregado.getCodigoSetor(),
            empregado.getSalarioBase(),
            empregado.getImposto()
        );
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario() {
        System.out.println("Calculando salário do administrador...");
        double salarioLiquido = getSalarioBase() - (getSalarioBase() * getImposto() / 100) + ajudaDeCusto;
        System.out.println("Salário Líquido: " + salarioLiquido);
        
        return salarioLiquido;
    }

    public void imprimirAdministradorM() {
        System.out.println("...:: Administrador M ::...");
        System.out.println("Ajuda de Custo   :" + this.getAjudaDeCusto());
        System.out.println();
    }

    public void imprimirAdministradorEmpregadoPessoaM() {
        super.imprimirEmpregadoPessoaM();
        System.out.println("Ajuda de Custo   :" + this.getAjudaDeCusto());
        System.out.println();
    }
}
