package controle;

import java.util.ArrayList;

import modelo.LivroInfantilM;

public class LivroInfantilC extends LivroC
{
    public ArrayList<LivroInfantilM> vetLivrosInf;

    public LivroInfantilC()
    {
        vetLivrosInf = new ArrayList<LivroInfantilM>();
    }  
    
    public void InserirLivrosInf(LivroInfantilM livroinf)
    {
        vetLivrosInf.add(livroinf);
    }
}
