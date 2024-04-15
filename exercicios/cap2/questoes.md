# Questões capitulo 2

```2.7 Preencha as lacunas em cada uma das seguintes afirmações:```

a) **Comentários** são utilizados para documentar um programa e aprimorar sua legibilidade.
b) Uma decisão pode ser tomada em um programa Java com um(a) **estrutura condicional**.
c) Os cálculos normalmente são realizados pelas instruções **com operadores aritiméticos**.
d) Os operadores aritméticos com a mesma precedência da multiplicação(*) são **divisão (/)** e **resto (%)**.
e) Quando parênteses em uma expressão aritmética estão aninhados, o conjunto de parênteses **mais interno** é avaliado primeiro.
f) Uma posição na memória do computador que pode conter valores diferentes várias vezes ao longo da execução de um programa é chamada **variável**.

```2.8 Escreva instruções Java que realizem cada uma das seguintes tarefas:```

a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
```java
System.out.print("Enter an integer: ");
```
b) Atribuir o produto de variáveis b e c para a variável a.
```java
int a;
a = b * c;
```
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
```java
//Esse programa executa o cálculo de folha de pagamento
```

```2.9 Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se falsa, explique por quê.```

a) Operadores Java são avaliados da esquerda para a direita. **FALSO**
```A maioria sim, mas existe uma excessão que é lida da direita para a esquerda que é o operador de atribuição. Portanto a questão erra ao generalizar```
b) Os seguintes nomes são todos de variável válidos: _under_bar_, m928134, t5, j7, her_sales$, his_$account_total, a, b$, c, z e z2. **VERDADEIRO**
c) Uma expressão aritmética Java válida sem parênteses é avaliada da esquerda para a direita. **VERDADEIRO**
d) Os seguintes nomes são todos de variável inválidos: 3g, 87, 67h2, h22 e 2h. **FALSO** ```"h22" é uma variável válida```

```2.10 Supondo que x = 2 e y = 3, o que cada uma das instruções a seguir exibe?```

a) System.out.printf(“x = %d%n”, x);
``` x = 2 (e uma quebra de linha)```
b) System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));
``` Value of 2 + 2 is 4 (quebra de linha) ```
c) System.out.printf(“x =”);
``` x = ```
d) System.out.printf(“%d = %d%n”, (x + y), (y + x));
``` 5 = 5 (quebra de linha) ```

```2.11 Quais instruções Java a seguir contêm variáveis cujos valores são modificados?```

a) p = i + j + k + 7; ***P é modificado***
b) System.out.println(“variables whose values are modified”); **Nada modificado**
c) System.out.println(“a = 5”); **Nada modificado**
d) value = input.nextInt(); **"value" é modificado**

```2.12 Dado que y = ax3 + 7, quais das seguintes alternativas são instruções Java corretas para essa equação?```

a) y = a * x * x * x + 7; **CORRETA**
b) y = a * x * x * (x + 7);
c) y = (a * x) * x * (x + 7);
d) y = (a * x) * x * x + 7;
e) y = a * (x * x * x) + 7;
f) y = a * x * (x * x + 7);

```2.13 Declare a ordem de avaliação dos operadores em cada uma das seguintes instruções Java e mostre o valor de x depois que cada instrução é realizada:```

a) x = 7 + 3 * 6 / 2 - 1;
``` 
* , / , +, -, =  ordem dos operadores
x = 18
```
b) x = 2 % 2 + 2 * 2 - 2 / 2;
``` 
% , * , / , + , - , =  ordem dos operadores
x = 3
```
c) x = (3 * 9 * (3 + (9 * 3 / (3))));
``` 
* , / , * , * , + , =  ordem dos operadores
x = 324
```

```2.14 Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes técnicas:```

a) Uma instrução System.out.println.
b) Quatro instruções System.out.print.
c) Uma instrução System.out.printf.

```java
    a) System.out.println("1 2 3 4");

    b) System.out.print("1 ");
       System.out.print("2 ");
       System.out.print("3 ");
       System.out.print("4 ");

    c) System.out.printf(" %d %d %d %d ", 1,2,3,4);                   
```

2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto, diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
```java
package exercicios.cap2;
import java.util.Scanner;

public class Calculadora{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        int produto;
        int diferenca;
        double divisao;

        System.out.println("App Calculadora");
        System.out.print("Insira um número inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro número inteiro: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;
        produto = numero1 * numero2;
        diferenca = numero1 - numero2;
        divisao =  numero1 / numero2;

        System.out.printf("A soma dos dois inteiros é %d%nO produto dos dois inteiros é %d%nA diferença dos dois inteiros é %d%nA divisão dos dois inteiros é %.2f%n", soma, produto, diferenca, divisao);

    }
}
```
2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize as técnicas mostradas na Figura 2.15.

