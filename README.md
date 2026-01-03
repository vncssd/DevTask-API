# DevTask API 🚀

Este repositório contém uma API REST desenvolvida em **Spring Boot** para o gerenciamento de desenvolvedores e suas respectivas tarefas. O projeto foi construído como parte de um estudo prático focado em consolidar os pilares do desenvolvimento backend e o ecossistema Spring.

## 📌 Sobre o Projeto

O sistema permite o cadastro de desenvolvedores e a atribuição de múltiplas tarefas (tasks) a cada um deles, explorando a fundo relacionamentos entre entidades e a arquitetura de uma aplicação profissional.

### 🎯 Objetivos de Aprendizado:
* **Criação de API REST:** Implementação de endpoints seguindo os padrões do protocolo HTTP.
* **JPA (Java Persistence API):** Gerenciamento de persistência e mapeamento objeto-relacional.
* **Fundamentos de Desenvolvimento Backend:** Entendimento de camadas (Controller, Service, Repository) e regras de negócio.
* **Versionamento de Código:** Uso de Git para controle de histórico e organização de repositórios.
* **Versionamento de Banco de Dados:** Práticas de estruturação e manipulação de dados em memória.
* **Ecossistema Spring:** Utilização da suíte Spring (Boot, Data JPA, Web).
* **Spring Annotations:** Uso intensivo de anotações (`@RestController`, `@Service`, `@Repository`, `@OneToMany`, etc) para produtividade e configuração.

## 🛠 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3**
* **Spring Data JPA**
* **H2 Database** (Banco de dados em memória)
* **Maven** (Gerenciador de dependências)

## 🗄 Banco de Dados (H2)

Para facilitar o estudo e agilizar os testes, o projeto utiliza o **H2 Database**. 

* **Console H2:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`

---

## ⚙️ Configuração do Ambiente (.env)

O projeto utiliza variáveis de ambiente para maior segurança e flexibilidade. Crie um arquivo chamado **`.env`** na raiz do projeto (mesmo nível do arquivo `pom.xml`):

```env
# Configurações do Banco de Dados
DB_URL=jdbc:h2:mem:testdb
DB_USERNAME=sa
DB_PASSWORD=password

# Configurações do Hibernate
HIBERNATE_DIALECT=org.hibernate.dialect.H2Dialect
SHOW_SQL=true
