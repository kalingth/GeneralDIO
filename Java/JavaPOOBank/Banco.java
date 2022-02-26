/**
 * Classe responsável realizar a abstração de uma instituição bancária.
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
	 * Método responsável por retornar as taxas de juros utilizados pela instituição
	 * bancária.
	 * 
	 * @return double taxaJuros: Retorna a taxa de juros em escala percentual.
	 */
	public double getTaxaJuros() {
		return this.taxaJuros;
	}

	/*
	 * Método responsável por incrementar o número global das contas bancárias do
	 * banco em específico.
	 * 
	 * @return int CONTADOR_CONTAS: Retorna o número único da conta do cliente.
	 */
	public int novaConta() {
		return this.CONTADOR_CONTAS++;
	}

	/*
	 * Método responsável por retornar o nome da instituição financeira.
	 * 
	 * @return String nome: Retorna o nome da instituição financeira.
	 */
	public String getNome() {
		return this.nome;
	}

	/*
	 * Método responsável por retornar o código da instituição financeira controlado
	 * pela FEBRABAN.
	 * 
	 * @return int codigo: Retorna o código que a FEBRABAN forneceu à instituição
	 * financeira.
	 */
	public int getCodigo() {
		return this.codigo;
	}

	/*
	 * Método construtor da classe. Para criar um banco neste software, é necessário
	 * informar o nome, o código da FEBRABAN e a taxa de juros da instituição.
	 * 
	 * @param String nome: Nome da Instituição financeira.
	 * 
	 * @param int codigoFebraban: Código fornecido ao banco pela FEBRABAN.
	 * 
	 * @param double taxaJuros: Taxa de juros aplicada pela instituição financeira.
	 */
	public Banco(String nome, int codigoFebraban, float taxaJuros) {
		this.nome = nome;
		this.codigo = codigoFebraban;
		this.taxaJuros = taxaJuros;
	}
}
