# Projeto sobre Processo Seletivo - Controle de Fluxo ( Exercício ) 📑

> Este projeto simula um processo seletivo, onde candidatos são avaliados com base no salário pretendido e são realizados contatos para possíveis entrevistas. O projeto é dividido em quatro cases, cada um adicionando funcionalidades específicas ao fluxo de seleção.

## Objetivo 🎯

### 📋 Case 1: Controle de Fluxo de Salário Pretendido
Neste case, o sistema avalia o salário pretendido pelo candidato em relação ao salário base de R$ 2.000,00.
#### 💡 Lógica:
- Se o salário base for maior que o salário pretendido, imprime: `📞 LIGAR PARA O CANDIDATO`.
- Se o salário base for igual ao salário pretendido, imprime: `📞 LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA`.
- Caso contrário, imprime: `⏳ AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS`.
#### 🧩 Resolução Caso 1 - Classe da Implementação
- [Processo Seletivo - Caso I](src/br/com/dio/ProcessSelectiveI.java)

----------
### 🔍 Case 2: Seleção de Candidatos para Entrevista
O sistema deve garantir que, dentre inúmeras candidaturas, sejam selecionados no máximo 5 candidatos para entrevista, onde o salário pretendido seja menor ou igual ao salário base.
#### 🛠️ Implementação:
- Uma lista de candidatos é fornecida.
- Um método simula o salário pretendido por cada candidato.
- São selecionados no máximo 5 candidatos que têm um salário pretendido menor ou igual ao salário base.
#### 🧩 Resolução Caso 2 - Classe da Implementação
- [Processo Seletivo - Caso II](src/br/com/dio/ProcessSelectiveII.java)
  
----------
### 📃 Case 3: Impressão da Lista de Candidatos Selecionados
Após a seleção, o sistema imprime a lista de candidatos selecionados para que o RH possa entrar em contato.
#### 🧩 Resolução Caso 3 - Classe da Implementação
- [Processo Seletivo - Caso III](src/br/com/dio/ProcessSelectiveIII.java)

----------
### 📞 Case 4: Tentativa de Contato com Candidatos
O RH deve realizar até 3 tentativas de ligação para cada candidato selecionado. 
- Se o candidato atender, imprime: `CONSEGUIMOS CONTATO COM [CANDIDATO] APÓS [TENTATIVA] TENTATIVA(S)`.
- Caso contrário, imprime: `NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]`.
#### 🧩 Resolução Caso 4 - Classe da Implementação
- [Processo Seletivo - Caso IV](src/br/com/dio/ProcessSelectiveIV.java)

----------
> Este README tem o objetivo de apresentar o projeto sobre o processo seletivo de forma clara e informativa.
