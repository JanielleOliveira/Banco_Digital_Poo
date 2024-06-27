package banco;

// Representa um cliente do banco com atributos básicos
public class Cliente {
    private String nome;
    private String cpf;

    // Construtor da classe Cliente
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }
    // Retorna o CPF do cliente
    public String getCpf() {
        return cpf;
    }

}
