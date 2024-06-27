# Criando um Banco Digital com Java e Orientação a Objetos

O projeto Banco Digital POO é uma aplicação desenvolvida em Java que simula as operações bancárias básicas para dois tipos de contas: conta corrente e conta poupança. Utiliza conceitos avançados de Programação Orientada a Objetos (POO), como abstração, encapsulamento, herança e polimorfismo, para proporcionar uma estrutura flexível e extensível para operações bancárias.

# Requisitos do Projeto

1. **Funcionalidades Principais:**
    - Depósito em conta corrente e poupança.
    - Saque de conta corrente e poupança.
    - Transferência entre contas corrente e poupança do mesmo banco.
    - Aplicação de taxas de manutenção em contas correntes.
    - Aplicação de taxas de rendimento em contas poupança.
    - Impressão de extrato bancário.
    - Simulação de passagem de meses para aplicação automática de taxas e rendimentos.

2. **Interfaces de Usuário:**
    - Interface para interação com o usuário para realização das operações bancárias.

### Atributos

- **Conta:**
    - Agência
    - Número da Conta
    - Saldo
    - Cliente Associado
    - Histórico de Transações

- **Cliente:**
    - Nome
    - CPF

- **Transação:**
    - Data
    - Tipo (Depósito, Saque, Transferência, Taxa de Manutenção, Taxa de Rendimento)
    - Valor
    - Saldo após Transação

### Regras de Negócio

1. **Saldo Suficiente:** Garantir que o saldo da conta seja suficiente para realizar saques e transferências.
2. **Taxas e Rendimentos:** Aplicar as taxas de manutenção mensalmente em contas correntes e os rendimentos mensalmente em contas poupança.
3. **Extrato Bancário:** Permitir que o cliente visualize seu extrato bancário completo com todas as transações realizadas.

### Tecnologias Utilizadas

- Java: Linguagem de programação utilizada para desenvolvimento da aplicação.
- IDE (Integrated Development Environment): Utilização de uma IDE como IntelliJ IDEA, ou similar para desenvolvimento e depuração.
- Controle de Versão: Git para controle de versão do código fonte.
- GitHub: Repositório remoto para hospedar o projeto e facilitar colaboração e versionamento.
- Conhecimentos Básicos de POO: Utilização de conceitos como abstração, encapsulamento, herança e polimorfismo para estruturar o projeto.

### Observações

- Este documento descreve os requisitos básicos e principais funcionalidades do projeto Banco Digital. Para implementação completa, outros requisitos específicos podem ser identificados durante o desenvolvimento e validação do sistema.
- Certifique-se de adaptar e expandir este documento conforme necessário para atender às necessidades específicas do projeto e às expectativas dos stakeholders.
- Documento de requisitos gerado com a assistência de IA baseada nos meus comandos específicos.

