import controll.AlunoGraduacaoC;
import controll.AlunoMestradoDoutoradoC;
import model.AlunoGraduacaoM;
import model.AlunoMestradoDoutoradoM;
import model.DadosPessoaisM;
import model.EnderecoM;

public class Main {
    public static void main(String[] args) {
        
        AlunoGraduacaoC       alunoGraduacaoController = new AlunoGraduacaoC();
        AlunoMestradoDoutoradoC mestradoDoutoradoController = new AlunoMestradoDoutoradoC();

        
        System.out.println("### CADASTRANDO ALUNOS DE GRADUAÇÃO ###");

        DadosPessoaisM dadosPessoaisG1 = new DadosPessoaisM("João Silva Pai", "Maria Silva Mãe", "11.111.111-1", 'M', 19);
        EnderecoM enderecoG1 = new EnderecoM("Rua das Flores", 123, "SP", "São Paulo", "01000-001");
        AlunoGraduacaoM alunoG1 = new AlunoGraduacaoM(1001, "João da Silva", "10/05/2004", dadosPessoaisG1, enderecoG1, 'N', true, 550.0f, 'B');
        
        DadosPessoaisM dadosPessoaisG2 = new DadosPessoaisM("Carlos Souza Pai", "Ana Souza Mãe", "22.222.222-2", 'F', 21);
        EnderecoM enderecoG2 = new EnderecoM("Avenida Principal", 456, "RJ", "Rio de Janeiro", "02000-002");
        AlunoGraduacaoM alunoG2 = new AlunoGraduacaoM(1002, "Ana de Souza", "20/08/2002", dadosPessoaisG2, enderecoG2, 'M', false, 1200.0f, 'L');

        alunoGraduacaoController.inserirAlunoGraduacao(alunoG1);
        alunoGraduacaoController.inserirAlunoGraduacao(alunoG2);
        
        System.out.println("### CADASTRANDO ALUNOS DE MESTRADO/DOUTORADO ###");

        DadosPessoaisM dadosPessoaisMD1 = new DadosPessoaisM("Pedro Costa Pai", "Lúcia Costa Mãe", "33.333.333-3", 'M', 25);
        EnderecoM enderecoMD1 = new EnderecoM("Rua da Pesquisa", 789, "MG", "Belo Horizonte", "03000-003");
        AlunoMestradoDoutoradoM alunoMD1 = new AlunoMestradoDoutoradoM(2001, "Pedro Costa", "15/01/1998", dadosPessoaisMD1, enderecoMD1, "Dr. Ricardo", "CAPES", 2200.0f, 2023);

        DadosPessoaisM dadosPessoaisMD2 = new DadosPessoaisM("Fernando Lima Pai", "Beatriz Lima Mãe", "44.444.444-4", 'F', 28);
        EnderecoM enderecoMD2 = new EnderecoM("Avenida da Ciência", 101, "RS", "Porto Alegre", "04000-004");
        AlunoMestradoDoutoradoM alunoMD2 = new AlunoMestradoDoutoradoM(2002, "Beatriz Lima", "30/11/1995", dadosPessoaisMD2, enderecoMD2, "Dra. Cláudia", "CNPq", 2500.0f, 2022);

        mestradoDoutoradoController.inserirAlunoMestradoDoutorado(alunoMD1);
        mestradoDoutoradoController.inserirAlunoMestradoDoutorado(alunoMD2);

        System.out.println("\n\n### EXIBINDO TODOS OS ALUNOS CADASTRADOS ###");
        
        System.out.println("\n======= ALUNOS DE GRADUAÇÃO =======");
        alunoGraduacaoController.imprimirTodos();
        
        System.out.println("\n======= ALUNOS DE MESTRADO/DOUTORADO =======");
        mestradoDoutoradoController.imprimirTodos();
        
        System.out.println("\n\n### DEMONSTRANDO BUSCA E REMOÇÃO ###");
        
        System.out.println("\n--- Buscando aluno de graduação com RA 1001 ---");
        alunoGraduacaoController.buscaPorRaImprimi(1001);
        
        System.out.println("\n--- Removendo aluno de graduação com RA 1001 ---");
        boolean removido = alunoGraduacaoController.removeCadastroPorRa(1001);
        System.out.println("Aluno foi removido? " + (removido ? "Sim" : "Não"));
        
        System.out.println("\n--- Tentando buscar aluno com RA 1001 novamente ---");
        alunoGraduacaoController.buscaPorRaImprimi(1001);
        
        System.out.println("\n--- Listando todos os alunos de graduação restantes ---");
        alunoGraduacaoController.imprimirTodos();
    }
}