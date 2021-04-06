package com.pro.projetoh2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //Entidade do Banco
@Table(name = "TB_CLIENTE")
public class Cliente {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Responsabilidade do banco de dados fazer o incremento do id
		private Long id;
		
		@Column(nullable = true )
		private String nome;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		
}
