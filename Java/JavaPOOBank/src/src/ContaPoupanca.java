package src;
/**
 * Classe responsável por simular uma conta poupança.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class ContaPoupanca extends Conta {

	/*
	 * Método construtor da classe ContaPoupanca. Esse método deverá receber o
	 * número da agência, o cliente proprietário da conta, a instituição bancária
	 * para cadastro e um depósito inicial obrigatório para a abertura da conta.
	 * 
	 * @param int agencia: Número da agência onde está sendo aberta a conta.
	 * 
	 * @param Cliente cliente: O cliente atendido na abertura dessa conta corrente.
	 * 
	 * @param Banco banco: Instituição bancária onde o cadastramento está sendo
	 * realizado.
	 * 
	 * @param float depositoInicial: Valor do depósito inicial realizado na conta
	 * poupança.
	 */
	public ContaPoupanca(int agencia, Cliente cliente, Banco banco, float depositoInicial) {
		super(agencia, cliente, banco);
		this.saldo = depositoInicial;
	}

	/*
	 * Método responsável por simular um saque em conta poupança.
	 * 
	 * @param float valor: Valor sacado na conta poupança.
	 */
	@Override
	public void sacar(float valor) {
		if (this.saldo >= valor) {
			float calculoScore = valor / this.cliente.getSalario();
			this.score = (this.score - calculoScore > 0) ? this.score - calculoScore : 0.f;
			this.saldo -= valor;
		} else
			throw new ArithmeticException("Saldo insuficiente para realizar a transação.");
	}

	/*
	 * Método responsável por simular um depósito em conta poupança.
	 * 
	 * @param float valor: Valor depositado na conta poupança.
	 */
	@Override
	public void depositar(float valor) {
		float calculoScore = 10.f * valor / this.cliente.getSalario();
		this.score = (this.score + calculoScore < 100) ? this.score + calculoScore : 100;
		this.saldo += valor;
	}

	/*
	 * Método responsável por simular os rendimentos do saldo da conta ao longo dos
	 * meses.
	 * 
	 * @param int meses: Número de meses para analizar.
	 * 
	 * @return float saldoFinal: Saldo disponível na conta poupança após o período
	 * requisitado.
	 */
	public float perspectivaSaldo(int meses) {
		float taxaPoupanca = Banco.taxaReferencial + ((Banco.taxaSelic > 8.5) ? 6.17f : .7f * Banco.taxaSelic) / 12.f;
		return (float) (this.saldo * Math.pow((1.0f + taxaPoupanca / 100.0f), meses));
	}

}
