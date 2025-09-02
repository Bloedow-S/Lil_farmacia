package main.java.br.com.canoas.farmacia;

import model.Cliente;
import model.Produto;
import model.Venda;
import model.Fornecedor;
import service.vendaService;
import service.EstoqueService;
import service.FornecedorService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar cliente
        Cliente cliente = new Cliente("Sabrina", 123456, "sabrina@email.com", 1199999);

        // Criar produtos
        Produto arroz = new Produto(1, "Arroz", 10.0, 10);
        Produto feijao = new Produto(2, "Feijão", 5.0, 2);

        // Criar fornecedor
        Fornecedor fornecedor = new Fornecedor("Nivea", 1256780, 2562188, "Cosmeticos");

        // Inicializar services
        FornecedorService fornecedorService = new FornecedorService();
        EstoqueService estoqueService = new EstoqueService();
        vendaService vendaService_1 = new vendaService();

        // Cadastrar fornecedor
        fornecedorService.cadastrarFornecedor(fornecedor);

        // Registrar entrada no estoque
        estoqueService.adicionarProduto(arroz, 20); // +20 arroz
        estoqueService.adicionarProduto(feijao, 30); // +30 feijão

        // Realizar uma venda
        Venda venda = vendaService_1.realizarVenda(
                1,
                cliente,
                List.of(arroz, feijao)
        );

        // Listar vendas
        System.out.println("\n=== Vendas cadastradas ===");
        for (Venda v : vendaService_1.listarVendas()) {
            System.out.println(v); // chama automaticamente o toString()
        }
    }
}
