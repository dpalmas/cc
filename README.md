<h3 align="center">
  Construção de Compiladores :computer: :astronaut:
</h3>

<p align="center">Repositório para atividades da disciplina de Construção de Compiladores.</a>
</p>

<p align="center">
  
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/dpalmas/cc?color=0000FF">

  <img alt="License" src="https://img.shields.io/github/license/dpalmas/cc?color=0000FF&logo=MIT">
  
  <a href="https://github.com/dpalmas/cc/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/dpalmas/cc?color=0000FF">
  </a>
</p>

## Primeira Parte

O trabalho aborda etapas da construção de um compilador. Será composto por três pontos principais:

1. [x] Parte escrita: consiste em um trabalho escrito, na formatação de artigos da SBC (Sociedade Brasileira de Computação), devendo conter, no mínimo, os seguintes tópicos:

- [x] A definição de compiladores;
- [x] Descrições sobre as etapas de análise léxica, análise sintática e análise
semântica;
- [x] A documentação da aplicação prática desenvolvida, que inclui a gramática na forma Backus-Naur, um exemplo de um programa válido na linguagem fonte e um exemplo inválido, constando a definição dos erros.

2. [x] Implementação: consiste em desenvolver um compilador contendo no mínimo as etapas de análise léxica e sintática e um controle básico de erros, 
mencionando pelo menos o token originário do erro e o token esperado. O controle de erros deve apresentar mensagens em língua pátria. Essa
implementação pode fazer uso de ferramentas de auxílio na criação de compiladores, como [Lex/YaCC](http://dinosaur.compilertools.net/), [JFlex](https://jflex.de/), [Cup](http://www2.cs.tum.edu/projects/cup/) e [JavaCC](https://javacc.github.io/javacc/). Neste momento ainda 
poderá ser feita leitura do código fonte via entrada padrão, sem necessidade de leitura de arquivo. Devem ser implementadas, no mínimo, duas estruturas de laço de repetição, uma estrutura condicional, definição de variáveis únicas e
em lista de variáveis e, com e sem atribuição durante a declaração, e se a linguagem for tipada, três tipos de dados distintos.

3. [x] Apresentação: consiste em realizar a apresentação da implementação desenvolvida, em sala de aula, para a turma, descrevendo a linguagem criada bem como a implementação.

A data para entrega do trabalho escrito, bem como  da apresentação em sala de aula é 18/03/2021.

## Segunda Parte

O trabalho consiste em duas tarefas principais:

1. Desenvolvimento do compilador com todas as funcionalidades do primeiro bimestre implementadas (análise léxica e sintática) acrescido de leitura de
arquivos, interface de interação e mensagens de erro, método de sincronização do pânico relativo à sua linguagem, de modo análogo ao código feito em sala de aula. A interface de iteração deve ser capaz de exibir o código sendo elaborado, contagem de linhas de códigos, tokens reconhecidos, texto de
aceitação ou não da linguagem e mensagens de erros;

2. Apresentação do compilador desenvolvido, demonstrando os passos para poder transformar sua linguagem em uma linguagem LL(1), bem como a codificação envolvida no processo de sincronização do pânico e interface gráfica.
Questões como realce visual de linhas contendo erros (não somente a mensagem dizendo a linha e coluna onde está o erro) contam pontos extras.
Realizar preparações para geração de código executável (por exemplo, converter para código C e chamar o gcc para converter em executável) contam
pontos extras. 

A data de apresentação do trabalho final é dia 18/05/2021.

