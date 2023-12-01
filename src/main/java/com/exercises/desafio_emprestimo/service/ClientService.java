package com.exercises.desafio_emprestimo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercises.desafio_emprestimo.model.Client;

@Service
public class ClientService {

    @Autowired
    private com.exercises.desafio_emprestimo.repository.ClientRepository ClientRepository;

    public List<Client> findAll() {
        return ClientRepository.findAll();
    }

    public Client findById(Long id) {
        Optional<Client> obj = ClientRepository.findById(id);
        return obj.get();
    }

    public Client insert(Client obj) {
        return ClientRepository.save(obj);
    }

    public void delete(Long id) {
        ClientRepository.deleteById(id);
    }

    public Client update(Long id, Client obj) {
        Client entity = ClientRepository.getReferenceById(id);
        updateData(entity, obj);
        return ClientRepository.save(entity);
    }

    private void updateData(Client entity, Client obj) {

    }
}
