package model;

public class DadosPessoaisM {
    private String nomeDoPai;
    private String nomeDaMae;
    private String RG;
    private char sexo;
    private int idade;

    public DadosPessoaisM(String nomeDoPai, String nomeDaMae, String rG, char sexo, int idade) {
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.RG = rG;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        this.RG = rG;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimirDadosPessoaisM() {
        System.out.println("");
        System.out.println("...::   DADOS PESSOAIS    ::...");
        System.out.println("Nome do pai : " + getNomeDoPai());
        System.out.println("Nome da mãe : " + getNomeDaMae());
        System.out.println("RG          : " + getRG());
        System.out.println("Sexo        : " + getSexo());
        System.out.println("Idade       : " + getIdade());
        System.out.println("");
    }
}