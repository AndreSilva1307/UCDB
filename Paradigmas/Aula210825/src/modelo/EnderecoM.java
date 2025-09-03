package modelo;

public class EnderecoM
{
    //Atributos
    private String nomeRua;
    private int numeroRua;
    private String cep;
    private String municipio;
    private String estado;

    
    //Construtor
    public EnderecoM() 
    {
    }

    public EnderecoM(String nomeRua, int numeroRua, String cep, String municipio, String estado) 
    {
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.cep = cep;
        this.municipio = municipio;
        this.estado = estado;
    }
    
    // Geters e Seters
    public String getNomeRua() 
    {
        return nomeRua;
    }
    public void setNomeRua(String nomeRua) 
    {
        this.nomeRua = nomeRua;
    }
    public int getNumeroRua() 
    {
        return numeroRua;
    }
    public void setNumeroRua(int numeroRua) 
    {
        this.numeroRua = numeroRua;
    }
    public String getCep() 
    {
        return cep;
    }
    public void setCep(String cep) 
    {
        this.cep = cep;
    }
    public String getMunicipio() 
    {
        return municipio;
    }
    public void setMunicipio(String municipio) 
    {
        this.municipio = municipio;
    }
    public String getEstado() 
    {
        return estado;
    }
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    // Métodos e Procedimentos
    public void imprimirEnderecoM()
    {
        System.out.println("....:: IMPRESSÃO ::....");
        System.out.println("RUA:    "+this.getNumeroRua());
        System.out.println("NUMERO:    "+this.getNumeroRua());
        System.out.println("CEP:    "+this.getCep());
        System.out.println("ESTADO:    "+this.getEstado());
        System.out.println("MUNICIPIO:    "+this.getMunicipio());
    }
}