
public class Cliente {

	private static int SEQUENCIAL = 1;

	protected String nome;
	protected final String cpf;
	protected final int id;


	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.id = SEQUENCIAL++;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setNome(String nomeNovo) {
		this.nome = nomeNovo;
	}

	public void iprimirInformacoesCliente() {

		System.out.println("==== CLIENTE ===" +
						   "\nNome: " + nome +
						   "\nCPF: " + cpf +
						   "\nId: " + id);
	}
}
