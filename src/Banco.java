import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contasList;

	public Banco(String nome) {
		this.nome = nome;
		this.contasList = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contasList;
	}

	public void adicionarContaNaLista(Conta contaAdicionada) {
		contasList.add(contaAdicionada);
		System.out.println("Conta " + contaAdicionada.getNumero() + "-" + contaAdicionada.getAgencia());
	}

	public void imprimirListaDeContas() {
		System.out.println("====Lista de Contas====");
		for(Conta c : contasList) {
			System.out.println("--Conta--\n" +
							   "Titular: " + c.getTitular() + "\n"
							   + "Número: " + c.getNumero() + "\n"
							   + "Agencia: " + c.getAgencia() + "\n");
		}
	}

}
