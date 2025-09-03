package modelo;

public class CursoM 
{
    //Atributos
    private int codCurso;
    private String nome;
    private int numeroSemestre;
    private int cargaHoraria;
    private int atvComplementar;
    private boolean tcc;
    private boolean estagioSupervisionado;
    
    //Construtor
    public CursoM() 
    {
    }

    public CursoM(int codCurso, String nome, int numeroSemestre, int cargaHoraria, int atvComplementar, boolean tcc,
    boolean estagioSupervisionado) 
    {
        this.codCurso = codCurso;
        this.nome = nome;
        this.numeroSemestre = numeroSemestre;
        this.cargaHoraria = cargaHoraria;
        this.atvComplementar = atvComplementar;
        this.tcc = tcc;
        this.estagioSupervisionado = estagioSupervisionado;
    }

    // Getters e Setters
    public int getCodCurso() 
    {
        return codCurso;
    }

    public void setCodCurso(int codCurso) 
    {
        this.codCurso = codCurso;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getNumeroSemestre() 
    {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) 
    {
        this.numeroSemestre = numeroSemestre;
    }

    public int getCargaHoraria() 
    {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) 
    {
        this.cargaHoraria = cargaHoraria;
    }

    public int getAtvComplementar() 
    {
        return atvComplementar;
    }

    public void setAtvComplementar(int atvComplementar) 
    {
        this.atvComplementar = atvComplementar;
    }

    public boolean isTcc() 
    {
        return tcc;
    }

    public void setTcc(boolean tcc) 
    {
        this.tcc = tcc;
    }

    public boolean isEstagioSupervisionado()
     {
        return estagioSupervisionado;
    }

    public void setEstagioSupervisionado(boolean estagioSupervisionado) 
    {
        this.estagioSupervisionado = estagioSupervisionado;
    }
    
    
    //Métodos e procedimentos
    public void imprimirCursoM()
    { 
        System.out.println("....:: IMPRESSÃO ::....");
        System.out.println("COD. CURSO:    "+this.getCodCurso());
        System.out.println("NOME:    "+this.getNome());
        System.out.println("NUMERO DO SEMESTRE:    "+this.getNumeroSemestre());
        System.out.println("CARGA HORARIA:    "+this.getCargaHoraria());
        System.out.println("ATV. COMPLEMENTAR:    "+this.getAtvComplementar());
        System.out.println("TCC:    "+this.isTcc());
        System.out.println("ESTÁGIO SUPERVISIONADO:    "+this.isEstagioSupervisionado());
    }

}
