package modelo;

public class DadosPessoaisM {
    private String primeoronome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private char sexo;
    private int idade;

    public DadosPessoaisM(String primeoronome, String sobrenome, String cpf, String rg, char sexo, int idade) {
        this.primeoronome = primeoronome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getPrimeoronome() {
        return primeoronome;
    }

    public void setPrimeoronome(String primeoronome) {
        this.primeoronome = primeoronome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public void ImprimeDP(){
        System.out.println(" -- DADOS PESSOAIS--");
        System.out.println(" Nome      : "+this.getPrimeoronome());
        System.out.println(" Sobrenome : "+this.getSobrenome());
        System.out.println(" Idade     : "+this.getIdade());
        System.out.println(" CPF       : "+this.getCpf());
        System.out.println(" RG        : "+this.getRg());

    }
}
