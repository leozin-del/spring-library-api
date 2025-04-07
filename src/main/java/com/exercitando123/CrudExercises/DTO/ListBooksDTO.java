package com.exercitando123.CrudExercises.DTO;

import java.time.LocalDate;

import com.exercitando123.CrudExercises.Entity.Livro;





public record ListBooksDTO(
		
		String titulo,
		
		String autor,
		
		LocalDate ano
		) {
	public ListBooksDTO(Livro livro) {
		this(livro.getTitulo(), livro.getAutor(), livro.getAno());
	}
	
	
}
