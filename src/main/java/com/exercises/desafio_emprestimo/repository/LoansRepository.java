package com.exercises.desafio_emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercises.desafio_emprestimo.model.Loans;

public interface LoansRepository extends JpaRepository<Loans, Long> {

}
