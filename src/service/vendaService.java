package service;
import model.Cliente;
import model.Venda;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class vendaService {
    private List<Venda> vendas = new ArrayList<>();

    public Venda realizarVenda(int id, Cliente cliente, List<Produto> produtos){
        Venda venda = new Venda(id, cliente, produtos);
        vendas.add(venda);
        return venda;
    }

    public List<Venda> listarVendas(){
        return vendas;
    }

    public boolean cancelarVenda(int id){
        return vendas.removeIf(venda -> venda.getId() == id);
    }

}
