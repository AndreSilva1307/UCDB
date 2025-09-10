import controle.LivroC;
import controle.LivroInfantilC;
import modelo.AutorM;
import modelo.LivroInfantilM;
import modelo.LivroM;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    //DADOS : Hoje via prompt, na sequencia via interface gráfica
        AutorM alexA=new AutorM("Alex","Brasil",
                "17/02/1979","vazio");
        LivroM alexLa=new LivroM("Educação",alexA,1,"2025");

        AutorM alexB=new AutorM("Alex","Brasil",
                "17/02/1979","Computação desde 2001");
        LivroM alexLb=new LivroM("POO",alexB,2,"2020");

        //CONTROLADOR
        LivroC database=new LivroC();
        database.InserirLivros(alexLa);
        database.InserirLivros(alexLb);
        database.BuscaPorTitulo("POO");

        // Usando herança
        AutorM infantilM1=new AutorM("teste", "USA", "01/01/1980", "da época");
        LivroInfantilM livroInfantil1=new LivroInfantilM("Livro1", alexB, 3, "2010", "Cronica", false);
        LivroInfantilC database2=new LivroInfantilC();
        database2.InserirLivrosInf(livroInfantil1);

        // Testando se a herança deu certo impressao dos dados
        System.out.println("..::: DADOS DOS LIVROS :::..");
        System.out.println("TIPO            : "+livroInfantil1.getTipo());
        System.out.println("AUTOBIOGRAFIA   : "+livroInfantil1.isAutoajuda());
        System.out.println("TITULO        : "+ livroInfantil1.getTitulo());
    }
}