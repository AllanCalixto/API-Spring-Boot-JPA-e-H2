package br.com.maddytec.cliente.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Criar os getters, setters e toStrings automaticamente
@AllArgsConstructor //Criar os constructors com as propriedades que criarmos a classe cliente
@NoArgsConstructor //Criar um construtor vazio
@Builder //Ajuda na criacao do objeto clientes
@Entity //Informa que é uma entidade do banco de dados


public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="cl_name", nullable=false)
	private String nome;
	
	@Column(name="cl_email", nullable=false)
	private String email;
	
	@Column(name="cl_cpf", nullable=false)
	private String cpf;
}