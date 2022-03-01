
import bootcamp.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		Bootcamp gftQA = new Bootcamp("GFT Quality Assurance");
		
		// Instanciando os cursos presentes no bootcamp GFT Quality Assurance.
		for(String[] curso: Constants.GFTQualityAssuranceCursos) {
			Curso gftCurso = new Curso(curso[0], curso[1], Integer.parseInt(curso[2]));
			gftQA.getConteudos().add(gftCurso);
		}
		
		// Instanciando as mentorias presentes no bootcamp GFT Quality Assurance.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for(String[] mentoria: Constants.GFTQualityAssuranceMentorias) {
			LocalDate date = LocalDate.parse(mentoria[2], formatter);
			Mentoria gftMentoria = new Mentoria(mentoria[0], mentoria[1], date);
			gftQA.getConteudos().add(gftMentoria);
		}
		
		Dev devKalingth = new Dev("B. Kalingth");
		Dev devJonh = new Dev("Jonh x1");
		
		devKalingth.inscreverBootcamp(gftQA);
		devJonh.inscreverBootcamp(gftQA);
		
		for(int count = 0; count < 5; count++) devJonh.progredir();
		for(int count = 0; count < 6; count++) devKalingth.progredir();
		
		
		System.out.println("XP John: " + devJonh.calcularTotalXP());
		System.out.println("XP Kalingth: " + devKalingth.calcularTotalXP());
	}
}
