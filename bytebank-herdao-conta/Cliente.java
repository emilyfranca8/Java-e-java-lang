package modelo;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String profissão;

    public String GetNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String GetCpf() {
        return cpf;
    }
}