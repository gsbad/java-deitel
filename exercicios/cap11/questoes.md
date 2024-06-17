### 11.14 (Condições excepcionais) Liste as várias condições excepcionais que ocorreram em programas por todo este livro até agora. Liste o maior
número de condições excepcionais adicionais que você puder. Para cada uma delas, descreva brevemente como um programa normal-
mente trataria a exceção usando as técnicas de tratamento de exceção discutidas neste capítulo. Exceções típicas incluem divisão por zero
e índice de array fora dos limites.
### 11.15 (Exceções e falha de construtor) Até este capítulo, descobrimos que lidar com erros detectados por construtores é um pouco complicado.
Explique por que o tratamento de exceção é um meio eficaz de lidar com falha de construtor.
### 11.16 (Capturando exceções com superclasses) Utilize herança para criar uma superclasse de exceção (chamada ExceptionA) e subclasses
de exceção ExceptionB e ExceptionC, em que ExceptionB herda de ExceptionA e ExceptionC herda de ExceptionB. Escreva
um programa para demonstrar que o bloco catch para tipo ExceptionA captura exceções de tipos ExceptionB e ExceptionC.
### 11.17 (Capturando exceções com a classe Exception) Escreva um programa que demonstra como várias exceções são capturadas com
catch (Exception exception)
Desta vez, defina as classes ExceptionA (que herda da classe Exception) e ExceptionB (que herda da classe ExceptionA). Em
seu programa, crie blocos try que lançam exceções de tipos ExceptionA, ExceptionB, NullPointerException e IOException.
Todas as exceções devem ser capturadas com blocos catch para especificar o tipo Exception.
### 11.18 (Ordenando blocos catch) Escreva um programa que demonstre que a ordem dos blocos catch é importante. Se você tentar capturar
um tipo de exceção de superclasse antes de um tipo de subclasse, o compilador deve gerar erros.
### 11.19 (Falha de construtor) Escreva um programa que mostra um construtor que passa informações sobre a falha do construtor para uma
rotina de exceção. Defina a classe SomeClass, que lança um Exception no construtor. O seu programa deve tentar criar um objeto do
tipo SomeClass e capturar a exceção que é lançada do construtor.
### 11.20 (Relançando exceções) Escreva um programa que ilustra o relançamento de uma exceção. Defina os métodos someMethod e
someMethod2. O método someMethod2 deve lançar inicialmente uma exceção. O método someMethod deve chamar someMethod2,
capturar a exceção e relançá-la. Chame someMethod a partir do método main e capture a exceção relançada. Imprima o rastreamento
de pilha dessa exceção.
### 11.21 (Capturando exceções com escopos externos) Escreva um programa que mostra que um método com seu próprio bloco try não pre-
cisa capturar todo possível erro gerado dentro do try. Algumas exceções podem escorregar para, e serem tratadas em, outros escopos.