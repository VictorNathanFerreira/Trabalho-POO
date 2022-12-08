public class ContaPoupanca extends Conta {
    private static double taxa = 0.1;

    public ContaPoupanca(double saldo){
        this.creditar(saldo);
    }
    public ContaPoupanca(Pessoa cliente, double saldo) {
        this(saldo);
        this.setCliente(cliente);
    }
    public void rendeJuros(){
        this.creditar(taxa * this.saldo);
    }
}
