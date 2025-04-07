package com.exercitando123.CrudExercises.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public record RegisterDadosBookDTO(
		@NotBlank
		String titulo,
		@NotBlank
		String autor,
		@PastOrPresent
		LocalDate ano) {

}
