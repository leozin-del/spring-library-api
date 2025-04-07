package com.exercitando123.CrudExercises.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercitando123.CrudExercises.DTO.ListBooksDTO;
import com.exercitando123.CrudExercises.DTO.RegisterDadosBookDTO;
import com.exercitando123.CrudExercises.DTO.UpdateBookDTO;
import com.exercitando123.CrudExercises.Service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/library-api")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<ListBooksDTO> ListarLivros() {
        return bookService.listarLivros();
    }
	
	 @PostMapping
	    public void BookRegister(@RequestBody @Valid RegisterDadosBookDTO registrarLivro) {
	        bookService.registrarLivro(registrarLivro);
	    }
	
	 @PutMapping
	 public void UpdateBook(@RequestBody @Valid UpdateBookDTO update) {
		 bookService.Atualizar(update);
	 }
}
