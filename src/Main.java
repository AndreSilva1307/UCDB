import controle.DadosPessoaisC;
import modelo.AlunoM;
import modelo.DadosPessoaisM;
import modelo.EnderecoM;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DadosPessoaisM alex=new DadosPessoaisM("Alex","Carneiro",
                "111","AA",'M',46);
        DadosPessoaisM teste1=new DadosPessoaisM("Teste","1",
                "222","BB",'F',40);
        DadosPessoaisM teste2=new DadosPessoaisM("Teste","2",
                "333","CC",'M',18);
        EnderecoM endAlex=new EnderecoM("Francisco",194,"SetVillage",
                "CG","MS","1","nada");
        AlunoM alunoAlex=new AlunoM(1,alex,endAlex);
        DadosPessoaisC controlador=new DadosPessoaisC();
        controlador.InseriDadosPesssoais(alex);
        controlador.InseriDadosPesssoais(teste1);
        controlador.InseriDadosPesssoais(teste2);
        controlador.ListaGeralDadosPessoais();
        controlador.BuscaPorCPF("3334");


    }
}