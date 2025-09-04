import model.PedidoM;
import model.ProdutoM;
import controller.PedidoC;
import controller.ProdutoC;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args) 
    {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        
        ProdutoM laranja = new ProdutoM("Laranja", 5.99, 1, 150);
        ProdutoM maca = new ProdutoM("Maça", 8.00, 2, 100);
        ProdutoM uva = new ProdutoM("Uva", 12.50, 3, 32);

        PedidoM pedido1 = new PedidoM(1, (new Date()), true, 5.99);
        PedidoM pedido2 = new PedidoM(2, (new Date()), false, 25.00);
        PedidoM pedido3 = new PedidoM(3, (new Date()), true, 32.00);

        ProdutoC controller_produto=new ProdutoC();
        controller_produto.InserirProduto(laranja);
        controller_produto.InserirProduto(maca);
        controller_produto.InserirProduto(uva);
        PedidoC controller_pedido=new PedidoC();
        controller_pedido.InserirPedido(pedido1);
        controller_pedido.InserirPedido(pedido2);
        controller_pedido.InserirPedido(pedido3);

        controller_pedido.ListarPedido();
    }
}
