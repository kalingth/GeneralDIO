/**
 * Classe respons�vel realizar a abstra��o de uma institui��o banc�ria.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class Banco {

	public static float taxaReferencial = 2.f;
	public static float taxaSelic = 10.75f;
	private int CONTADOR_CONTAS = 1;
	private float taxaJuros;
	private String nome;
	private int codigo;

	/*
	 * M�todo respons�vel por retornar as taxas de juros utilizados pela institui��o
	 * banc�ria.
	 * 
	 * @return double taxaJuros: Retorna a taxa de juros em escala percentual.
	 */
	public double getTaxaJuros() {
		return this.taxaJuros;
	}

	/*
	 * M�todo respons�vel por incrementar o n�mero global das contas banc�rias do
	 * banco em espec�fico.
	 * 
	 * @return int CONTADOR_CONTAS: Retorna o n�mero �nico da conta do cliente.
	 */
	public int novaConta() {
		return this.CONTADOR_CONTAS++;
	}

	/*
	 * M�todo respons�vel por retornar o nome da institui��o financeira.
	 * 
	 * @return String nome: Retorna o nome da institui��o financeira.
	 */
	public String getNome() {
		return this.nome;
	}

	/*
	 * M�todo respons�vel por retornar o c�digo da institui��o financeira controlado
	 * pela FEBRABAN.
	 * 
	 * @return int codigo: Retorna o c�digo que a FEBRABAN forneceu � institui��o
	 * financeira.
	 */
	public int getCodigo() {
		return this.codigo;
	}

	/*
	 * M�todo construtor da classe. Para criar um banco neste software, � necess�rio
	 * informar o nome, o c�digo da FEBRABAN e a taxa de juros da institui��o.
	 * 
	 * @param String nome: Nome da Institui��o financeira.
	 * 
	 * @param int codigoFebraban: C�digo fornecido ao banco pela FEBRABAN.
	 * 
	 * @param double taxaJuros: Taxa de juros aplicada pela institui��o financeira.
	 */
	public Banco(String nome, int codigoFebraban, float taxaJuros) {
		this.nome = nome;
		this.codigo = codigoFebraban;
		this.taxaJuros = taxaJuros;
	}
}
