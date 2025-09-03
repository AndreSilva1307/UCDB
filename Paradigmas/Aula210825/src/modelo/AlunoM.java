package modelo;

public class AlunoM 
{
    //Atributos
    private int ra;
    private int codCurso;
    private int grade;
    private String dataEntrada;

    //Contrutor
     public AlunoM() 
    {
    }

    public AlunoM(int ra, int codCurso, int grade, String dataEntrada) 
    {
        this.ra = ra;
        this.codCurso = codCurso;
        this.grade = grade;
        this.dataEntrada = dataEntrada;
    }

    //Getters e Setters
    public int getRa() 
    {
        return ra;
    }
    public void setRa(int ra) 
    {
        this.ra = ra;
    }
    public int getCodCurso() 
    {
        return codCurso;
    }
    public void setCodCurso(int codCurso) 
    {
        this.codCurso = codCurso;
    }
    public int getGrade() 
    {
        return grade;
    }
    public void setGrade(int grade) 
    {
        this.grade = grade;
    }
    public String getDataEntrada() 
    {
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada) 
    {
        this.dataEntrada = dataEntrada;
    }

    //Métodos e Procedimentos
    public void imprimirAlunoM()
    {
        System.out.println("....:: IMPRESSÃO ::....");
        System.out.println("RA:    "+this.getRa());
        System.out.println("COD. CURSO:    "+this.getCodCurso());
        System.out.println("GRADE:    "+this.getGrade());
        System.out.println("DATA DE ENTRADA:    "+this.getDataEntrada());
    }
    
    
    
}
