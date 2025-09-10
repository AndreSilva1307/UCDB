package modelo;

public class LivroInfantilM extends LivroM
{
    public String tipo; //Ensaio ou cronica
    public boolean autoajuda; // V ou F


    public LivroInfantilM(String titulo, AutorM autorm, int isbn, String anoPublicacao, String tipo,
    boolean autoajuda) 
    {
        super(titulo, autorm, isbn, anoPublicacao);
        this.tipo = tipo;
        this.autoajuda = autoajuda;
    }


    public String getTipo() 
    {
        return tipo;
    }


    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }


    public boolean isAutoajuda()
    {
        return autoajuda;
    }


    public void setAutoajuda(boolean autoajuda) 
    {
        this.autoajuda = autoajuda;
    }

    
}
