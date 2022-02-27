package src;
/**
 * Classe respons�vel por simular uma conta corrente.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class ContaCorrente extends Conta {

	private float divida;
	private float chequeEspecial;

	/*
	 * M�todo construtor da classe ContaCorrente. Esse m�todo dever� receber o
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
	public ContaCorrente(int agencia, Cliente cliente, Banco banco) {
		super(agencia, cliente, banco);
		this.divida = 0.f;
		this.chequeEspecial = cliente.getSalario() - cliente.getSalario() % 1000.f + 1000.f;
	}

	/*
	 * M�todo respons�vel por calcular o saldo total dispon�vel para o cliente.
	 * 
	 * @return float valor: Retorna o valor total dispon�vel para a utiliza��o pelo
	 * cliente.
	 */
	public float totalDisponivel() {
		return this.saldo + this.chequeEspecial - this.divida;
	}

	/*
	 * M�todo respons�vel por calcular o parcelamento da d�vida.
	 * 
	 * @param int meses: N�mero de meses a para realizar o parcelamento da .
	 */
	public double calcularParcelamentoDivida(int meses) {
		double dividaTotal = this.divida * Math.pow((1.f + this.banco.getTaxaJuros() / 100.f), meses);
		return (double) dividaTotal / meses;
	}

	/*
	 * M�todo respons�vel por simular um saque em conta corrente.
	 * 
	 * @param float valor: Valor sacado na conta corrente.
	 */
	@Override
	public void sacar(float valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			this.score += 2.f;
		} else if (this.saldo + this.chequeEspecial - this.divida >= valor) {
			float calculoScore = 10.f * (valor - this.saldo) / this.chequeEspecial;
			this.score = (this.score - calculoScore > 0.f) ? this.score - calculoScore : 0.f;
			this.divida = this.chequeEspecial + this.saldo - valor;
			this.saldo = 0.f;
		} else
			throw new ArithmeticException("Saldo insuficiente para realizar a transa��o.");
	}

	/*
	 * M�todo respons�vel por simular um dep�sito em conta corrente.
	 * 
	 * @param float valor: Valor depositado na conta corrente.
	 */
	@Override
	public void depositar(float valor) {
		if (valor > this.divida) {
			this.score = (this.score + 15.f > 100.f) ? 100.f : this.score + 15.f;
			this.saldo += valor - this.divida;
			this.divida = 0.f;
		} else {
			float calculoScore = 15.f * valor / this.divida;
			this.score = (this.score + calculoScore > 100.f) ? 100.f : this.score + calculoScore;
			this.divida -= valor;
		}
	}

	/*
	 * Incremento do m�todo resumo da classe pai. Aqui ser�o adicionadas algumas
	 * informa��es extras pertinentes � conta corrente.
	 * 
	 * @return String resumoDaConta: Um texto contendo informa��es pertinentes �
	 * conta corrente do cliente pronto para impress�o.
	 */
	@Override
	public String resumo() {
		String resumoDaConta = super.resumo();
		resumoDaConta += String.format("\nCheque Especial: R$ %.2f\tD�vida: R$ %.2f", this.chequeEspecial, this.divida);
		resumoDaConta += String.format("\n\t\t\tSaldo Total Dispon�vel: R$ %.2f", this.totalDisponivel());
		return resumoDaConta;
	}

}
