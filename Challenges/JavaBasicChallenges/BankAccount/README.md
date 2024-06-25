# Sintaxe - Desafio - Projeto ContaBanco 💳

> Este desafio de projeto tem como objetivo exercitar o conteúdo de sintaxe de Java, simulando a criação de uma conta bancária via terminal.

## Objetivo 🎯
### 1. Criação do Projeto ContaBanco (`BankAccount`):
- O projeto deverá receber dados via terminal com as seguintes características:
  - Número da conta (Inteiro, exemplo: 1021)
  - Agência (Texto, exemplo: 067-8)
  - Nome do Cliente (Texto, exemplo: MARIO ANDRADE)
  - Saldo (Decimal, exemplo: 246.88)

### 2. Criação da Classe ContaTerminal (`AccountTerminal`):
- Permitir que os dados sejam inseridos via terminal, solicitando ao usuário as informações necessárias com mensagens apropriadas.
- Após a inserção de todas as informações, o sistema deverá exibir uma mensagem de confirmação com os dados inseridos.

## Exemplo de Execução 🖥️
Ao executar o programa, o usuário deverá seguir as instruções exibidas no terminal:

```yaml
----------------------------------
 Seja Bem-vindo(a) ao Bank Java! :)
----------------------------------
Para criar sua conta, digite os dados solicitados: 
----------------------------------
Por favor, digite o número da Agência: 067-8 
Por favor, digite o número da Conta: 1021
Por favor, digite o seu Nome: MARIO ANDRADE
Por favor, digite o Saldo inicial: 246.88

```

Após inserir todos os dados, o sistema exibirá a seguinte mensagem:
```yaml
----------------------------------
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco! :)
Sua agência é 067-8, conta 1021 e seu saldo R$ 246,88 já está disponível para saque.
----------------------------------
```

## Como Executar o Projeto ▶️

1. Certifique-se de ter o Java instalado na sua máquina.
2. Crie abra o projeto `BankAccount` e localize `AccountTerminal.java`.
3. Abra o terminal, navegue até o diretório `BankAccount` e compile o arquivo.
4. Após a compilação, execute o programa com o comando:
```bash
java AccountTerminal
```
5. Exemplo da demostração no terminal:
<p align="center"><img src="doc/terminalDemo.png" alt="Diagrama de Classes" width="700" height="320" ></p>

-----------------------------------
> Pronto! Agora você pode interagir com o programa e simular a criação de uma conta bancária de maneira mais amigável e visualmente agradável. 🎊
