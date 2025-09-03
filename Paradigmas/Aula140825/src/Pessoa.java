public class Pessoa
{
    // Atributos
    private String nome;
    private String sobrenome;
    private String sexo;
    private double salario;
    private int idade;

    // Construtor
    public Pessoa() 
    {
    }
    public Pessoa(double salario, int idade)
    {
        
        this.salario = salario;
        this.idade = idade;
    }

    // Getters e Setters
   public double getSalario() 
    {
        return salario;
    }
    public void setSalario(double salario) 
    {
        this.salario = salario;
    }


    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    // Métodos
    public void imprimirPessoa()
    {
        System.out.println("Salario: " + this.salario);
        System.out.println("Idade: " + this.idade);
    }    
}