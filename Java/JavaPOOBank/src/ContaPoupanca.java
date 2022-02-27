package src;
/**
 * Classe respons�vel por simular uma conta poupan�a.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class ContaPoupanca extends Conta {

	/*
	 * M�todo construtor da classe ContaPoupanca. Esse m�todo dever� receber o
	 * n�mero da ag�ncia, o cliente propriet�rio da conta, a institui��o banc�ria
	 * para cadastro e um dep�sito inicial obrigat�rio para a abertura da conta.
	 * 
	 * @param int agencia: N�mero da ag�ncia onde est� sendo aberta a conta.
	 * 
	 * @param Cliente cliente: O cliente atendido na abertura dessa conta corrente.
	 * 
	 * @param Banco banco: Institui��o banc�ria onde o cadastramento est� sendo
	 * realizado.
	 * 
	 * @param float depositoInicial: Valor do dep�sito inicial realizado na conta
	 * poupan�a.
	 */
	public ContaPoupanca(int agencia, Cliente cliente, Banco banco, float depositoInicial) {
		super(agencia, cliente, banco);
		this.saldo = depositoInicial;
	}

	/*
	 * M�todo respons�vel por simular um saque em conta poupan�a.
	 * 
	 * @param float valor: Valor sacado na conta poupan�a.
	 */
	@Override
	public void sacar(float valor) {
		if (this.saldo >= valor) {
			float calculoScore = valor / this.cliente.getSalario();
			this.score = (this.score - calculoScore > 0) ? this.score - calculoScore : 0.f;
			this.saldo -= valor;
		} else
			throw new ArithmeticException("Saldo insuficiente para realizar a transa��o.");
	}

	/*
	 * M�todo respons�vel por simular um dep�sito em conta poupan�a.
	 * 
	 * @param float valor: Valor depositado na conta poupan�a.
	 */
	@Override
	public void depositar(float valor) {
		float calculoScore = 10.f * valor / this.cliente.getSalario();
		this.score = (this.score + calculoScore < 100) ? this.score + calculoScore : 100;
		this.saldo += valor;
	}

	/*
	 * M�todo respons�vel por simular os rendimentos do saldo da conta ao longo dos
	 * meses.
	 * 
	 * @param int meses: N�mero de meses para analizar.
	 * 
	 * @return float saldoFinal: Saldo dispon�vel na conta poupan�a ap�s o per�odo
	 * requisitado.
	 */
	public float perspectivaSaldo(int meses) {
		float taxaPoupanca = Banco.taxaReferencial + ((Banco.taxaSelic > 8.5) ? 6.17f : .7f * Banco.taxaSelic) / 12.f;
		return (float) (this.saldo * Math.pow((1.0f + taxaPoupanca / 100.0f), meses));
	}

}
