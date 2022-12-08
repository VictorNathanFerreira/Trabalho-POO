public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String fullName(){
        return this.nome + " " + this.sobrenome;
    }

    public String toString(){
        return "\n--------------------\n" + this.fullName() + ", com " + this.idade + " anos.";
    }
}