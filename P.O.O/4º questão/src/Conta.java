public class Conta {
    protected String numero;
    protected Pessoa cliente;
    protected double saldo;
    public Conta() {
        int n = (int)(Math.random() * 10000.0 + 1.0);
        String numConta = "c" + n;
        this.numero = numConta;
    }
    public Conta(Pessoa cliente) {
        this();
        this.cliente = cliente;
    }
    public Conta(Pessoa cliente, double saldo) {
        this(cliente);
        this.saldo = saldo;
    }
    private String mostra() {
        String saida = "--------------";
        saida = saida + "\nCliente: " + this.cliente.getNome();
        saida = saida + "\nNumero: " + this.numero;
        saida = saida + "\nSaldo :" + this.saldo;
        saida = saida + "\n-------------\n";
        return saida;
    }
    public String toString() {
        return "\n" + this.mostra();
    }
    public void creditar(double valor) {
        if (valor >= 0.0) {
            this.saldo += valor;
        }

    }
    public void debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }

    }
    public double getSaldo(){
        return this.saldo;
    }
    public Pessoa getCliente(){
        return this.cliente;
    }

    public void setCliente(Pessoa cliente){
        this.cliente = cliente;
    }
    public void setCliente(String nome, String sobrenome, int idade) {
        Pessoa cliente = new Pessoa(nome, sobrenome, idade);
        this.cliente = cliente;
    }
}