package bootcamp;

import lombok.*;
import java.time.LocalDate;
import java.util.*;

@ToString
@EqualsAndHashCode
public class Bootcamp {

	@Getter private String nome;
	@Getter @Setter private String descricao;
	@Getter private final LocalDate dataInicio = LocalDate.now();
	@Getter private final LocalDate dataFim = dataInicio.plusDays(45);
	
	@Getter private Set<Dev> devsInscritos = new HashSet<>();
	@Getter private Set<Atividade> conteudos = new LinkedHashSet<>();
	
	public Bootcamp(String nome){
		this.nome = nome;
	}
	
}
