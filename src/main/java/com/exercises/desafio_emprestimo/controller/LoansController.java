package com.exercises.desafio_emprestimo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exercises.desafio_emprestimo.model.Loans;
import com.exercises.desafio_emprestimo.service.LoansService;

@RestController
@RequestMapping(value = "/loans")
public class LoansController {
    @Autowired
    private LoansService service;

    @GetMapping
    public ResponseEntity<List<Loans>> findAll() {
        List<Loans> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Loans> findById(@PathVariable Long id) {
        Loans obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Loans> insert(@RequestBody Loans obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{type}")
                .buildAndExpand(obj.getType()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Loans> update(@PathVariable Long id, @RequestBody Loans obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
