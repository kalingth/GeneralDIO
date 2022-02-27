package src;
/**
 * Classe responsável por simular uma conta corrente.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class ContaCorrente extends Conta {

	private float divida;
	private float chequeEspecial;

	/*
	 * Método construtor da classe ContaCorrente. Esse método deverá receber o
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
	public ContaCorrente(int agencia, Cliente cliente, Banco banco) {
		super(agencia, cliente, banco);
		this.divida = 0.f;
		this.chequeEspecial = cliente.getSalario() - cliente.getSalario() % 1000.f + 1000.f;
	}

	/*
	 * Método responsável por calcular o saldo total disponível para o cliente.
	 * 
	 * @return float valor: Retorna o valor total disponível para a utilização pelo
	 * cliente.
	 */
	public float totalDisponivel() {
		return this.saldo + this.chequeEspecial - this.divida;
	}

	/*
	 * Método responsável por calcular o parcelamento da dívida.
	 * 
	 * @param int meses: Número de meses a para realizar o parcelamento da .
	 */
	public double calcularParcelamentoDivida(int meses) {
		double dividaTotal = this.divida * Math.pow((1.f + this.banco.getTaxaJuros() / 100.f), meses);
		return (double) dividaTotal / meses;
	}

	/*
	 * Método responsável por simular um saque em conta corrente.
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
			throw new ArithmeticException("Saldo insuficiente para realizar a transação.");
	}

	/*
	 * Método responsável por simular um depósito em conta corrente.
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
	 * Incremento do método resumo da classe pai. Aqui serão adicionadas algumas
	 * informações extras pertinentes à conta corrente.
	 * 
	 * @return String resumoDaConta: Um texto contendo informações pertinentes à
	 * conta corrente do cliente pronto para impressão.
	 */
	@Override
	public String resumo() {
		String resumoDaConta = super.resumo();
		resumoDaConta += String.format("\nCheque Especial: R$ %.2f\tDívida: R$ %.2f", this.chequeEspecial, this.divida);
		resumoDaConta += String.format("\n\t\t\tSaldo Total Disponível: R$ %.2f", this.totalDisponivel());
		return resumoDaConta;
	}

}
