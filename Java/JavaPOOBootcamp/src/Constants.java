/*
 * Arquivo auxiliar que contem dados constantes a serem consumidos pela classe Main.
 *  
 * Código Javascript utilizado para extração dos nomes dos cursos, descrição e carga horária:

	let output = "{\n";
	for (elem of document.querySelector(".vertical-timeline").childNodes) {
	    if (!elem.innerHTML.includes("AULAS"))
	        continue;
	    titulo = elem.querySelector("h5").innerHTML;
	    descricao = elem.querySelector("p").innerHTML;
	    cargaHoraria = parseInt(elem.querySelectorAll("h6")[1].innerHTML);
	    console.log(cargaHoraria)
	    output += `\t\t{\n\t\t\t\"${titulo}\",\n\t\t\t\"${descricao}",\n\t\t\t\"${cargaHoraria}"\n\t\t},\n`
	}
	console.log(output + "\n\t}");

 * 
 * Código Javascript utilizado para extração dos nomes dos cursos, descrição e carga horária:

	let output = "\t{\n";
	for (elem of document.querySelector(".vertical-timeline").childNodes) {
	    if (!elem.innerHTML.includes("Mentoria"))
	        continue;
	    titulo = elem.querySelector("h5").innerHTML;
	    descricao = elem.querySelector("p").innerHTML;
	    data = elem.querySelector("h6").innerHTML;
	    output += `\t\t{\n\t\t\t"${titulo}",\n\t\t\t"${descricao}",\n\t\t\t"${data}"\n\t\t},\n`
	}
	console.log(output + "\n\t}");

 * 
 */


