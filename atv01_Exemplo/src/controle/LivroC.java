package controle;
import modelo.AutorM;
import modelo.LivroM;
import java.util.ArrayList;

public class LivroC {
    public ArrayList<LivroM> vetLivros;
    public LivroC(){
        vetLivros = new ArrayList<LivroM>();
    }

    public void InserirLivros(LivroM livrom){
        vetLivros.add(livrom);
    }
    public void BuscaPorTitulo(String titulo){
        for (int i=0;i<vetLivros.size();i++){
            if (vetLivros.get(i).getTitulo().equals(titulo)){
                System.out.println("ENCONTREI !");
                System.out.println("Posição : "+i);
                System.out.println("TITULO : "+this.vetLivros.get(i).getTitulo());
                System.out.println("Isbn   : "+this.vetLivros.get(i).getIsbn());
                System.out.println("Biografia do autor : "+this.vetLivros.get(i).getAutorm().getBiografia());
            }
        }
    }
}
