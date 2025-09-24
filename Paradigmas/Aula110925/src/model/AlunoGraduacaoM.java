package model;

public class AlunoGraduacaoM extends AlunoM {
    private char turno;
    private boolean bolsista;
    private float mensalidade;
    private char tipoGraduacao;

    public AlunoGraduacaoM(int ra, String nome_completo, String data_nascimento, DadosPessoaisM dadosPessoaisM,
            EnderecoM enderecoM, char turno, boolean bolsista, float mensalidade, char tipoGraduacao) {
        super(ra, nome_completo, data_nascimento, dadosPessoaisM, enderecoM);
        this.turno = turno;
        this.bolsista = bolsista;
        this.mensalidade = mensalidade;
        this.tipoGraduacao = tipoGraduacao;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public char getTipoGraduacao() {
        return tipoGraduacao;
    }

    public void setTipoGraduacao(char tipoGraduacao) {
        this.tipoGraduacao = tipoGraduacao;
    }

    public void imprimirDadosGraduacao() {
        System.out.println("");
        System.out.println("...::   DADOS DA GRADUAÇÃO    ::...");
        System.out.println("Turno             : " + getTurno());
        System.out.println("Bolsista          : " + (isBolsista() ? "Sim" : "Não"));
        System.out.println("Mensalidade       : " + getMensalidade());
        System.out.println("Tipo de graduação : " + getTipoGraduacao());
        System.out.println("");
    }

    public void imprimirCompleto() {
        System.out.println("\n-----------------------------------------");
        super.imprimirAlunoM();
        super.getDadosPessoaisM().imprimirDadosPessoaisM();
        super.getEnderecoM().imprimirEnderecoM();
        this.imprimirDadosGraduacao();
        System.out.println("-----------------------------------------");
    }
}