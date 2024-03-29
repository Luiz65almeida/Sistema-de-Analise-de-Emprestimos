package com.exercises.desafio_emprestimo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private Integer age;

  private String cpf;

  private Integer income;

  private String location;

  public Client() {
  }

  @OneToMany(mappedBy = "client")
  private List<Loans> loans;

  public Client(String name, List<Loans> loans) {
    this.name = name;
    this.loans = loans;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Integer getIncome() {
    return income;
  }

  public void setIncome(Integer income) {
    this.income = income;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Long getId() {
    return id;
  }

  public List<Loans> getLoans() {
    return loans;
  }

  public void setLoans(List<Loans> loans) {
    this.loans = loans;
  }

}
