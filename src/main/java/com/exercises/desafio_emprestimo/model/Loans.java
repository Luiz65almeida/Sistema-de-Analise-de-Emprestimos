package com.exercises.desafio_emprestimo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_loans")
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String type;

    private Integer interestRate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

}
