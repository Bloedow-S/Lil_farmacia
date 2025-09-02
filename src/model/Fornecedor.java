package model;

public class Fornecedor {

    String nome;
    int cnpj;
    int telefone;
    String categoriaProduto;

    public static void main(String arges[]){
        Fornecedor fornecedor = new Fornecedor("Nivea", 1255843, 513525, "comesticos");
        System.out.printf("%s %d %d %s", fornecedor.getNome(), fornecedor.getTelefone(), fornecedor.getCnpj(), fornecedor.getCategoriaProduto());
    }

    Fornecedor (){

    }

    public Fornecedor(String nome, int cnpj, int telefone, String categoriaProduto){
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.categoriaProduto = categoriaProduto;
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    private void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }

    public int getCnpj(){
        return cnpj;
    }

    private void setTelefone(int telefone){
        this.telefone = telefone;
    }

    private int getTelefone(){
        return telefone;
    }

    private void setCategoriaProduto(String categoriaProduto){
        this.categoriaProduto = categoriaProduto;
    }

    public String getCategoriaProduto(){
        return categoriaProduto;
    }

}