public final class Constants {
	public static final String[][] GFTQualityAssuranceCursos = {
			{
				"GFT Quality Assurance #1",
				"Conheça alguns colaboradores da GFT Brasil e descubra por que ela é referência em inovação e tecnologia!",
				"1"
			},
			{
				"Lógica de Programação Essencial",
				"Lógica de programação é a forma como o desenvolvedor entende a comunicação a fim de programar uma função de um programa. Faz uso de algoritmos, que são sequências de passos bem estabelecidos, como por exemplo, uma receita de bolo.",
				"4"
			},
			{
				"Aprenda o que são Estrutura de Dados e Algoritmos",
				"Aprenda o que são estruturas de dados em um sistema, qual a importância dela e como trabalhar com o armazenamento dessas informações de forma ágil e otimizada.",
				"2"
			},
			{
				"Projetos ágeis com SCRUM",
				"SCRUM é um framework utilizado no gerenciamento ágil de projetos de software.  Esse curso ensinará os fundamentos e práticas da metodologia.",
				"2"
			},
			{
				"Introdução ao Git e ao GitHub",
				"Nesse curso vamos aprender um pouco da história do Git e como ele se tornou essencial para otimizar projetos dos desenvolvedores. Também vamos conhecer seus principais comandos, como funciona a plataforma e como ela pode simplificar o seu trabalho.",
				"5"
			},
			{
				"Dominando IDEs Java",
				"Instale e configure os principais Ambientes de Desenvolvimento Integrados (IDEs) da linguagem de programação Java, explorando IntelliJ e eclipse. Para isso, a expert apresenta todo o processo de instalação além das primeiras dicas de uso dessas poderosas ferramentas de desenvolvimento.",
				"4"
			},
			{
				"Variáveis, Tipos de Dados e Operadores Matemáticos em Java",
				"Neste curso você vai entender o que são as variáveis e aprender a manipulá-las. Para isso, o expert apresenta alguns dos principais tipos de dados e operadores aritméticos para que você aumente a sua capacidade de codificação em Java.",
				"2"
			},
			{
				"Entendendo Métodos Java",
				"Entenda o que são métodos e os principais conceitos relacionados a eles. Para isso, o expert apresenta detalhes sobre os conceitos de assinatura e sobrecarga.",
				"2"
			},
			{
				"Lógica Condicional e Controle de Fluxos em Java",
				"Neste curso, você compreenderá o que são os operadores lógicos e relacionais e como eles podem ser usados em estruturas de controle de fluxo/decisão.",
				"1"
			},
			{
				"Estruturas de Repetição e Arrays em Java",
				"Ao final deste curso, o Dev será capaz de compreender a usabilidade das estruturas de repetição e arrays na linguagem Java. E mais, todo o curso ministrado com hands-on.",
				"3"
			},
			{
				"Reforçando o Conceito de Laços em Java",
				"Refine seus conhecimentos sobre laços (ou estruturas de repetição) e como eles podem ser criados em Java. Para isso, nosso expert apresenta uma abordagem teórica, apoiada por alguns exemplos práticos.",
				"1"
			},
			{
				"Introdução a orientação a objetos com Java",
				"Aprenda de modo totalmente prático os principais pilares da Programação Orientada a Objetos (POO).  Nesse contexto, o expert explora os conceitos de Abstração, Encapsulamento, Herança e Polimorfismo com exemplos reais.",
				"2"
			},
			{
				"Debugging Java",
				"Ao final deste curso, o Dev irá conhecer a ferramenta de debug nas IDEs IntelliJ e Eclipse. Não só isso, também conhecerá como funciona a execução de um programa na linguagem Java.",
				"1"
			},
			{
				"Tratamento de Exceções em Java",
				"Ao final deste curso, o Dev será capaz de identificar possíveis exceções de um aplicação Java e interpretar eventuais pilhas de exceção. Assim, você estará preparado para capturar e tratar essas exceções, deixando suas soluções ainda mais robustas. Para isso, nossa super expert explica as principais diferenças entre Unchecked Exception x Checked Exception e como criar uma Exception personalizada.",
				"2"
			},
			{
				"Trabalhando com Collections Java",
				"Aprenda o que é o Collections Framework e a aplicabilidade das suas principais interfaces: List, Set e Map. Além disso, conheça mais sobre Stream API e como ela pode nos ajudar na manipulação das collections.",
				"6"
			},
			{
				"Introdução a APIs e métodos HTTP",
				"Entenda o que é um microsserviço, quais os principais métodos HTTP, o que é uma API, e quais as diferenças entre um microsserviço e monolito.",
				"2"
			},
			{
				"Introdução ao Mercado de Qualidade de Software",
				"O curso tem como objetivo passar uma visão geral do mercado de TI e posiciona a área de qualidade de software nesse mercado. Fornece conceitos necessários para entender as funções e os papeis que um QA pode desempenhar. Fornece uma visão do processo de carreira e desenvolvimento de QA, bem como seu mindset e os conhecimentos técnicos necessários para se tornar um profissional completo.",
				"2"
			},
			{
				"Introdução a Testes de Software",
				"Este curso tem como principal objetivo apresentar o conceito de Testes e a sua importância na Engenharia de Software.",
				"2"
			},
			{
				"Testes Unitários Com JUnit",
				"Neste curso você irá conhecer o JUnit, framework open source amplamente utilizado no mercado para criar testes unitários em projetos Java. Além de uma contextualização sobre onde se encaixa a atividade de testes unitários, você sairá deste curso com um aprofundamento nos principais recursos da ferramenta.",
				"2"
			},
			{
				"Aprenda a aplicar testes com Java",
				"Saiba como criar testes e utilizar as principais ferramentas usadas no mercado de trabalho que oferecem segurança e qualidade no código.",
				"2"
			}
		};

	
	public static final String[][] GFTQualityAssuranceMentorias = {
			{
				"Mentoria #1: Aula Inaugural - Bootcamp GFT Quality Assurance #1",
				"Nesta aula será demonstrado como será todo o processo a partir daqui até a etapa de uma possível contratação. Também serão explicados os como o Bootcamp é dividido, o que são cursos, mentorias, projetos e desafios de código.",
				"23/02/2022"
			},
			{
				"Mentoria #2:  Profissional QA. Desafios e oportunidades na GFT",
				"Nesta mentoria um expert da GFT estará presente para demonstrar quais são os soft skills desejáveis para o profissional GFT.",
				"24/02/2022"
			},
			{
				"Mentoria #3: Como resolver os desafios de código",
				"Esta mentoria está destinada ao esclarecimento de dúvida sobre a plataforma e de como resolver os desafios de código.",
				"07/03/2022"
			},
			{
				"Mentoria #4: Abstraindo Situações do Mundo Real com Orientação a Objetos",
				"Mentoria realizada pela DIO para retirar suas dúvidas sobre POO!",
				"10/03/2022"
			},
			{
				"Mentoria #5 Agile Tester",
				"O teste ágil é uma prática de teste de software que segue os princípios do desenvolvimento ágil de software. Nesta mentoria um expert da GFT irá demonstrar os conceitos e práticas do teste ágil.",
				"14/03/2022"
			},
			{
				"Mentoria #6 QA na prática. Exemplos práticos de testes em API",
				"Exemplos práticos de testes em API!",
				"15/03/2022"
			},
			{
				"Mentoria #7: Escrita Cucumber - Gherkin (BDD) - Behavior Driven Development",
				"Saiba tudo sobre Escrita Cucumber - Gherkin (BDD) - Behavior Driven Development!",
				"16/03/2022"
			},
			{
				"Mentoria #8: Como ser contratado pela GFT",
				"Evento de graduação! Neste evento um expert da GFT poderá mostrar os próximos passos rumo à contração.",
				"24/03/2022"
			}
				
			};
}
