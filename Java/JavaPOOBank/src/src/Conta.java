package src;

import lombok.Getter;

/**
 * Classe base responsável por implementar métodos e atributos genéricos de
 * contas bancárias e assumir contratos de implementação para suas classes
 * filhas.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public abstract class Conta {

	protected Banco banco;
	protected Cliente cliente;
	@Getter protected int conta;
	@Getter protected int agencia;
	@Getter protected float saldo;
	@Getter protected float score;

	abstract public void sacar(float valor);

	abstract public void depositar(float valor);

	/*
	 * Método responsável por resumir os dados do cliente da instituição.
	 * 
	 * @return String resumoDaConta: Um texto contendo informações pertinentes à
	 * conta do cliente pronto para impressão.
	 */
	public String resumo() {
		String resumoDaConta = "";
		resumoDaConta += String.format("Banco: %s\t\tCódigo FEBRABAN: %d", 
										this.banco.getNome(), this.banco.getCodigo());
		resumoDaConta += String.format("\nCliente: %s\tCPF: %s",
										this.cliente.getNomeCliente(), this.cliente.getCpf());
		resumoDaConta += "\n----------------------------------";
		resumoDaConta += String.format("\nSaldo: R$ %.2f\nScore: %.2f%%",
										this.saldo, this.score);
		return resumoDaConta;
	}

	/*
	 * Método construtor da classe abstrata Conta. Esse método deverá receber o
	 * número da agência, o cliente proprietário da conta e a instituição bancária
	 * para cadastro.
	 * 
	 * @param int agencia: Número da agência onde está sendo aberta a conta.
	 * 
	 * @param Cliente cliente: O cliente atendido na abertura dessa conta corrente.
	 * 
	 * @param Banco banco: Instituição bancária onde o cadastramento está sendo
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
	 * Método responsável por simular um empréstimo.
	 * 
	 * @return float valorEmprestimo: Valor disponível para empréstimo pela
	 * instituição financeira.
	 */
	public float emprestimoDisponivel() {
		return this.score * this.cliente.getSalario();
	}

}
