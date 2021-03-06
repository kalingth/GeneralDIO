package src;

import lombok.Getter;

/**
 * Classe respons?vel realizar a abstra??o de uma institui??o banc?ria.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
public class Banco {

	public static float taxaReferencial = 2.f;
	public static float taxaSelic = 10.75f;
	private int CONTADOR_CONTAS = 1;
	@Getter private float taxaJuros;
	@Getter private String nome;
	@Getter private int codigo;


	/*
	 * M?todo respons?vel por incrementar o n?mero global das contas banc?rias do
	 * banco em espec?fico.
	 * 
	 * @return int CONTADOR_CONTAS: Retorna o n?mero ?nico da conta do cliente.
	 */
	public int novaConta() {
		return this.CONTADOR_CONTAS++;
	}


	/*
	 * M?todo construtor da classe. Para criar um banco neste software, ? necess?rio
	 * informar o nome, o c?digo da FEBRABAN e a taxa de juros da institui??o.
	 * 
	 * @param String nome: Nome da Institui??o financeira.
	 * 
	 * @param int codigoFebraban: C?digo fornecido ao banco pela FEBRABAN.
	 * 
	 * @param double taxaJuros: Taxa de juros aplicada pela institui??o financeira.
	 */
	public Banco(String nome, int codigoFebraban, float taxaJuros) {
		this.nome = nome;
		this.codigo = codigoFebraban;
		this.taxaJuros = taxaJuros;
	}
}
