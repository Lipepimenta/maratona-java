package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estatico de pessoa");
    }

    {
        System.out.println("Bloco de inicialização dentro de pessoa 01");
    }

    {
        System.out.println("Bloco de inicialização dentro de pessoa 02");
    }

    public Pessoa(String nome){
        System.out.println("Bloco dentro do construtor pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" CEP: "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
