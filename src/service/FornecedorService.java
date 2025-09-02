package service;

import model.Fornecedor;
import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class FornecedorService {

    private List<Fornecedor> fornecedores = new ArrayList<>();

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
        System.out.println("Fornecedor cadastrado: " + fornecedor.getNome());
    }

    public void listarFornecedores() {
        fornecedores.forEach(f -> System.out.println(f.getNome() + " - CNPJ: " + f.getCnpj()));
    }

    public void fornecerProduto(Fornecedor fornecedor, Produto produto, int quantidade) {
        System.out.println("Fornecedor " + fornecedor.getNome() +
                " forneceu " + quantidade + " unidades do produto " + produto.getNome());
    }
}
