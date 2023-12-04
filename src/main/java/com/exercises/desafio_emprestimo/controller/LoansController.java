package com.exercises.desafio_emprestimo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercises.desafio_emprestimo.model.Client;

@RestController
@RequestMapping(value = "/loans")
public class LoansController {

  @PostMapping
  public Client getCustomerLoans(@RequestBody Client customerRequest) {
    return customerLoanService.getCustomerLoans(customerRequest);
  }

}
