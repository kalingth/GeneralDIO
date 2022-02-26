/**
 * Classe respons�vel pela abstra��o dos clientes de um banco.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class Cliente {

	private String nomeCliente;
	private String cpf;
	private String dataNascimento;
	private float salario;

	/*
	 * M�todo respons�vel por retornar o CPF do cliente.
	 * 
	 * @return String cpf: Retorna o identificador n�m�rico
	 * "Cadastro de Pessoa F�sica"
	 */
	public String getCpf() {
		return this.cpf;
	}

	/*
	 * M�todo respons�vel por retornar o nome do cliente.
	 * 
	 * @return String nomeCliente: Retorna o nome do cliente.
	 */
	public String getNome() {
		return this.nomeCliente;
	}

	/*
	 * M�todo respons�vel por retornar a data de nascimento do cliente.
	 * 
	 * @return String dataNascimento: Retorna a data de nascimento do cliente em
	 * formato textual.
	 */
	public String getNasc() {
		return this.dataNascimento;
	}

	/*
	 * M�todo respons�vel por retornar o sal�rio do cliente.
	 * 
	 * @return float salario: Retorna um n�mero real que representa o sal�rio do
	 * cliente.
	 */
	public float getSalario() {
		return this.salario;
	}

	/*
	 * M�todo construtor da classe Cliente. Para abrir uma conta, o cliente
	 * precisar� informar o nome, o cpf, a data de nascimento e o sal�rio.
	 * 
	 * @param String nome: Nome do cliente.
	 * 
	 * @param String cpf: N�mero do CPF do cliente em formato textual.
	 * 
	 * @param String dataNascimento: Data de nascimento do cliente em formato
	 * textual.
	 * 
	 * @param float salario: Sal�rio atual do cliente.
	 */
	public Cliente(String nome, String cpf, String dataNascimento, float salario) {
		this.nomeCliente = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
}
