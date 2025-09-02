package model;

public class Cliente {

    private String nome;
    private int cpf;
    private String email;
    private int telefone;

    public static void main(String args[]){
        Cliente cliente = new Cliente("sasa", 258, "sasa@.com", 145236);
        System.out.printf("cleinte: %s %d %s %d", cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getTelefone());
    }

    public Cliente(){

    }

    public Cliente(String nome, int cpf, String email, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        }

    //JAVA> getter e setter fora do construtor
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public int getTelefone(){
        return telefone;
    }
}
