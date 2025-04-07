package com.exercitando123.CrudExercises.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercitando123.CrudExercises.DTO.ListBooksDTO;
import com.exercitando123.CrudExercises.DTO.RegisterDadosBookDTO;
import com.exercitando123.CrudExercises.DTO.UpdateBookDTO;
import com.exercitando123.CrudExercises.Entity.Livro;
import com.exercitando123.CrudExercises.Repository.RepositoryBook;

@Service
public class BookService {
	
	@Autowired
	RepositoryBook repository;
	
	public List<ListBooksDTO> listarLivros() {
        return repository.findAll().stream().map(ListBooksDTO::new).toList();
    }
	
	public void registrarLivro(RegisterDadosBookDTO dto) {
        Livro livro = new Livro(dto);
        repository.save(livro);
    }
	
	public void Atualizar(UpdateBookDTO dtoUpdate)  {
		Livro livro = repository.findById(dtoUpdate.id())
				.orElseThrow(() -> new RuntimeException("book not found"));
				livro.setTitulo(dtoUpdate.titulo());
			    livro.setAutor(dtoUpdate.autor());

			    repository.save(livro);
	}
	
}
