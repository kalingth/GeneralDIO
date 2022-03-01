/*
 * Arquivo auxiliar que contem dados constantes a serem consumidos pela classe Main.
 *  
 * C�digo Javascript utilizado para extra��o dos nomes dos cursos, descri��o e carga hor�ria:

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
 * C�digo Javascript utilizado para extra��o dos nomes dos cursos, descri��o e carga hor�ria:

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
				"Conhe�a alguns colaboradores da GFT Brasil e descubra por que ela � refer�ncia em inova��o e tecnologia!",
				"1"
			},
			{
				"L�gica de Programa��o Essencial",
				"L�gica de programa��o � a forma como o desenvolvedor entende a comunica��o a fim de programar uma fun��o de um programa. Faz uso de algoritmos, que s�o sequ�ncias de passos bem estabelecidos, como por exemplo, uma receita de bolo.",
				"4"
			},
			{
				"Aprenda o que s�o Estrutura de Dados e Algoritmos",
				"Aprenda o que s�o estruturas de dados em um sistema, qual a import�ncia dela e como trabalhar com o armazenamento dessas informa��es de forma �gil e otimizada.",
				"2"
			},
			{
				"Projetos �geis com SCRUM",
				"SCRUM � um framework utilizado no gerenciamento �gil de projetos de software.  Esse curso ensinar� os fundamentos e pr�ticas da metodologia.",
				"2"
			},
			{
				"Introdu��o ao Git e ao GitHub",
				"Nesse curso vamos aprender um pouco da hist�ria do Git e como ele se tornou essencial para otimizar projetos dos desenvolvedores. Tamb�m vamos conhecer seus principais comandos, como funciona a plataforma e como ela pode simplificar o seu trabalho.",
				"5"
			},
			{
				"Dominando IDEs Java",
				"Instale e configure os principais Ambientes de Desenvolvimento Integrados (IDEs) da linguagem de programa��o Java, explorando IntelliJ e eclipse. Para isso, a expert apresenta todo o processo de instala��o al�m das primeiras dicas de uso dessas poderosas ferramentas de desenvolvimento.",
				"4"
			},
			{
				"Vari�veis, Tipos de Dados e Operadores Matem�ticos em Java",
				"Neste curso voc� vai entender o que s�o as vari�veis e aprender a manipul�-las. Para isso, o expert apresenta alguns dos principais tipos de dados e operadores aritm�ticos para que voc� aumente a sua capacidade de codifica��o em Java.",
				"2"
			},
			{
				"Entendendo M�todos Java",
				"Entenda o que s�o m�todos e os principais conceitos relacionados a eles. Para isso, o expert apresenta detalhes sobre os conceitos de assinatura e sobrecarga.",
				"2"
			},
			{
				"L�gica Condicional e Controle de Fluxos em Java",
				"Neste curso, voc� compreender� o que s�o os operadores l�gicos e relacionais e como eles podem ser usados em estruturas de controle de fluxo/decis�o.",
				"1"
			},
			{
				"Estruturas de Repeti��o e Arrays em Java",
				"Ao final deste curso, o Dev ser� capaz de compreender a usabilidade das estruturas de repeti��o e arrays na linguagem Java. E mais, todo o curso ministrado com hands-on.",
				"3"
			},
			{
				"Refor�ando o Conceito de La�os em Java",
				"Refine seus conhecimentos sobre la�os (ou estruturas de repeti��o) e como eles podem ser criados em Java. Para isso, nosso expert apresenta uma abordagem te�rica, apoiada por alguns exemplos pr�ticos.",
				"1"
			},
			{
				"Introdu��o a orienta��o a objetos com Java",
				"Aprenda de modo totalmente pr�tico os principais pilares da Programa��o Orientada a Objetos (POO).  Nesse contexto, o expert explora os conceitos de Abstra��o, Encapsulamento, Heran�a e Polimorfismo com exemplos reais.",
				"2"
			},
			{
				"Debugging Java",
				"Ao final deste curso, o Dev ir� conhecer a ferramenta de debug nas IDEs IntelliJ e Eclipse. N�o s� isso, tamb�m conhecer� como funciona a execu��o de um programa na linguagem Java.",
				"1"
			},
			{
				"Tratamento de Exce��es em Java",
				"Ao final deste curso, o Dev ser� capaz de identificar poss�veis exce��es de um aplica��o Java e interpretar eventuais pilhas de exce��o. Assim, voc� estar� preparado para capturar e tratar essas exce��es, deixando suas solu��es ainda mais robustas. Para isso, nossa super expert explica as principais diferen�as entre Unchecked Exception x Checked Exception e como criar uma Exception personalizada.",
				"2"
			},
			{
				"Trabalhando com Collections Java",
				"Aprenda o que � o Collections Framework e a aplicabilidade das suas principais interfaces: List, Set e Map. Al�m disso, conhe�a mais sobre Stream API e como ela pode nos ajudar na manipula��o das collections.",
				"6"
			},
			{
				"Introdu��o a APIs e m�todos HTTP",
				"Entenda o que � um microsservi�o, quais os principais m�todos HTTP, o que � uma API, e quais as diferen�as entre um microsservi�o e monolito.",
				"2"
			},
			{
				"Introdu��o ao Mercado de Qualidade de Software",
				"O curso tem como objetivo passar uma vis�o geral do mercado de TI e posiciona a �rea de qualidade de software nesse mercado. Fornece conceitos necess�rios para entender as fun��es e os papeis que um QA pode desempenhar. Fornece uma vis�o do processo de carreira e desenvolvimento de QA, bem como seu mindset e os conhecimentos t�cnicos necess�rios para se tornar um profissional completo.",
				"2"
			},
			{
				"Introdu��o a Testes de Software",
				"Este curso tem como principal objetivo apresentar o conceito de Testes e a sua import�ncia na Engenharia de Software.",
				"2"
			},
			{
				"Testes Unit�rios Com JUnit",
				"Neste curso voc� ir� conhecer o JUnit, framework open source amplamente utilizado no mercado para criar testes unit�rios em projetos Java. Al�m de uma contextualiza��o sobre onde se encaixa a atividade de testes unit�rios, voc� sair� deste curso com um aprofundamento nos principais recursos da ferramenta.",
				"2"
			},
			{
				"Aprenda a aplicar testes com Java",
				"Saiba como criar testes e utilizar as principais ferramentas usadas no mercado de trabalho que oferecem seguran�a e qualidade no c�digo.",
				"2"
			}
		};

	
	public static final String[][] GFTQualityAssuranceMentorias = {
			{
				"Mentoria #1: Aula Inaugural - Bootcamp GFT Quality Assurance #1",
				"Nesta aula ser� demonstrado como ser� todo o processo a partir daqui at� a etapa de uma poss�vel contrata��o. Tamb�m ser�o explicados os como o Bootcamp � dividido, o que s�o cursos, mentorias, projetos e desafios de c�digo.",
				"23/02/2022"
			},
			{
				"Mentoria #2:  Profissional QA. Desafios e oportunidades na GFT",
				"Nesta mentoria um expert da GFT estar� presente para demonstrar quais s�o os soft skills desej�veis para o profissional GFT.",
				"24/02/2022"
			},
			{
				"Mentoria #3: Como resolver os desafios de c�digo",
				"Esta mentoria est� destinada ao esclarecimento de d�vida sobre a plataforma e de como resolver os desafios de c�digo.",
				"07/03/2022"
			},
			{
				"Mentoria #4: Abstraindo Situa��es do Mundo Real com Orienta��o a Objetos",
				"Mentoria realizada pela DIO para retirar suas d�vidas sobre POO!",
				"10/03/2022"
			},
			{
				"Mentoria #5 Agile Tester",
				"O teste �gil � uma pr�tica de teste de software que segue os princ�pios do desenvolvimento �gil de software. Nesta mentoria um expert da GFT ir� demonstrar os conceitos e pr�ticas do teste �gil.",
				"14/03/2022"
			},
			{
				"Mentoria #6 QA na pr�tica. Exemplos pr�ticos de testes em API",
				"Exemplos pr�ticos de testes em API!",
				"15/03/2022"
			},
			{
				"Mentoria #7: Escrita Cucumber - Gherkin (BDD) - Behavior Driven Development",
				"Saiba tudo sobre Escrita Cucumber - Gherkin (BDD) - Behavior Driven Development!",
				"16/03/2022"
			},
			{
				"Mentoria #8: Como ser contratado pela GFT",
				"Evento de gradua��o! Neste evento um expert da GFT poder� mostrar os pr�ximos passos rumo � contra��o.",
				"24/03/2022"
			}
				
			};
}
