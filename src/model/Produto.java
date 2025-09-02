package model;

public class Produto {

    public int id;
    public String nome;
    public double preco;
    public int qde;

    public static void main(String args[]){
        Produto produto = new Produto(2323, "uva", 2.3, 5);

        System.out.printf("%d %s %d %.2f", produto.getId(), produto.getNome(), produto.getQde(), produto.getPreco());

    }

    Produto(){

    }

    public Produto(int id, String nome, double preco, int qde) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qde = qde;

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setQde(int qde){
        this.qde = qde;
    }

    public int getQde(){
        return qde;
    }

}
