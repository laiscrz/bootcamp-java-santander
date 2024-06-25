# Sintaxe - Desafio - Projeto ContaBanco 💳

Este projeto tem como objetivo exercitar o conteúdo de sintaxe de Java, simulando a criação de uma conta bancária via terminal.

## Objetivo 🎯
1. Criação do Projeto ContaBanco:
- O projeto deverá receber dados via terminal com as seguintes características:
  - Número da conta (Inteiro, exemplo: 1021)
  - Agência (Texto, exemplo: 067-8)
  - Nome do Cliente (Texto, exemplo: MARIO ANDRADE)
  - Saldo (Decimal, exemplo: 237.48)

2. Criação da Classe ContaTerminal:
- Permitir que os dados sejam inseridos via terminal, solicitando ao usuário as informações necessárias com mensagens apropriadas.
- Após a inserção de todas as informações, o sistema deverá exibir uma mensagem de confirmação com os dados inseridos.

## Exemplo de Execução 🖥️
Ao executar o programa, o usuário deverá seguir as instruções exibidas no terminal:

```yaml
Por favor, digite o número da Agência 🏦:
067-8

Por favor, digite o número da Conta 📝:
1021

Por favor, digite o seu Nome 🧑‍💼:
MARIO ANDRADE

Por favor, digite o Saldo inicial 💰:
237.48

```

Após inserir todos os dados, o sistema exibirá a seguinte mensagem:
```yaml
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque. 🎉

```

## Como Executar o Projeto ▶️

1. Certifique-se de ter o Java instalado na sua máquina.
2. Crie um diretório chamado ContaBanco e dentro deste diretório, crie o arquivo ContaTerminal.java com o código acima.
3. Abra o terminal, navegue até o diretório ContaBanco e compile o arquivo com o seguinte comando:
```bash
javac ContaTerminal.java
```
