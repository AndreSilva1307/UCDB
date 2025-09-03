package modelo;

public class AlunoM {
    private int ra;
    private DadosPessoaisM dadosPessoaisM;
    private EnderecoM enderecoM;

    public AlunoM(int ra, DadosPessoaisM dadosPessoaisM, EnderecoM enderecoM) {
        this.ra = ra;
        this.dadosPessoaisM = dadosPessoaisM;
        this.enderecoM = enderecoM;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
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

    public void ImprimeAluno(){
        System.out.println("...::: ALUNO :::...");
        System.out.println("...................");
        System.out.println(" RA    : "+this.getRa());
        System.out.println("...................");
        this.getDadosPessoaisM().ImprimeDP();
        this.getEnderecoM().ImprimeEndereco();
    }
}
