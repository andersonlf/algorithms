algoritmos-avancados
====================

[![Build Status](https://travis-ci.org/andersonlf/algorithms.svg?branch=master)](https://travis-ci.org/andersonlf/algorithms)


Lista de discussão
------------------

**Objetivo**

O objetivo da lista de discussão algoritmos-avancados@googlegroups.com é apresentar problemas algorítmicos para os participantes, motivando-os a resolver e apresentar a solução dada.


**Sobre os problemas algorítmicos**

Os problemas postados nessa lista de discussão são publicados originalmente em conhecidos sites de desafios de programação. Os principais sites utilizados são:
*   https://www.hackerrank.com
*   http://uva.onlinejudge.org
*   https://www.codeeval.com
*   http://exercism.io

No primeiro momento resolveremos apenas problemas hospedados no site [HackerRank](https://www.hackerrank.com), no domínio [Algorithms](https://www.hackerrank.com/domains/algorithms) e subdomínio [Warmup](https://www.hackerrank.com/domains/algorithms/warmup). Logo após a resolução de todos os problemas desse subdomínio os _partipantes ativos_ da lista de discussão votarão a escolha do próximo subdomínio.

Cada problema postado na lista terá, no mínimo, um nome, sendo obrigatório a manutenção do nome original do problema, um link para o problema original, grau de dificuldade (_Fácil_, _Médio_ ou _Difícil_) e prazo para resolução. Caso considere necessário, inclua dicas na publicação do problema. O prazo para resolução dos problemas varia de acordo com a dificuldade do problema, a saber: 
*   Fácil - 1 dia
*   Médio - 2 dias
*   Difícil - 3 dias


**Template para postar um problema na lista**

Abaixo está o template e um exemplo para publicação de um problema na lista.
Assunto do email: Problema NOME DO PROBLEMA
Texto do email:
Problema:
Link:
Dificuldade:
Prazo:
Dicas (opcional):


**Exemplo de postagem de problema na lista**

Assunto do email: Problema Service Lane
Problema: Service Lane
Link: https://www.hackerrank.com/challenges/service-lane
Dificuldade: Fácil
Prazo: 1 dia


**Publicação de solução para problema**

Em resposta ao email-post do problema informe apenas o link para o código de solução do problema hospedado no [GitHub](https://github.com).


**Organização do repositório de soluções**

Embora cada participante da lista tenha completa autonomia para organizar o repositório com as soluções para os problemas, sugerimos a seguinte organização:

<pre>
repositorio
├── hackerrank
│   ├── algorithms
│   │   └── warmup
│   │       ├── service-lane
│   │       │   ├── pom.xml
│   │       │   └── src
│   │       │       ├── main
│   │       │       │   └── java
│   │       │       │       └── Solution.java
│   │       │       └── test
│   │       │           ├── java
│   │       │           │   └── SolutionTest.java
│   │       │           └── resources
│   │       │               └── test1
│   │       │                   ├── in.dat
│   │       │                   └── out.dat
</pre>

Para facilitar a criação da estrutura de resposta dos problemas o Archetype Maven [hackerrank-quickstart-archetype](https://github.com/andersonlf/hackerrank-quickstart-archetype) foi criado. Para mais informações acesse o [README](https://github.com/andersonlf/hackerrank-quickstart-archetype/blob/master/README.md)


**Regras**

1.  Participante Ativo é todo aquele que realiza pelo menos 75% dos problemas propostos a cada mês.
