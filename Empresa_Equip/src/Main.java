import model.*;
import controll.*;

public class Main {
    public static void main(String[] args) {

        EnderecoC enderecoController = new EnderecoC();
        DadosFinanceirosC dadosFinanceirosController = new DadosFinanceirosC();
        FornecedorC fornecedorController = new FornecedorC();
        EquipamentoEletricoC eletricoController = new EquipamentoEletricoC();
        EquipamentoMecanicoC mecanicoController = new EquipamentoMecanicoC();

        EnderecoM endereco1 = new EnderecoM("Rua das Indústrias, 123", "Distrito Industrial", "SP", "14405-231");
        EnderecoM endereco2 = new EnderecoM("Avenida das Peças, 456", "Setor Industrial", "MG", "30170-010");

        DadosFinanceirosM dadosFinanceiros1 = new DadosFinanceirosM("CUSTO-001", "2023-10-27", 10, 1500.0f);
        DadosFinanceirosM dadosFinanceiros2 = new DadosFinanceirosM("CUSTO-002", "2024-03-15", 5, 4500.0f);

        FornecedorM fornecedor1 = new FornecedorM("Fornecedor de Motores Ltda", "Sudeste", endereco1, dadosFinanceiros1);
        FornecedorM fornecedor2 = new FornecedorM("Hidráulica Avançada S.A.", "Sul", endereco2, dadosFinanceiros2);

        EquipamentoEletricoM eletrico1 = new EquipamentoEletricoM(101, "WEG", "Motor Elétrico Trifásico", fornecedor1, 220, 15, 3000, true, false);
        EquipamentoEletricoM eletrico2 = new EquipamentoEletricoM(102, "Siemens", "Conversor de Frequência", fornecedor2, 380, 25, 5000, true, false);
        
        EquipamentoMecanicoM mecanico1 = new EquipamentoMecanicoM(202, "Bosch Rexroth", "Bomba de Pistões", fornecedor1, true, "Óleo ISO VG 46", 1800, 60.0f, 0.035f, 0.92f);
        EquipamentoMecanicoM mecanico2 = new EquipamentoMecanicoM(203, "Parker", "Válvula Direcional", fornecedor2, true, "Óleo ISO VG 68", 0, 100.0f, 0, 0.98f);

        System.out.println("\n|---------- Gerenciamento de Endereços ----------|");
        enderecoController.inserirEndereco(endereco1);
        enderecoController.inserirEndereco(endereco2);
        
        System.out.print("Buscando CEP 30170-010... ");
        EnderecoM enderecoEncontrado = enderecoController.buscarEndereco("30170-010");
        if (enderecoEncontrado != null) {
            System.out.println("Encontrado!");
            enderecoEncontrado.imprimirDados();
        } else {
            System.out.println("Não encontrado.");
        }
        
        System.out.println("Total de endereços antes da remoção: " + enderecoController.contarEnderecos());
        enderecoController.removerEndereco("14405-231");
        System.out.println("Total de endereços restantes: " + enderecoController.contarEnderecos());

        System.out.println("\n|---------- Gerenciamento de Dados Financeiros ----------|");
        dadosFinanceirosController.inserirDadosFinanceiros(dadosFinanceiros1);
        dadosFinanceirosController.inserirDadosFinanceiros(dadosFinanceiros2);

        System.out.print("Buscando Centro de Custo CUSTO-001... ");
        DadosFinanceirosM dadosEncontrados = dadosFinanceirosController.buscarDadosFinanceiros("CUSTO-001");
        if (dadosEncontrados != null) {
            System.out.println("Encontrado!");
            dadosEncontrados.imprimirDados();
        } else {
            System.out.println("Não encontrado.");
        }

        System.out.println("Total de registros antes da remoção: " + dadosFinanceirosController.contarDadosFinanceiros());
        dadosFinanceirosController.removerDadosFinanceiros("CUSTO-002");
        System.out.println("Total de registros restantes: " + dadosFinanceirosController.contarDadosFinanceiros());
        
        System.out.println("\n|---------- Gerenciamento de Fornecedores ----------|");
        fornecedorController.inserirFornecedor(fornecedor1);
        fornecedorController.inserirFornecedor(fornecedor2);

        System.out.print("Buscando Fornecedor 'Hidráulica Avançada S.A.'... ");
        FornecedorM fornecedorEncontrado = fornecedorController.buscarFornecedor("Hidráulica Avançada S.A.");
        if(fornecedorEncontrado != null) {
            System.out.println("Encontrado!");
            fornecedorEncontrado.imprimirDados();
        } else {
            System.out.println("Não encontrado.");
        }

        System.out.println("Total de fornecedores antes da remoção: " + fornecedorController.contarFornecedores());
        fornecedorController.removerFornecedor("Fornecedor de Motores Ltda");
        System.out.println("Total de fornecedores restantes: " + fornecedorController.contarFornecedores());

        System.out.println("\n|---------- Gerenciamento de Equipamentos Elétricos ----------|");
        eletricoController.inserirEquipamentoEletrico(eletrico1);
        eletricoController.inserirEquipamentoEletrico(eletrico2);

        System.out.print("Buscando equipamento elétrico de código 101... ");
        EquipamentoEletricoM eletricoEncontrado = eletricoController.buscarEquipamentoEletrico(101);
        if (eletricoEncontrado != null) {
            System.out.println("Encontrado!");
            eletricoEncontrado.imprimirDados();
        } else {
            System.out.println("Não encontrado.");
        }

        System.out.println("Total de equipamentos antes da remoção: " + eletricoController.contarEquipamentosEletricos());
        eletricoController.removerEquipamentoEletrico(102);
        System.out.println("Total de equipamentos restantes: " + eletricoController.contarEquipamentosEletricos());

        System.out.println("\n|---------- Gerenciamento de Equipamentos Mecânicos ----------|");
        mecanicoController.inserirEquipamentoMecanico(mecanico1);
        mecanicoController.inserirEquipamentoMecanico(mecanico2);

        System.out.print("Buscando equipamento mecânico de código 203... ");
        EquipamentoMecanicoM mecanicoEncontrado = mecanicoController.buscarEquipamentoMecanico(203);
        if (mecanicoEncontrado != null) {
            System.out.println("Encontrado!");
            mecanicoEncontrado.imprimirDados();
        } else {
            System.out.println("Não encontrado.");
        }
        
        System.out.println("Total de equipamentos antes da remoção: " + mecanicoController.contarEquipamentosMecanicos());
        mecanicoController.removerEquipamentoMecanico(202);
        System.out.println("Total de euipamentos restantes: " + mecanicoController.contarEquipamentosMecanicos());
    }
}