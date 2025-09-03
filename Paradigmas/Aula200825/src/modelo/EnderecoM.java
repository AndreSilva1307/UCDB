package modelo;

public class EnderecoM 
{
    private String nomedarua;
    private int numero;
    private String bairro;
    private String municipio;
    private String cep;
    private String estado;
    private String cidade;
    private String complemeto;

    public String getNomedarua() 
    {
        return nomedarua;
    }
    public void setNomedarua(String nomedarua) 
    {
        this.nomedarua = nomedarua;
    }
    public int getNumero() 
    {
        return numero;
    }
    public void setNumero(int numero) 
    {
        this.numero = numero;
    }
    public String getBairro() 
    {
        return bairro;
    }
    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }
    public String getMunicipio() 
    {
        return municipio;
    }
    public void setMunicipio(String municipio) 
    {
        this.municipio = municipio;
    }
    public String getCep() 
    {
        return cep;
    }
    public void setCep(String cep) 
    {
        this.cep = cep;
    }
    public String getEstado() 
    {
        return estado;
    }
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    public String getCidade() 
    {
        return cidade;
    }
    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }
    public String getComplemeto() 
    {
        return complemeto;
    }
    public void setComplemeto(String complemeto) 
    {
        this.complemeto = complemeto;
    }  
    
    public void ImprimirEndereco()
    {
        System.out.println("Nome da rua: "+getNomedarua());
        System.out.println("Numero: "+getNumero());
        System.out.println("Bairro: "+getBairro());
        System.out.println("Municipio: "+getMunicipio());
        System.out.println("CEP: "+getCep());
        System.out.println("Estado: "+getEstado());
        System.out.println("Cidade: "+getCidade());
        System.out.println("Complemento: "+getComplemeto());
    }
}
