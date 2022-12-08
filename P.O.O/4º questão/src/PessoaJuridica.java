public class PessoaJuridica extends Pessoa {
    protected String cnpj;
    protected String razaoSocial;

    public PessoaJuridica(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String toString() {
        return super.toString() + "\nPessoaJuridica:" + "\nCnpj: " + this.cnpj + "\nRazãoSocial: " + this.razaoSocial + "\n-----------------\n";
    }
}