```java
package exercicios.cap2;
import java.util.Scanner;

public class Compara{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("App Comparação");
        System.out.print("Insira um número inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro número inteiro: ");
        numero2 = input.nextInt();

        if(numero1 > numero2){
            System.out.printf("%d é maior!%n", numero1);
        }
        if(numero1 < numero2){
            System.out.printf("%d é maior!%n", numero2);
        }
        if(numero1 == numero2){
            System.out.print("Esses numeros sao iguais!\n");
        }

    }
}
```

2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]

```java
package exercicios.cap2;
import java.util.Scanner;

public class Aritmetica{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        int soma;
        int media;
        int produto;

        System.out.println("App Aritmetica");
        System.out.print("Insira primeiro número inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira segundo número inteiro: ");
        numero2 = input.nextInt();

        System.out.print("Insira terceiro número inteiro: ");
        numero3 = input.nextInt();        

        soma = numero1 + numero2 + numero3;
        produto = numero1 * numero2 * numero3;
        media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A soma dos tres inteiros é %d%nO produto dos tres inteiros é %d%nA media dos tres inteiros é %d%n", soma, produto, media);

        if(numero1 < numero2 && numero1 < numero3)
            System.out.printf("%d é o menor%n", numero1);
        if(numero1 > numero2 && numero1 > numero3)
            System.out.printf("%d é o maior%n", numero1);    

        if(numero2 < numero1 && numero2 < numero3)
            System.out.printf("%d é o menor%n", numero2);
        if(numero2 > numero1 && numero2 > numero3)
            System.out.printf("%d é o maior%n", numero2);
            
        if(numero3 < numero2 && numero3 < numero1)
            System.out.printf("%d é o menor%n", numero3);
        if(numero3 > numero2 && numero3 > numero1)
            System.out.printf("%d é o maior%n", numero3);                             
    }
}
```

2.19 O que o seguinte código imprime?
```java
System.out.printf("*%n**%n***%n****%n*****%n");
```

```
*
**
***
****
*****
```

2.20 O que o seguinte código imprime?
```java
System.out.println("*");
System.out.println("***");
System.out.println("*****");
System.out.println("****");
System.out.println("**");
```

```
*
***
*****
****
**
```

