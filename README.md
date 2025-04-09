# AuthSystem

Este projeto é um sistema de autenticação e gerenciamento de usuários, desenvolvido com Java 21, Spring Security e JWT, seguindo os princípios da Clean Architecture. Ele fornece endpoints seguros para autenticação, registro e operações CRUD de usuários.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Clean Architecture
- Maven

## Estrutura de Pastas
```text
com.gk.authsystem
│
├── adapters
│   └── Gateways de entrada da aplicação
│
├── application.usecases
│   └── Implementações dos casos de uso
│
├── controller
│   └── Camada de controllers (responsável por expor a API HTTP)
│
├── core
│   └── Camada de regras de negócio (interfaces e contratos)
│
├── infra
│   ├── gateways
│   │   └── Implementações dos gateways definidos na camada core
│   │
│   ├── repositories
│   │   └── Interfaces com o banco de dados
│   │
│   └── security
│       ├── component
│       │   └── Filtros de segurança 
│       ├── config
│       │   └── Configurações do Spring Security
│       └── service
│           └── Serviços auxiliares como TokenService e AuthorizationService
│
└── AuthSystemApplication
    └── Classe principal da aplicação
```

## Funcionalidades

- Cadastro de usuários
- Login com geração de token JWT
- Autenticação e autorização com Spring Security
- CRUD de usuários (Create, Read, Update, Delete)
- Estrutura desacoplada com Clean Architecture

## Executando o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/authsystem.git
cd authsystem
```


