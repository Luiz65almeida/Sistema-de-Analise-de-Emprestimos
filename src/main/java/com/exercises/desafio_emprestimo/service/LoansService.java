package com.exercises.desafio_emprestimo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exercises.desafio_emprestimo.model.Client;
import com.exercises.desafio_emprestimo.model.Loans;

@Service
public class LoansService {

    public Client getLoansCustumer(Client clientLoans) {

        String name = clientLoans.getName();
        double income = clientLoans.getIncome();
        // int age = clientLoans.getAge();
        // String location = clientLoans.getLocation();

        Loans personalLoan = new Loans("PERSONAL", 4);
        Loans guaranteedLoan = new Loans("GUARANTEED", 3);
        Loans consignmentLoan = new Loans("CONSIGNMENT", 2);

        if (income <= 3000) {

            return new Client(name, List.of(personalLoan, guaranteedLoan, consignmentLoan));
        }
        return null;

    }
}
