package bootcamp;

import lombok.*;

@ToString(callSuper=true)
public class Curso extends Atividade {

	@Getter private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public int calcularXp() {
		return Atividade.XP_PADRAO * this.cargaHoraria;
	}

}