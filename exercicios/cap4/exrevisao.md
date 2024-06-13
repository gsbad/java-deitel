# Exercícios de revisão
## 4.1
### Preencha as lacunas em cada uma das seguintes afirmações:

a) Todos os programas podem ser escritos em termos de três tipos de estruturas de controle: **sequência**, **seleção** e **repetição**.
b) A instrução **if/else** é utilizada para executar uma ação quando uma condição for verdadeira e outra quando essa condição for falsa.
c) Repetir um conjunto de instruções por um número específico de vezes é chamado de repetição **controlada por contador**.
d) Quando não se sabe antecipadamente quantas vezes um conjunto de instruções será repetido, um valor de **flag/sentinela** pode ser utilizado para terminar a repetição.
e) A estrutura de ________ é construída em Java; por padrão, instruções são executadas na ordem que elas aparecem.
f) As variáveis de instância dos tipos char, byte, short, int, long, float e double recebem o valor **ZERO (0)** por padrão.
g) O Java é uma linguagem **fortemente tipada**; ele requer que todas as variáveis tenham um tipo.
h) Se o operador de incremento for *prefixado*; para uma variável, primeiro a variável é incrementada por 1 e, então, seu novo valor é utilizado na expressão.

## 4.2 
### Determine se cada um dos seguintes é verdadeiro ou falso. Se falso, explique por quê.

a) Um algoritmo é um procedimento para resolver um problema em termos das ações a serem executadas e da ordem em que essas ações são executadas. **VERDADEIRO**
b) Um conjunto de instruções dentro de um par de parênteses é chamado bloco. **FALSO - Usa-se chaves**
c) Uma instrução de seleção especifica que uma ação deve ser repetida enquanto algumas condições permanecem verdadeiras. **FALSO - chama-se instruçao de repetição**
d) Uma instrução de controle aninhada aparece no corpo de uma outra instrução de controle. **VERDADEIRA**
e) O Java fornece os operadores aritméticos de atribuição compostos +=, -=, *=, /= e %= para abreviar expressões de atribuição. **VERDADEIRA**
f) Os tipos primitivos (boolean, char, byte, short, int, long, float e double) são portáveis somente em plataformas Windows. **FALSO - sao multiplataforma**
g) Especificar a ordem em que as instruções são executadas em um programa é chamado controle de programa. **VERDADEIRA**
h) O operador de coerção unário (double) cria uma cópia temporária do tipo inteiro do seu operando. **FALSO - do tipo ponto flutuante**
i) Atribui-se às variáveis de instância do tipo boolean o valor true por padrão. **FALSO - false é o padrão**
j) O pseudocódigo ajuda você a pensar sobre um programa antes de tentar escrevê-lo em uma linguagem de programação. **VERDADEIRO**

## 4.3
### Escreva quatro instruções Java diferentes que adicionam 1 à variável de inteiro x.

```java
num = num + 1;
num += 1;
num++; //pósfixado
++num; //préfixado
```

## 4.4
### Escreva instruções Java para realizar cada uma das seguintes tarefas:
a) Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
```java
z = x + y;
x += 1;
```

b) Teste se a variável contador é maior do que 10. Se for, imprima "Contador é maior que 10".
```java
if(contador > 10)
    System.out.print("contador é maior que 10);
```
c) Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total e armazene o resultado na variável total
```java
total -= --x;
```
d) Calcule o resto após q ser dividido por divisor e atribua o resultado a q. Escreva essa instrução de duas maneiras diferentes.
```java
q %= divisor;
q = q % divisor;
```

## 4.5
### Escreva instruções Java para realizar cada uma das seguintes tarefas:

a) Declarar variáveis sum do tipo int e inicialize-as como 0.
```java
int sum  = 0;
```
b) Declarar variáveis x do tipo int e inicialize-as como 0.
```java
int x = 0;
```
c) Adicione a variável x à variável sum, e atribua o resultado à variável sum.
```java
sum = sum + x;
sum += x;
```
d) Imprima "A soma é: " seguido pelo valor da variável sum.
```java
System.out.printf("A soma é: %d", sum);
```
## 4.6
### Combine as instruções escritas no Exercício 4.5 em um aplicativo Java que calcula e imprime a soma dos inteiros de 1 a 10. Utilize a instrução while para fazer loop pelas instruções de cálculo e incremento. O loop deve terminar quando o valor de x tornar-se 11.
```java
public class Somando{
    public static void main(String[] args){
        int sum  = 0;
        int x = 0;

        while(x <= 10){
            sum += x;
            ++x;
            System.out.printf("A soma é: %d", sum);
        }
    }
}
```
4.7
Determine o valor das variáveis na instrução product *= x++; depois que o cálculo é realizado. Suponha que todas as variáveis sejam do tipo int e inicialmente tenham o valor 5.
```java
product = 25; x = 6;
```

4.8
Identifique e corrija os erros em cada um dos seguintes conjuntos de código:
a) while (c <= 5)
{
    product *= c;
    ++c;
}
b) if (gender == 1)
        System.out.println("Woman");
    else
        System.out.println("Man");
4.9
O que há de errado com a instrução while a seguir?
while (z >= 0){
    sum += z;
    --z;
}
//sem decremento