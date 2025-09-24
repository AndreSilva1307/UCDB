package model;

public class AlunoM{
    private int ra;
    private String nome_completo;
    private String data_nascimento;
    private DadosPessoaisM dadosPessoaisM;
    private EnderecoM enderecoM;
    
    public AlunoM(int ra, String nome_completo, String data_nascimento, DadosPessoaisM dadosPessoaisM,
            EnderecoM enderecoM) {
        this.ra = ra;
        this.nome_completo = nome_completo;
        this.data_nascimento = data_nascimento;
        this.dadosPessoaisM = dadosPessoaisM;
        this.enderecoM = enderecoM;
    }

    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public DadosPessoaisM getDadosPessoaisM() {
        return dadosPessoaisM;
    }
    public void setDadosPessoaisM(DadosPessoaisM dadosPessoaisM) {
        this.dadosPessoaisM = dadosPessoaisM;
    }
    public EnderecoM getEnderecoM() {
        return enderecoM;
    }
    public void setEnderecoM(EnderecoM enderecoM) {
        this.enderecoM = enderecoM;
    }

    public void ImprimirAlunoM(){
        System.out.println("...:: Aluno M ::...");
        System.out.println("Ra                  :"+this.getRa());
        System.out.println("Nome completo       :"+this.getNome_completo());
        System.out.println("Data de nascimento  :"+this.getData_nascimento());
        System.out.println("...:: --------------- ::...");
    }
}