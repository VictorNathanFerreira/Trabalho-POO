public class PessoaJuridica extends Pessoa{

    public PessoaJuridica(){
    }
    public String cnpj;
    public String razaoSocial;

    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    public void setRazaoSocial(){
        this.razaoSocial = razaoSocial;
    }
    public String toString(){
        return this.cnpj + this.razaoSocial;
    }

}
