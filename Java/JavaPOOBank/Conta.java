/**
 * Classe base respons�vel por implementar m�todos e atributos gen�ricos de
 * contas banc�rias e assumir contratos de implementa��o para suas classes
 * filhas.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public abstract class Conta {

	protected Banco banco;
	protected Cliente cliente;
	protected int conta;
	protected int agencia;
	protected float saldo;
	protected float score;

	abstract public void sacar(float valor);

	abstract public void depositar(float valor);

	/*
	 * M�todo respons�vel por resumir os dados do cliente da institui��o.
	 * 
	 * @return String resumoDaConta: Um texto contendo informa��es pertinentes �
	 * conta do cliente pronto para impress�o.
	 */
	public String resumo() {
		String resumoDaConta = "";
		resumoDaConta += String.format("Banco: %s\t\tC�digo FEBRABAN: %d", 
										this.banco.getNome(), this.banco.getCodigo());
		resumoDaConta += String.format("\nCliente: %s\tCPF: %s",
										this.cliente.getNome(), this.cliente.getCpf());
		resumoDaConta += "\n----------------------------------";
		resumoDaConta += String.format("\nSaldo: R$ %.2f\nScore: %.2f%%",
										this.saldo, this.score);
		return resumoDaConta;
	}

	/*
	 * M�todo respons�vel por retornar o n�mero da ag�ncia da conta.
	 * 
	 * @return int agencia: n�mero da ag�ncia da conta.
	 */
	public int getAgencia() {
		return this.agencia;
	}

	/*
	 * M�todo respons�vel por retornar o n�mero da conta.
	 * 
	 * @return int conta: N�mero da conta banc�ria do cliente.
	 */
	public int getConta() {
		return this.conta;
	}

	/*
	 * M�todo respons�vel por retornar o saldo dispon�vel.
	 * 
	 * @return float saldo: Saldo dispon�vel na conta do cliente.
	 */
	public float getSaldo() {
		return this.saldo;
	}

	/*
	 * M�todo respons�vel retornar o score da conta banc�ria do cliente.
	 * 
	 * @return float score: Score da conta em escala percentual.
	 */
	public float getScore() {
		return this.score;
	}

	/*
	 * M�todo construtor da classe abstrata Conta. Esse m�todo dever� receber o
	 * n�mero da ag�ncia, o cliente propriet�rio da conta e a institui��o banc�ria
	 * para cadastro.
	 * 
	 * @param int agencia: N�mero da ag�ncia onde est� sendo aberta a conta.
	 * 
	 * @param Cliente cliente: O cliente atendido na abertura dessa conta corrente.
	 * 
	 * @param Banco banco: Institui��o banc�ria onde o cadastramento est� sendo
	 * realizado.
	 */
	public Conta(int agencia, Cliente cliente, Banco banco) {
		this.agencia = agencia;
		this.cliente = cliente;
		this.banco = banco;
		this.conta = banco.novaConta();
		this.saldo = 0.f;
		this.score = 50.f;
	}

	/*
	 * M�todo respons�vel por simular um empr�stimo.
	 * 
	 * @return float valorEmprestimo: Valor dispon�vel para empr�stimo pela
	 * institui��o financeira.
	 */
	public float emprestimoDisponivel() {
		return this.score * this.cliente.getSalario();
	}

}
