# JDBC CRUD – Seller & Department Management

Aplicação Java desenvolvida para demonstrar o uso do **JDBC** em operações de **CRUD (Create, Read, Update, Delete)** sobre um banco de dados **MySQL**, aplicando o padrão de projeto **DAO (Data Access Object)** para separação das camadas de negócio e acesso a dados.

---

## 🚀 Visão Geral

O projeto simula um sistema simples de **gerenciamento de vendedores e departamentos**, permitindo executar operações como inserção, atualização, exclusão e consulta de registros.  
A aplicação foi estruturada seguindo boas práticas de arquitetura, com pacotes organizados e tratamento de exceções personalizadas.

---

## 🧩 Estrutura do Projeto

```
src/
├── application/
│   ├── Program.java
│   └── Program2.java
│
├── db/
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
│
├── model/
│   ├── entities/
│   │   ├── Department.java
│   │   └── Seller.java
│   │
│   ├── dao/
│   │   ├── DepartmentDao.java
│   │   ├── SellerDao.java
│   │   └── DaoFactory.java
│   │
│   └── dao/impl/
│       ├── DepartmentDaoJDBC.java
│       └── SellerDaoJDBC.java
│
├── db.properties
└── demo-dao-jdbc.iml
```

---

## ⚙️ Tecnologias Utilizadas

-   **Java 17+**
-   **MySQL**
-   **JDBC API**
-   **DAO Pattern**
-   **IntelliJ IDEA** (ambiente de desenvolvimento)

---

## 🧠 Conceitos Aplicados

-   **Padrão DAO (Data Access Object):** separa a lógica de persistência da lógica de negócio.
-   **Tratamento de exceções customizadas:** uso de `DbException` e `DbIntegrityException`.
-   **Conexão configurável via arquivo externo:** `db.properties`.
-   **Boas práticas de encapsulamento e modularização.**

---

## 💻 Execução do Projeto

1. Clone o repositório:

    ```bash
    git clone https://github.com/fabricio-vianna/jdbc-crud-seller-department.git
    ```

2. Configure o arquivo `db.properties` com os dados do seu banco MySQL:

    ```properties
    user=seu_usuario
    password=sua_senha
    dburl=jdbc:mysql://localhost:3306/coursejdbc
    useSSL=false
    ```

3. Execute o script SQL abaixo para criar o banco e tabelas.

---

## 🗄️ Estrutura do Banco de Dados (MySQL)

```sql
CREATE DATABASE coursejdbc;

USE coursejdbc;

CREATE TABLE department (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(60) NOT NULL
);

CREATE TABLE seller (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(60) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    BirthDate DATE NOT NULL,
    BaseSalary DOUBLE NOT NULL,
    DepartmentId INT NOT NULL,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```

---

## ▶️ Testes Implementados

As classes `Program.java` e `Program2.java` executam os testes de CRUD das entidades:

-   **Seller (Program.java)**

    -   `findById`
    -   `findByDepartment`
    -   `findAll`
    -   `insert`
    -   `update`
    -   `deleteById`

-   **Department (Program2.java)**
    -   `findById`
    -   `findAll`
    -   `insert`
    -   `update`
    -   `deleteById`

---

## 📁 Padrão de Pacotes

| Pacote           | Finalidade                                       |
| ---------------- | ------------------------------------------------ |
| `application`    | Contém as classes principais de execução (main). |
| `db`             | Gerencia a conexão JDBC e exceções de banco.     |
| `model.entities` | Representa as entidades do banco de dados.       |
| `model.dao`      | Define as interfaces DAO e a fábrica de DAOs.    |
| `model.dao.impl` | Implementações concretas com código JDBC.        |

---

## 👨‍💻 Autor

**Fabricio Vianna**  
Estudante de Sistemas de Informação na PUC Minas  
Focado em desenvolvimento backend com Java e boas práticas de engenharia de software.

[LinkedIn](https://www.linkedin.com/in/fabricio-vianna) • [GitHub](https://github.com/fabricio-vianna)

---
