public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Pessoa jeova = new Pessoa("Jeová", "Tavares", 37);
        Conta c = new Conta(jeova);
        c.creditar(2000.0);
        c.debitar(100.0);

        Pessoa samuel = new Pessoa("Samuel", "Rodrigues", 37);
        ContaEspecial c2 = new ContaEspecial(samuel, 200.0);
        c2.debitar(500.0);
        ContaPoupanca c3 = new ContaPoupanca(new Pessoa("Agamenon", "Quinderé", 25), 10000.0);
        c3.rendeJuros();

        PessoaJuridica nathan = new PessoaJuridica("Nathan", "Silva", 19);
        nathan.setCnpj("093.876.908.67");
        nathan.setRazaoSocial("Nathan's Interprise");
        Conta c4 = new Conta(nathan, 10000.0);

        PessoaFisica luca = new PessoaFisica("Luca", "Ribeiro", 46);
        luca.setCpf("312.876.989-12");
        luca.setSobrenome("Ribeiro");
        Conta c5 = new Conta(luca, 5000.0);

        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(nathan + c4.toString());
        System.out.println(luca + c5.toString());
    }
}
