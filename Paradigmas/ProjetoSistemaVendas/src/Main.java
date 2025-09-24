import model.ProdutoM;
import model.PedidoM;
import controller.ProdutoC;
import controller.PedidoC;

import java.util.Date;

public class Main 
{
    public static void main(String[] args) 
    {
        ProdutoC produtoC = new ProdutoC();
        PedidoC pedidoC = new PedidoC();

        ProdutoM arroz = new ProdutoM("Arroz", 10.0, 1, 100);
        ProdutoM feijao = new ProdutoM("Feijão", 8.5, 2, 80);
        ProdutoM leite = new ProdutoM("Leite", 6.0, 3, 60);
        ProdutoM pao = new ProdutoM("Pão", 4.0, 4, 200);
        ProdutoM ovos = new ProdutoM("Ovos", 12.0, 5, 150);

        produtoC.InserirProduto(arroz);
        produtoC.InserirProduto(feijao);
        produtoC.InserirProduto(leite);
        produtoC.InserirProduto(pao);
        produtoC.InserirProduto(ovos);

        PedidoM pedido1 = new PedidoM(1, new Date(), true);
        pedido1.adicionarProduto(arroz);
        pedido1.adicionarProduto(arroz); 
        pedido1.adicionarProduto(feijao);
        pedido1.setValorTotal(10.0 * 2 + 8.5);
        pedidoC.InserirPedido(pedido1);

        PedidoM pedido2 = new PedidoM(2, new Date(), true);
        pedido2.adicionarProduto(pao);
        pedido2.adicionarProduto(ovos);
        pedido2.adicionarProduto(ovos);
        pedido2.setValorTotal(4.0 + 12.0 * 2);
        pedidoC.InserirPedido(pedido2);

        System.out.println("=== PRODUTOS ===");
        produtoC.ListarProdutos();

        System.out.println("\n=== PEDIDOS ===");
        pedidoC.ListarPedido();
    }
}
