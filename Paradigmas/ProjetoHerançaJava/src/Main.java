import model.AdministradorM;
import model.EmpregadoM;
import model.EnderecoM;
import model.OperarioM;
import model.PessoaM;
import model.TelefoneM;
import model.VendedorM;

public class Main {
    public static void main(String[] args) throws Exception {
       
        TelefoneM telefone1 = new TelefoneM("+55", "67", "99999-9999");
        TelefoneM telefone2 = new TelefoneM("+55", "67", "98888-8888");
        TelefoneM telefone3 = new TelefoneM("+55", "67", "97777-7777");

        EnderecoM endereco1 = new EnderecoM("Rua A", "123", "Bairro A",
         "Cidade A", "Estado A", "País A", "12345-678");
        EnderecoM endereco2 = new EnderecoM("Rua B", "456", "Bairro B",
         "Cidade B", "Estado B", "País B", "23456-789");
        EnderecoM endereco3 = new EnderecoM("Rua C", "789", "Bairro C",
         "Cidade C", "Estado C", "País C", "34567-890");

        PessoaM pessoa1 = new PessoaM("João Silva", endereco1, telefone1);
        PessoaM pessoa2 = new PessoaM("Maria Oliveira", endereco2, telefone2);
        PessoaM pessoa3 = new PessoaM("Carlos Souza", endereco3, telefone3);

        EmpregadoM empregado1 = new EmpregadoM(pessoa1, 101, 3000.00, 10.0);
        EmpregadoM empregado2 = new EmpregadoM(pessoa2, 102, 4500.00, 15.0);
        EmpregadoM empregado3 = new EmpregadoM(pessoa3, 103, 6000.00, 20.0);
    
        AdministradorM admin1 = new AdministradorM(empregado1, 500.00);
        AdministradorM admin2 = new AdministradorM(empregado2, 800.00);
        AdministradorM admin3 = new AdministradorM(empregado3, 1000.00);

        OperarioM operario1 = new OperarioM(empregado1, 20000.00, 5.0);
        OperarioM operario2 = new OperarioM(empregado2, 30000.00, 7.5);
        OperarioM operario3 = new OperarioM(empregado3, 40000.00, 10.0);

        VendedorM vendedor1 = new VendedorM(empregado1, 15000.00, 3.0);
        VendedorM vendedor2 = new VendedorM(empregado2, 25000.00, 4.0);
        VendedorM vendedor3 = new VendedorM(empregado3, 35000.00, 5.0);
    }
}
