package modelo;

public class DadosPessoaisM 
{
    //Atributo
    private String primeironome;
    private String sobrenome;
    private int idade;
    private char sexo;
    private String cpf;
    private String rg;
    private String dataDeNascimento;
    private String nomeMae;

    //Getters e Setters
    public String getPrimeironome() 
    {
        return primeironome;
    }
    public void setPrimeironome(String primeironome) 
    {
        this.primeironome = primeironome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public char getSexo() 
    {
        return sexo;
    }
    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    public String getRg() 
    {
        return rg;
    }
    public void setRg(String rg) 
    {
        this.rg = rg;
    }
    public String getDataDeNascimento() 
    {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) 
    {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNomeMae() 
    {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) 
    {
        this.nomeMae = nomeMae;
    }


    //Métodos e procedimentos
    public void MaiorIdade()
    {
        if(getIdade() > 18)
        {
            System.out.println("Você é maior de idade\n");
        }
        else
        {
            System.out.println("Você é menor de idade\n");
        }
    }

    public void ImprimirDadosPessoais()
    {
        System.out.println("Primeiro nome: "+getPrimeironome());
        System.out.println("Sobrenome nome: "+getSobrenome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Sexo: "+getSexo());
        System.out.println("CPF: "+getCpf());
        System.out.println("RG: "+getRg());
        System.out.println("Data de Nascimento: "+getDataDeNascimento());
        System.out.println("Nome da Mãe: "+getNomeMae());
        
    }
    

}