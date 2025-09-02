package model;

import java.time.LocalDate;
import java.util.List;

public class Venda {

    private int id;
    private Cliente cliente;
    private List<Produto> listaProdutos;
    private double valorTotal;
    private LocalDate data;

    public Venda(){

    }

    public Venda(int id, Cliente cliente, List<Produto> listaProdutos){
        this.id = id;
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.valorTotal = calcularTotal(); //metodo importado de: bigdecimal
        this.data = LocalDate.now();  //metodo importado de: localdate
    }

    private double calcularTotal() {
        return listaProdutos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() +
                ", valorTotal=" + valorTotal +
                ", data=" + data +
                '}';
    }
}
