# 🏦 Sistema Bancário - Estudos de POO (Java)

Este repositório contém a evolução dos meus estudos em Java, transitando de uma lógica procedural para a **Programação Orientada a Objetos (POO)**, com foco em segurança, reuso e escalabilidade de código.

## 🧠 Pilares de POO Implementados:

### 1. Encapsulamento & Integridade
- **Proteção de Dados:** Atributos sensíveis (como `saldo`) definidos como `private`.
- **Controle de Acesso:** Implementação de métodos `getters` e `setters` para leitura e escrita controlada.
- **Validação de Estado:** Uso de **Construtores** para garantir que nenhum objeto seja instanciado em estado inválido (ex: impedindo saldo inicial negativo).

### 2. Herança & Reuso
- **Hierarquia de Classes:** Criação de uma classe base `Conta` e especialização através da classe `ContaPoupanca` via `extends`.
- **Reaproveitamento de Comportamento:** A classe filha utiliza métodos da classe mãe através da instrução `super()`.

### 3. Regras de Negócio e Validações
- **Cláusulas de Guarda:** Uso de verificações prévias nos métodos de `sacar` e `aplicarRendimento` para evitar fluxos de erro (como rendimentos negativos ou saques sem saldo).
- **Tratamento de Fluxo:** Implementação de lógica para impedir operações financeiras inconsistentes.

## 🛠️ Evolução Técnica
- **Ambiente Profissional:** Configuração e versionamento via Git integrado ao VS Code.
- **Clean Code:** Padronização de nomes de métodos seguindo a convenção `camelCase`.
- **Interface Console:** Saídas formatadas com `printf` para melhor experiência do usuário.

---
*Projeto em constante evolução para fins de aprendizado acadêmico e profissional.*
