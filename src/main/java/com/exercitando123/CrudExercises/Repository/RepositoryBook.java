package com.exercitando123.CrudExercises.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercitando123.CrudExercises.Entity.Livro;

@Repository
public interface RepositoryBook extends JpaRepository<Livro, Long> {
	
}
