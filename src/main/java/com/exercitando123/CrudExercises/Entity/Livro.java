package com.exercitando123.CrudExercises.Entity;

import java.time.LocalDate;

import com.exercitando123.CrudExercises.DTO.RegisterDadosBookDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "Livros")
public class Livro {
	
	public Livro(@Valid RegisterDadosBookDTO registrarLivro) {
		this.titulo = registrarLivro.titulo();
		this.autor = registrarLivro.autor();
		this.ano = registrarLivro.ano();
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String autor;
	private LocalDate ano;
	
	
	
}
