# Sistema de Marcação de Ponto com Spring Boot

## Descrição

Este projeto consiste no desenvolvimento de um microserviço utilizando Java com Spring Boot, que implementa funcionalidades específicas por meio de no mínimo 5 rotas RESTful. O sistema é coberto por testes unitários com uma taxa mínima de 90%, utiliza Swagger para documentação da API, implementa autenticação para segurança e é publicado no Supabase para gerenciamento de banco de dados.

## Tecnologias e Ferramentas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento do microserviço.
- **JUnit**: Framework para testes unitários.
- **Mockito**: Biblioteca para mockar dependências nos testes.
- **Swagger**: Para documentação interativa das APIs.
- **Spring Security**: Para implementar a autenticação e segurança.
- **Supabase**: Para gerenciamento de banco de dados em nuvem e integração com a aplicação.

## Requisitos Funcionais

- **Rotas RESTful**: O microserviço expõe pelo menos 5 rotas RESTful cobrindo funcionalidades específicas do sistema. As rotas implementadas são:

    - `GET /api/usuarios`: Retorna a lista de todos os usuários.
    - `POST /api/usuarios`: Cria um novo usuário.
    - `GET /api/usuarios/{id}`: Retorna um usuário específico.
    - `PUT /api/usuarios/{id}`: Atualiza os dados de um usuário específico.
    - `DELETE /api/usuarios/{id}`: Exclui um usuário específico.

- **Testes Unitários**: Cobertura mínima de 90%. Testes validados com JUnit e Mockito para comportamento de cada rota e componente crítico da aplicação.

- **Documentação com Swagger**: Documentação interativa da API, acessível em `/swagger-ui.html`.

- **Autenticação e Segurança**:
    - Implementação de autenticação via Spring Security.
    - Suporte à autenticação via JWT (JSON Web Token).
    - Proteção de rotas com base em papéis de usuário (Admin, Usuário comum, etc.).
    - Geração e validação de tokens JWT.

- **Publicação no Supabase**: Armazenamento de dados em banco de dados PostgreSQL gerenciado pelo Supabase. Operações de CRUD nas rotas utilizando a estrutura do Supabase para persistência de dados.

## Requisitos Não Funcionais

- **Escalabilidade**: Garantia de escalabilidade conforme a demanda de requisições.
- **Desempenho**: Otimização para alta performance, especialmente nas rotas de consulta e inserção de dados.
- **Segurança**: Criptografia de dados sensíveis e prevenção contra ataques comuns (injeção de SQL, CSRF, XSS, etc.).

## Padrões e Boas Práticas

- **SOLID**: Aplicação dos princípios SOLID para garantir um código de fácil manutenção e extensibilidade.
- **Clean Code**: Práticas de código limpo, com nomenclaturas claras e código legível.
- **Documentação de Código**: Código bem documentado com comentários claros e explicativos.
- **Integração Contínua**: Utilização de CI/CD (como GitHub Actions ou Jenkins) para testes e validação automáticos em cada commit ou pull request.

## Entregáveis do Projeto

1. Código-fonte completo do microserviço.
2. Testes unitários com cobertura de 90%.
3. Documentação gerada pelo Swagger.
4. Arquivo de configuração de segurança com autenticação JWT.
5. Scripts e configuração de integração com o banco de dados no Supabase.
6. Relatório de cobertura de testes.
7. Documentação de uso do microserviço.

## Plano de Implantação

O microserviço será publicado e hospedado na infraestrutura de sua escolha (como AWS, Heroku, etc.) e integrado ao Supabase para gerenciamento do banco de dados.

## Como Executar o Projeto

1. **Clonar o Repositório**:
   ```bash
   git clone <URL do Repositório>
   cd <nome do diretório clonado>
