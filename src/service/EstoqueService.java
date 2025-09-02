package service;

import model.Produto;
import java.util.HashMap;
import java.util.Map;

public class EstoqueService {

    private Map<Produto, Integer> estoque = new HashMap<>();

    public void adicionarProduto(Produto produto, int qde) {
        estoque.put(produto, estoque.getOrDefault(produto, 0) + qde);
        System.out.println("Produto adicionado ao estoque: " + produto.getNome() + " | Quantidade: " + qde);
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        int qtdAtual = estoque.getOrDefault(produto, 0);
        if (qtdAtual >= quantidade) {
            estoque.put(produto, qtdAtual - quantidade);
            System.out.println("Produto removido do estoque: " + produto.getNome() + " | Quantidade: " + quantidade);
            return true;
        }
        System.out.println("Estoque insuficiente para o produto: " + produto.getNome());
        return false;
    }

    public int consultarEstoque(Produto produto) {
        return estoque.getOrDefault(produto, 0);
    }
}
