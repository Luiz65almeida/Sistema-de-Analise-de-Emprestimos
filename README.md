**Título:** Desafio de Empréstimo - Serviço Spring Boot

**Descrição:**
Este repositório contém uma implementação em Java usando Spring Boot para um serviço que determina as modalidades de empréstimo a que uma pessoa tem acesso com base em critérios específicos. As modalidades incluem Empréstimo Pessoal, Empréstimo Consignado e Empréstimo com Garantia, cada uma com taxas de juros distintas.

**Recursos e Tecnologias:**
- Java
- Spring Boot
- JPA (Java Persistence API)
- Hibernate
- Maven (ou Gradle)

**Funcionalidades Principais:**
1. Determinação das modalidades de empréstimo com base na idade, salário e localização do cliente.
2. Recebimento de solicitações HTTP com informações do cliente.
3. Resposta contendo o nome do cliente e a lista de empréstimos disponíveis com os respectivos tipos e taxas de juros.

**Instruções de Uso:**
1. Clone o repositório: `git clone https://github.com/seu-usuario/desafio-emprestimo-spring`
2. Navegue até o diretório do projeto: `cd desafio-emprestimo-spring`
3. Execute o aplicativo Spring Boot: `./mvnw spring-boot:run` (ou `./gradlew bootRun` se estiver usando Gradle)
4. O serviço estará acessível em `http://localhost:8080/customer-loans` para receber solicitações.

**Configuração do Banco de Dados:**
- Certifique-se de configurar corretamente as propriedades do banco de dados no arquivo `application.properties` ou `application.yml` (por exemplo, URL, nome de usuário, senha).

**Exemplo de Solicitação HTTP:**
```json
[POST] http://localhost:8080/customer-loans

{
  "age": 26,
  "cpf": "123.456.789-01",
  "name": "Exemplo Cliente",
  "income": 5000.00,
  "location": "SP"
}


Exemplo de Resposta:
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

