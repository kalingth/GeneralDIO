package bootcamp;

import lombok.*;

@ToString
public abstract class Atividade {

	@Getter protected String titulo;
	@Getter @Setter protected String descricao;
	protected static final Integer XP_PADRAO = 20; // A experi�ncia na DIO � sempre um n�mero inteiro m�ltiplo de 20.
	
	public abstract int calcularXp();

}
