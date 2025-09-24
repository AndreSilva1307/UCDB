package model;

public class AlunoMestradoDoutoradoM extends AlunoM {
    private String nomeOrientador;
    private String origemDaBolsa;
    private float valorDaBolsa;
    private int anoDeEntrada;

    public AlunoMestradoDoutoradoM(int ra, String nome_completo, String data_nascimento, DadosPessoaisM dadosPessoaisM,
            EnderecoM enderecoM, String nomeOrientador, String origemDaBolsa, float valorDaBolsa, int anoDeEntrada) {
        super(ra, nome_completo, data_nascimento, dadosPessoaisM, enderecoM);
        this.nomeOrientador = nomeOrientador;
        this.origemDaBolsa = origemDaBolsa;
        this.valorDaBolsa = valorDaBolsa;
        this.anoDeEntrada = anoDeEntrada;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public String getOrigemDaBolsa() {
        return origemDaBolsa;
    }

    public void setOrigemDaBolsa(String origemDaBolsa) {
        this.origemDaBolsa = origemDaBolsa;
    }

    public float getValorDaBolsa() {
        return valorDaBolsa;
    }

    public void setValorDaBolsa(float valorDaBolsa) {
        this.valorDaBolsa = valorDaBolsa;
    }

    public int getAnoDeEntrada() {
        return anoDeEntrada;
    }

    public void setAnoDeEntrada(int anoDeEntrada) {
        this.anoDeEntrada = anoDeEntrada;
    }

    public void imprimirDadosMestradoDoutorado() {
        System.out.println("");
        System.out.println("...::   DADOS MESTRADO/DOUTORADO    ::...");
        System.out.println("Nome do orientador : " + getNomeOrientador());
        System.out.println("Origem da bolsa    : " + getOrigemDaBolsa());
        System.out.println("Valor da bolsa     : " + getValorDaBolsa());
        System.out.println("Ano de entrada     : " + getAnoDeEntrada());
        System.out.println("");
    }

    public void imprimirCompleto() {
        System.out.println("\n-----------------------------------------");
        super.imprimirAlunoM();
        super.getDadosPessoaisM().imprimirDadosPessoaisM();
        super.getEnderecoM().imprimirEnderecoM();
        this.imprimirDadosMestradoDoutorado();
        System.out.println("-----------------------------------------");
    }
}