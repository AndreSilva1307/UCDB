import modelo.DadosPessoaisM;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        DadosPessoaisM andre = new DadosPessoaisM();
        andre.setPrimeironome("Andre");
        andre.setSobrenome("Silva");
        andre.setIdade(19);
        andre.setSexo('M');
        andre.setCpf("067.399.861-42");
        andre.setRg("2.406.071");
        andre.setDataDeNascimento("13/07/2006");
        andre.setNomeMae("Rosemeire");
        andre.ImprimirDadosPessoais();
        andre.MaiorIdade();
    }
}
