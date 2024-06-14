# Exercicios revisão - CAP5
### 5.1 
Preencha as lacunas em cada uma das seguintes afirmações:

a) Em geral, as instruções **for** são utilizadas para repetição controlada por contador e as instruções **while** são utilizadas para repetição controlada por sentinela.

b) A instrução do…while testa a condição de continuação do loop **depois** de executar o corpo do loop; portanto, o corpo sempre executa pelo menos uma vez.

c) A instrução **switch** seleciona entre múltiplas ações com base nos possíveis valores de uma variável ou expressão, ou uma String.

d) A instrução **continue**, quando executada em uma instrução de repetição, pula as instruções restantes no corpo do loop e prossegue com a próxima iteração do loop.

e) O operador **&&** pode ser utilizado para assegurar que duas condições são ambas verdadeiras antes de escolher certo caminho de execução.

f) Se a condição de continuação do loop em um cabeçalho "for" for inicialmente **false**, o programa não executará o corpo da instrução for.

g) Os métodos que realizam as tarefas comuns e não exigem os objetos são chamados de métodos **static**.


### 5.2 
Determine se cada uma das seguintes alternativas é verdadeira ou falsa. Se falsa, explique por quê.

a) O caso default é requerido na instrução de seleção switch. **FALSO** - É opcional

b) A instrução break é requerida no último caso de uma instrução de seleção switch. **FALSO** - A instrução break é utilizada para sair da instrução switch

c) A expressão ((x > y) && (a < b)) é verdadeira se x > y for verdadeiro ou a < b for verdadeira. **FALSO** - Ambas precisam ser verdadeiras

d) Uma expressão contendo o operador || é verdadeira se um ou ambos de seus operandos forem verdadeiros. **VERDADEIRA**

e) O flag de formatação vírgula (,) em um especificador de formato (por exemplo, %,20.2f) indica que um valor deve ser enviado para a saída com um separador de milhares. **VERDADEIRO** - (, é o separador padrao de milhares americano)

f) Para testar para uma série de valores em uma instrução switch, utilize um hífen (–) entre os valores inicial e final da série em um rótulo case. **FALSO** - A instrução switch nao oferece esse mecanismo. Cada caso deve ser testado individualmente com "case"s separados

g) Listar casos consecutivamente sem instruções entre eles permite aos casos executar o mesmo conjunto de instruções. **VERDADEIRO**


### 5.3
Escreva uma instrução Java ou um conjunto de instruções Java para realizar cada uma das seguintes tarefas:

a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for. Assuma que as variáveis de inteiro sum e count foram declaradas.
```java
    for(count = 1; count <= 99; count++){
        if(count % 2 == 1)
            sum += count;
    }
```
**Ou...**
```java
    for(count = 1; count <= 99; count += 2)
        sum += count;
```
b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
```java
    double result = Math.pow(2.5, 3);
```
c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a variável i foi declarada, mas não foi inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o método System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para
imprimir o caractere de tabulação.]
```java
i = 1;
while(i <= 20){
    System.out.print(i);
    if(i % 5 == 0)
        System.out.println();
    else
        System.out.print("\t");
    i++;
}  
```
d) Repita a parte (c) utilizando uma instrução for.
```java
for(int i = 1; i <= 20; i++){
    System.out.print(i);
    if(i % 5 == 0)
        System.out.println();
    else
        System.out.print("\t");
    i++;
}  
```

### 5.4
Localize o erro em cada um dos seguintes segmentos de código e explique como corrigi-los:

a)
```java
i = 1;
while (i <= 10);
    ++i;
}
```
**CORREÇÃO:**
```java
//Ponto-e-virgula logo após parenteses de fechamento da condicional. Substituido por abertura de chave
i = 1;
while (i <= 10){
    ++i;
}
```
b)
```java
for (k = 0.1; k != 1.0; k += 0.1)
    System.out.println(k);
```
**CORREÇÃO:**
```java
//Numeros de ponto flutuante so sao representados aproximadamente pela maioria dos computadores. Nao é um bom tipo pra controlar laço for
for (k = 1; k != 10; k += 1)
    System.out.println((double)k/10);
//Assim imprirá os mesmos numeros inicialmente.. de 0.1 a 1.0
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
**CORREÇÃO:**
```java
//O case 1 esta sem a instrução break p interromper o switch, podendo levar a um comportamento inesperado na logica do programa
 switch (n)
{
    case 1:
        System.out.println("The number is 1");
    break;    
    case 2:
        System.out.println("The number is 2");
    break;
    default:
        System.out.println("The number is not 1 or 2");
    break;
}
```
d) O seguinte código deve imprimir os valores de 1 a 10:
```java
n = 1;
while (n < 10)
    System.out.println(n++);
```
**CORREÇÃO:**
```java
//Da forma como estava so iria imprimir ate o 9 por causa do operador condicional
n = 1;
while (n <= 10)
    System.out.println(n++);
```