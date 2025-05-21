public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("PagBank");


		Cliente cliente1 = new Cliente("Nicolas", "123.456.789-10");
		Cliente cliente2 = new Cliente("Júnior", "789.456.123-70");

		cliente1.iprimirInformacoesCliente();

		Conta contaCorrenteCliente1 = new ContaCorrente(cliente1);
		Conta contaPoupancaCliente2 = new ContaPoupanca(cliente2);
		banco.adicionarContaNaLista(contaCorrenteCliente1);
		banco.adicionarContaNaLista(contaPoupancaCliente2);

		contaCorrenteCliente1.depositar(100);
		contaCorrenteCliente1.transferir(100, contaPoupancaCliente2);
		
		contaCorrenteCliente1.imprimirExtrato();
		contaPoupancaCliente2.imprimirExtrato();
		banco.imprimirListaDeContas();
	}

}
