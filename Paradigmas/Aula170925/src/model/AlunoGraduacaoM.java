package model;

public class AlunoGraduacaoM extends AlunoM{
    private char Turno;//M(MATUTINO), V(VESPERTINO) e N(NOTURNO)
    private boolean bolsista;
    private float mensalidade;
    private char TipoGraduacao; //L(Licenciatura) e G(GRADUACAO)

    public AlunoGraduacaoM(int ra, String nome_completo, String data_nascimento, DadosPessoaisM dadosPessoaisM,
            EnderecoM enderecoM, char turno, boolean bolsista, float mensalidade, char tipoGraduacao) {
        super(ra, nome_completo, data_nascimento, dadosPessoaisM, enderecoM);
        Turno = turno;
        this.bolsista = bolsista;
        this.mensalidade = mensalidade;
        TipoGraduacao = tipoGraduacao;
    }

    public char getTurno() {
        return Turno;
    }

    public void setTurno(char turno) {
        Turno = turno;
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
        return TipoGraduacao;
    }

    public void setTipoGraduacao(char tipoGraduacao) {
        TipoGraduacao = tipoGraduacao;
    }

    public void ImprimirAlunoGraduacaoM(){
        System.out.println("...:: ALUNO GRADUAÇÃO M ::...");
        System.out.println("Turno  :"+this.getTurno());
        System.out.println("Bolsista  :"+this.isBolsista());
        System.out.println("Mensalidade           :"+this.getMensalidade());
        System.out.println("TipoGraduacao   :"+this.getTipoGraduacao());
        System.out.println("...:: --------------- ::...");
    }
}
