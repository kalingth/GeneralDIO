package bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import lombok.*;

@ToString
@EqualsAndHashCode
public class Dev {

	@Getter private String nome;
	@Getter private Set<Atividade> atividadesInscritas = new LinkedHashSet<>();
    @Getter private Set<Atividade> atividadesConcluidas = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
    	this.atividadesInscritas.addAll(bootcamp.getConteudos());
    	bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir() {
    	Optional<Atividade> atividade = this.atividadesInscritas.stream().findFirst();
    	if(atividade.isEmpty()) {
    	  System.err.println("O desenvolvedor não está inscrito em nenhuma atividade");
    	  return;
    	}
    	this.atividadesConcluidas.add(atividade.get());
    	this.atividadesInscritas.remove(atividade.get());
    }
    
    public int calcularTotalXP() {
    	Stream<Atividade> concluirAtividade = this.atividadesConcluidas.stream();
    	return concluirAtividade.mapToInt(Atividade::calcularXp).sum();
    }

    public Dev(String nome) {
    	this.nome = nome;
    }
}
