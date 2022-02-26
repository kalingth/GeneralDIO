/**
 * Classe responsável pela abstração dos clientes de um banco.
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
	 * Método responsável por retornar o CPF do cliente.
	 * 
	 * @return String cpf: Retorna o identificador númérico
	 * "Cadastro de Pessoa Física"
	 */
	public String getCpf() {
		return this.cpf;
	}

	/*
	 * Método responsável por retornar o nome do cliente.
	 * 
	 * @return String nomeCliente: Retorna o nome do cliente.
	 */
	public String getNome() {
		return this.nomeCliente;
	}

	/*
	 * Método responsável por retornar a data de nascimento do cliente.
	 * 
	 * @return String dataNascimento: Retorna a data de nascimento do cliente em
	 * formato textual.
	 */
	public String getNasc() {
		return this.dataNascimento;
	}

	/*
	 * Método responsável por retornar o salário do cliente.
	 * 
	 * @return float salario: Retorna um número real que representa o salário do
	 * cliente.
	 */
	public float getSalario() {
		return this.salario;
	}

	/*
	 * Método construtor da classe Cliente. Para abrir uma conta, o cliente
	 * precisará informar o nome, o cpf, a data de nascimento e o salário.
	 * 
	 * @param String nome: Nome do cliente.
	 * 
	 * @param String cpf: Número do CPF do cliente em formato textual.
	 * 
	 * @param String dataNascimento: Data de nascimento do cliente em formato
	 * textual.
	 * 
	 * @param float salario: Salário atual do cliente.
	 */
	public Cliente(String nome, String cpf, String dataNascimento, float salario) {
		this.nomeCliente = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
}
