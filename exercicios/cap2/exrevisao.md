# Exercicios revisão - CAP2

## 2.1

a) Um(a)   **{**   começa o corpo de cada método e um(a)  **}**  termina o corpo de cada método.

b) Você pode usar a declaração **if** para tomar decisões.

c) **//** começa em um comentário de fim de linha.

d) **espaços**, **tabulações** e **linhas em branco** são chamados espaço em branco.

e) **palavras-chave** são reservadas para uso pelo Java.

f) Aplicativos Java iniciam a execução no método **main**.

g) Os métodos **print**, **println** e **printf** exibem informações em uma janela de comando.

## 2.2

```Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se falsa, explique por quê.```

a) Os comentários fazem com que o computador imprima o texto depois das // na tela quando o programa executa. **FALSO** 
```Os comentários são ignorados pelo compilador. Podem ser do tipo fim de linha (//), comentario por bloco (/* */) e comentario javadoc (/** */)```

b) Todas as variáveis devem ser atribuídas a um tipo quando são declaradas. **VERDADEIRA**

c) O Java considera que as variáveis number e NuMbEr são idênticas. **FALSO**
``` A linguagem JAVA é case sensitive. Faz distinçao de letras maiúsculas e minúsculas ```

d) O operador de resto (%) pode ser utilizado apenas com operandos inteiros. **FALSO** 
```É possivel fazer operação de resto com operandos não inteiros ```

e) Os operadores aritméticos *, /, %, + e - têm, todos, o mesmo nível de precedência. **FALSO**
``` *, /, % tem maior precedência do que +, - ```


## 2.3

```Escreva instruções para realizar cada uma das tarefas a seguir:```

a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
```java
int c; 
int thisIsAVariable;
int q76354;
int number;

// ou...

int c, thisIsAVariable, q76354, number;
```
b) Solicite que o usuário insira um inteiro.
```java
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.printf("Insira um número inteiro: " , input.nextInt());
```
c) Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler um valor digitado pelo usuário.
```java
int value;
value = input.nextInt();
```
d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.
```java
System.out.println("This is a Java program!");
```
e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método System.out.printf e dois especificadores de formato %s.
```java
System.out.printf("%s%n%s%n", "This is a Java", "Program");
```
f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".
```java
if(number != 7)
    System.out.print("The variable number is not equal to 7");
```

## 2.4

a) **ponto e virgual depois da instruçao "if"**
b) **operador condicional errado (=> igual maior nao existe)"**

## 2.5

```
Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
```

a) Declare que um programa calculará o produto de três inteiros.
```java
/**
 * Produto.java
 * Programa calculará o produto de três inteiros
 * 
 * */
```
b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);

// ou...

java.util.Scanner input = new java.util.Scanner(System.in);

```
c) Declare as variáveis x, y, z e result como tipo int.
```java
int x;
int y;
int z;
int result;
```
d) Solicite que o usuário insira o primeiro inteiro.
```java
java.util.Scanner input = java.util.Scanner(System.int);
System.out.prinf("Insira o primeiro inteiro: $%d", input.nextInt());
```
e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
```java
int x;
x = input.nextInt();
```
f) Solicite que o usuário insira o segundo inteiro.
```java
System.out.prinf("Insira o segundo inteiro: $%d", input.nextInt());
```
g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
```java
int y;
y = input.nextInt();
```
h) Solicite que o usuário insira o terceiro inteiro.
```java
System.out.prinf("Insira o terceiro inteiro: $%d", input.nextInt());
```
i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
```java
int z;
y = input.nextInt();
```
j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
```java
result = x * y * z;
```

k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result.
```java
System.out.printf("O produto é: %d%n", result);
```

## 2.6
Usando as instruções que você escreveu no Exercício 2.5, elabore um programa completo que calcule e imprima o produto de três inteiros.

```java 
/**
 * Produto.java
 * Programa calculará o produto de três inteiros
 * 
 * */
import java.util.Scanner;

public class Produto{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Insira o primeiro inteiro: ");
        x = input.nextInt();

        System.out.print("Insira o segundo inteiro: ");
        y = input.nextInt();

        System.out.print("Insira o terceiro inteiro: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("O produto é: %dn" , result);
    }

}
```