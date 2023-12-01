package com.exercises.desafio_emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercises.desafio_emprestimo.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
