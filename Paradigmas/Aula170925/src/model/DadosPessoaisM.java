package model;

public class DadosPessoaisM {
    private String nomedoPai;
    private String nomedaMae;
    private int RG;
    private char sexo;
    private int idade;
    
    public DadosPessoaisM(String nomedPai, String nomedaMae, int rG, char sexo, int idade) {
        this.nomedoPai = nomedPai;
        this.nomedaMae = nomedaMae;
        RG = rG;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNomedoPai() {
        return nomedoPai;
    }

    public void setNomedoPai(String nomedPai) {
        this.nomedoPai = nomedPai;
    }

    public String getNomedaMae() {
        return nomedaMae;
    }

    public void setNomedaMae(String nomedaMae) {
        this.nomedaMae = nomedaMae;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int rG) {
        RG = rG;
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

    public void ImprimirDadosPessoaisM(){
        System.out.println("...:: DADOS PESSOAIS M ::...");
        System.out.println("Nome do Pai  :"+this.getNomedoPai());
        System.out.println("Nome da Mãe  :"+this.getNomedaMae());
        System.out.println("RG           :"+this.getNomedaMae());
        System.out.println("Orientador   :"+this.getSexo());
        System.out.println("Orientador   :"+this.getIdade());
        System.out.println("...:: --------------- ::...");
    }
}

