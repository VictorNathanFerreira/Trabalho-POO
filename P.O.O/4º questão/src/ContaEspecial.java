public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(Pessoa cliente) {
        super(cliente);
        this.limite = 500.0;
        this.numero = this.numero + "S";
    }
    public ContaEspecial(Pessoa cliente, double saldo) {
        this(cliente);
        this.saldo = saldo;
    }
    public void setLimite(double valor){
        this.limite = valor;
    }
    public void setLimite(String valor) {
        double num = Double.parseDouble(valor);
        this.limite = num;
    }
    public double getLimite(){
        return this.limite;
    }
    public void debitar(double valor) {
        double saldoTotal = this.saldo + this.limite;
        if (valor <= saldoTotal) {
            this.saldo -= valor;
        }

    }
    public String toString() {
        return super.toString() + "\nLimite: " + this.limite + "\nStaldo Total: " + (this.limite + this.saldo) + "\n-----------------\n";
    }
}
