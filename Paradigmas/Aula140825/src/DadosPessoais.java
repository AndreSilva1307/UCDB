public class DadosPessoais 
{
    // Atributos
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    

    // Contrutor

    public DadosPessoais() 
    {
    }
    public DadosPessoais(String nome, String sobrenome, int idade, String sexo)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getters e Setters
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getSobrenome() 
    {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public String getSexo() 
    {
        return sexo;
    }
    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }

    // Metodos

    public void imprimirDadosPessoais()
    {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Sobrenome: "+ this.sobrenome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Sexo: "+ sexo);
    }
    
}
