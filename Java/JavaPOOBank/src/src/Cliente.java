package src;
/**
 * Classe respons�vel pela abstra��o dos clientes de um banco.
 * 
 * @author Wallace Rocha Faria
 * @version 1.0
 * @course GFT Quality Assurance
 */
import java.time.LocalDate;

import lombok.Getter;

public class Cliente {

	@Getter private String nomeCliente;
	@Getter private String cpf;
	@Getter private LocalDate dataNascimento;
	@Getter private float salario;

	/*
	 * M�todo construtor da classe Cliente. Para abrir uma conta, o cliente
	 * precisar� informar o nome, o cpf, a data de nascimento e o sal�rio.
	 * 
	 * @param String nome: Nome do cliente.
	 * 
	 * @param String cpf: N�mero do CPF do cliente em formato textual.
	 * 
	 * @param String dataNascimento: Data de nascimento do cliente.
	 * 
	 * @param float salario: Sal�rio atual do cliente.
	 */
	public Cliente(String nome, String cpf, LocalDate dataNascimento, float salario) {
		this.nomeCliente = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
}
