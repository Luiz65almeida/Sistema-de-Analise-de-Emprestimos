package com.exercises.desafio_emprestimo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercises.desafio_emprestimo.model.Loans;
import com.exercises.desafio_emprestimo.repository.LoansRepository;

@Service
public class LoansService {

    @Autowired
    private LoansRepository loansRepository;

    public List<Loans> findAll() {
        return loansRepository.findAll();
    }

    public Loans findById(Long id) {
        Optional<Loans> obj = loansRepository.findById(id);
        return obj.get();
    }

    public Loans insert(Loans obj) {
        return loansRepository.save(obj);
    }

    public void delete(Long id) {
        loansRepository.deleteById(id);
    }

    public Loans update(Long id, Loans obj) {
        Loans entity = loansRepository.getReferenceById(id);
        updateData(entity, obj);
        return loansRepository.save(entity);
    }

    private void updateData(Loans entity, Loans obj) {

    }

}
