package model;

public class AlunoMestradoM extends AlunoM{
    private String nomeOrientador;
    private String origemDaBolsa;
    private float valorBolsa;
    private int anoDeEntrada;
    
    public AlunoMestradoM(int ra, String nome_completo, String data_nascimento, DadosPessoaisM dadosPessoaisM,
            EnderecoM enderecoM, String nomeOrientador, String origemDaBolsa, float valorBolsa, int anoDeEntrada) {
        super(ra, nome_completo, data_nascimento, dadosPessoaisM, enderecoM);
        this.nomeOrientador = nomeOrientador;
        this.origemDaBolsa = origemDaBolsa;
        this.valorBolsa = valorBolsa;
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

    public float getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public int getAnoDeEntrada() {
        return anoDeEntrada;
    }

    public void setAnoDeEntrada(int anoDeEntrada) {
        this.anoDeEntrada = anoDeEntrada;
    }

    public void ImprimirEnderecoM(){
        System.out.println("...:: ENDEREÇO M ::...");
        System.out.println("Nome do orientador  :"+this.getNomeOrientador());
        System.out.println("Origem da bolsa  :"+this.getOrigemDaBolsa());
        System.out.println("Valor da bolsa           :"+this.getValorBolsa());
        System.out.println("Ano de entrada   :"+this.getAnoDeEntrada());
        System.out.println("...:: --------------- ::...");
    }
}