2.25 (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
```java
package exercicios.cap2;
import java.util.Scanner;

public class ParImpar{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        if((numero % 2) == 0 && numero != 0)
            System.out.printf("%d é par!%n", numero);
        if((numero % 2) != 0 && numero != 0)
            System.out.printf("%d é ímpar!%n", numero);
        if(numero == 0)
            System.out.println("Digitou zero!");    
    }
}
```

2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado. [Dica: utilize o operador de resto.]
```java
package exercicios.cap2;
import java.util.Scanner;

public class Multiplo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Digite segundo numero: ");
        num2 = input.nextInt();

        if((num1 % num2) == 0)
            System.out.printf("O primeiro numero digitado %d é multiplo de %d!%n", num1, num2);
            else    
            System.out.printf("O primeiro numero digitado %d não é multiplo de %d!%n", num1, num2);
        if((num2 % num1) == 0)
            System.out.printf("O segundo numero digitado %d é multiplo de %d!%n", num2, num1);
    }
}
```

2.28 (Diâmetro, circunferência e área de um círculo) (Ver enunciado no livro)

```java
package exercicios.cap2;
import java.util.Scanner;

public class Raio{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        float raio;

        System.out.print("Digite o valor do raio de um círculo: ");
        raio = input.nextFloat();

        System.out.println("---- Análise geométrica ----");
        System.out.printf("Diâmetro: %.2f%n", (2 * raio));
        System.out.printf("Circunferencia: %.2f%n", (2 * pi * raio));
        System.out.printf("Área: %.2f%n", (pi * raio * raio));        
    }
}
```


2.29 (O valor inteiro de um caractere) (Ver enunciado no livro)
```java
package exercicios.cap2;

public class Conversao{
    public static void main(String args[]){
        char caractere = '+';
    
        System.out.printf("%n O caráctere %c possui o valor inteiro: %d %n" ,  caractere, ((int) caractere));
```



2.30 (Separando os dígitos em um inteiro) (Ver enunciado no livro)
```java
package exercicios.cap2;
import java.util.Scanner;

public class Desmembra{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        int dezmilhar;
        int milhar;
        int centena;
        int dezena;
        int unidade;
        
        System.out.println("Insira um inteiro de 5 caracteres: ");
        num = input.nextInt();
        
        unidade = (num % 10);

        num = num / 10;

        dezena = (num % 10);

        num = num / 10;

        centena = (num % 10);

        num = num / 10;

        milhar = (num % 10);

        num = num / 10;

        dezmilhar = (num % 10);

        System.out.printf("%n %d %d %d %d %d %n", dezmilhar , milhar , centena, dezena, unidade);

    }
}
```


2.31 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
```java
package exercicios.cap2;

public class Exibe{
    public static void main(String args[]){
        System.out.println("NUM  QUADRADO  CUBO");
        
        System.out.printf(" %d      %d       %d", (0),(0),(0));
        System.out.println();
        System.out.printf(" %d      %d       %d", (1),(1*1),(1*1*1));
        System.out.println();
        System.out.printf(" %d      %d       %d", (2),(2*2),(2*2*2));
        System.out.println();
        System.out.printf(" %d      %d       %d", (3),(3*3),(3*3*3));
        System.out.println();
        System.out.printf(" %d      %d      %d", (4),(4*4),(4*4*4));
        System.out.println();
        System.out.printf(" %d      %d      %d", (5),(5*5),(5*5*5));
        System.out.println();
        System.out.printf(" %d      %d      %d", (6),(6*6),(6*6*6));
        System.out.println();
        System.out.printf(" %d      %d      %d", (7),(7*7),(7*7*7));
        System.out.println();
        System.out.printf(" %d      %d      %d", (8),(8*8),(8*8*8));
        System.out.println();
        System.out.printf(" %d      %d      %d", (9),(9*9),(9*9*9));
        System.out.println();
        System.out.printf(" %d     %d     %d", (10),(10*10),(10*10*10));
        System.out.println();        
    }
}
```

2.32 (Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos, quantos positivos e quantos zeros foram inseridos.
```java
package exercicios.cap2;

public class Verifica{
    public static void main(String args[]){
        int num1 = -1;
        int num2 = 2;
        int num3 = 0;
        int num4 = 4;
        int num5 = -5;

        if(num1 < 0)
            System.out.printf("%nO numero %d é negativo!", num1);
        if(num1 > 0)
            System.out.printf("%nO numero %d é positivo!", num1);
        if(num1 == 0)
            System.out.printf("%nO numero %d é zero!", num1); 
            
        if(num2 < 0)
            System.out.printf("%nO numero %d é negativo!", num2);
        if(num2 > 0)
            System.out.printf("%nO numero %d é positivo!", num2);
        if(num2 == 0)
            System.out.printf("%nO numero %d é zero!", num2); 
            
        if(num3 < 0)
            System.out.printf("%nO numero %d é negativo!", num3);
        if(num3 > 0)
            System.out.printf("%nO numero %d é positivo!", num3);
        if(num3 == 0)
            System.out.printf("%nO numero %d é zero!", num3); 
            
        if(num4 < 0)
            System.out.printf("%nO numero %d é negativo!", num4);
        if(num4 > 0)
            System.out.printf("%nO numero %d é positivo!", num4);
        if(num4 == 0)
            System.out.printf("%nO numero %d é zero!", num4); 
            
        if(num5 < 0)
            System.out.printf("%nO numero %d é negativo!", num5);
        if(num5 > 0)
            System.out.printf("%nO numero %d é positivo!", num5);
        if(num5 == 0)
            System.out.printf("%nO numero %d é zero!", num5);   
            
        System.out.println();
    }
}
```


**Fazendo a diferença**
2.33 (Calculadora de índice de massa corporal) (Ver enunciado no livro)
```java
package exercicios.cap2;
import java.util.Scanner;

public class IMC {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float imc;
        float altura;
        float peso;

        System.out.println("Calculadora de IMC (Indice de massa corporea)");
        System.out.print("Digita sua altura: ");
        altura = input.nextFloat();
        System.out.print("Digita sua peso: ");
        peso = input.nextFloat();

        imc = (peso) / (altura*altura);

        System.out.printf("%nSeu indice de massa corporea (IMC) é: %.2f%n", imc);

        if(imc < 18.5)
            System.out.println("Voce esta abaixo da massa corporea ideal!");
        if(imc > 18.5 && imc < 24.9)
            System.out.println("Voce esta com a massa corporea ideal!");
        if(imc > 25 && imc < 29.9)
            System.out.println("Voce esta com sobrepeso!");
        if(imc > 30)
            System.out.println("Voce esta obeso!");
    }    
}
```

### :notes: This is the end... :musical_note: my only friend... the end.. :headphones: