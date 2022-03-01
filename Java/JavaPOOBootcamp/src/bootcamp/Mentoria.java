package bootcamp;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true)
public class Mentoria extends Atividade {

	@Getter @Setter private LocalDate data;
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}
	
	@Override
	public int calcularXp() {
		return Atividade.XP_PADRAO + 20;
	}

}
