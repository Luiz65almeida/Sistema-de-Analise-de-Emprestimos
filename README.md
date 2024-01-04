# Sistema de análise de emprestimos com java e Spring-boot

**Descrição:**
Este repositório contém uma implementação em Java usando Spring Boot para um serviço que determina as modalidades de empréstimo a que uma pessoa tem acesso com base em critérios específicos. As modalidades incluem Empréstimo Pessoal, Empréstimo Consignado e Empréstimo com Garantia, cada uma com taxas de juros distintas.

**Recursos e Tecnologias:**
- Java
- Spring Boot
- JPA (Java Persistence API)
- Hibernate
- Maven

**Funcionalidades Principais:**
1. Determinação das modalidades de empréstimo com base na idade, salário e localização do cliente.
2. Recebimento de solicitações HTTP com informações do cliente.
3. Resposta contendo o nome do cliente e a lista de empréstimos disponíveis com os respectivos tipos e taxas de juros.

**Instruções de Uso:**
1. Clone o repositório: `git clone https://github.com/seu-usuario/desafio-emprestimo-spring`
2. Navegue até o diretório do projeto: `cd desafio-emprestimo-spring`
3. Execute o aplicativo Spring Boot: `./mvnw spring-boot:run` (ou `./gradlew bootRun` se estiver usando Gradle)
4. O serviço estará acessível em `http://localhost:8080/customer-loans` para receber solicitações.

## Requisitos

- Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30
  anos e residir em São Paulo (SP).
- Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
- Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver
  menos de 30 anos e residir em São Paulo (SP).
#
**Exemplo de Solicitação HTTP:**

**[POST]** `{{host}}/customer-loans`
```json
{
  "age": 26,
  "cpf": "123.456.789-01",
  "name": "Exemplo Cliente",
  "income": 5000.00,
  "location": "SP"
}
```

**Exemplo de Resposta:**
```
HTTP/1.1 200 Ok
```
```json
    {
      "customer": "Exemplo Cliente",
      "loans": [
        {
          "type": "PERSONAL",
          "interestRate": 4
        },
        {
          "type": "CONSIGNMENT",
          "interestRate": 2
        }
      ]
    }
```
