# Exercicios revisão - CAP5
### 5.1 
Preencha as lacunas em cada uma das seguintes afirmações:

a) Em geral, as instruções ________ são utilizadas para repetição controlada por contador e as instruções ________ são utilizadas para repetição controlada por sentinela.
b) A instrução do…while testa a condição de continuação do loop ________ de executar o corpo do loop; portanto, o corpo sempre
executa pelo menos uma vez.
c) A instrução ________ seleciona entre múltiplas ações com base nos possíveis valores de uma variável ou expressão, ou uma String.
d) A instrução ________, quando executada em uma instrução de repetição, pula as instruções restantes no corpo do loop e prossegue
com a próxima iteração do loop.
e) O operador ________ pode ser utilizado para assegurar que duas condições são ambas verdadeiras antes de escolher certo caminho
de execução.
f) Se a condição de continuação do loop em um cabeçalho for for inicialmente ________, o programa não executará o corpo da ins-
trução for.
g) Os métodos que realizam as tarefas comuns e não exigem os objetos são chamados de métodos ________.
5.2Determine se cada uma das seguintes alternativas é verdadeira ou falsa. Se falsa, explique por quê.
a) O caso default é requerido na instrução de seleção switch.
b) A instrução break é requerida no último caso de uma instrução de seleção switch.
c) A expressão ((x > y) && (a < b)) é verdadeira se x > y for verdadeiro ou a < b for verdadeira.
d) Uma expressão contendo o operador || é verdadeira se um ou ambos de seus operandos forem verdadeiros.
e) O flag de formatação vírgula (,) em um especificador de formato (por exemplo, %,20.2f) indica que um valor deve ser enviado para a saída com um separador de milhares.
f) Para testar para uma série de valores em uma instrução switch, utilize um hífen (–) entre os valores inicial e final da série em um rótulo case.
g) Listar casos consecutivamente sem instruções entre eles permite aos casos executar o mesmo conjunto de instruções.

### 5.3
Escreva uma instrução Java ou um conjunto de instruções Java para realizar cada uma das seguintes tarefas:

a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for. Assuma que as variáveis de inteiro sum e count foram declaradas.
b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a variável i foi declarada, mas não foi inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o método System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para
imprimir o caractere de tabulação.]
d) Repita a parte (c) utilizando uma instrução for.

### 5.4
Localize o erro em cada um dos seguintes segmentos de código e explique como corrigi-los:

a)
```java
i = 1;
while (i <= 10);
    ++i;
}
```
b)
```java
for (k = 0.1; k != 1.0; k += 0.1)
    System.out.println(k);
```
c)
```java
 switch (n)
{
    case 1:
        System.out.println("The number is 1");
    case 2:
        System.out.println("The number is 2");
    break;
    default:
        System.out.println("The number is not 1 or 2");
    break;
}
```
d) O seguinte código deve imprimir os valores 1 a 10:
```java
n = 1;
while (n < 10)
    System.out.println(n++);
```