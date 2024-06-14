# Exercicios revisão - CAP6
### 6.1
Preencha as lacunas em cada uma das seguintes afirmações:

a) Um método é invocado com um(a) **chamada de método**.
b) Uma variável conhecida somente dentro do método em que é declarada chama-se **variável local**.
c) A instrução **return** em um método chamado pode ser utilizada para passar o valor de uma expressão de volta para o método de chamada.
d) A palavra-chave **void** indica que um método não retorna um valor.
e) Os dados podem ser adicionados ou removidos somente do(a) **parte superior (LIFO)** de uma pilha.
f) As pilhas são conhecidas como estruturas de dados **Last-to-In First-to-Out (LIFO)**; o último item colocado (inserido) na pilha é o primeiro item retirado (removido) da pilha.
g) As três maneiras de retornar o controle de um método chamado a um chamador são **return**, **return *expressao*** e **chave de fechamento do metodo *}***.
h) Um objeto da classe **SecureRandom** produz números verdadeiramente aleatórios.
i) A pilha de execução de programas contém a memória criada para variáveis locais a cada invocação de método durante a execução de um programa. Esses dados, armazenados como parte da pilha de chamadas de método, são conhecidos como **registro de ativação** ou **quadro de pilha** da chamada de método.
j) Se houver mais chamadas de método do que pode ser armazenado na pilha de execução do programa, um erro conhecido como **estouro de pilha (stack-overflow)** ocorrerá.
k) O **escopo** de uma declaração é a parte de um programa que pode referenciar a entidade na declaração pelo nome.
l) É possível ter diversos métodos com o mesmo nome que operam, separadamente, sobre diferentes tipos ou números de argumentos. Esse recurso é chamado de **sobrecarga (override)**.


### 6.2
Para a classe Craps na Figura 6.8, declare o escopo de cada uma das seguintes entidades:

a) a variável randomNumbers.
```
Classe Craps
```
b) a variável die1.
```
método rollDice()
```
c) o método rollDice.
```
Classe Craps
```
d) o método main.
```
Classe Craps
```
e) a variável sumOfDice.
```
método main()
```

### 6.3
Escreva um aplicativo que teste se os exemplos de chamadas de método da classe Math mostrada na Figura 6.2 realmente produzem os
resultados indicados.
```java
package exercicios.cap6;

public class MathTest {
    public static void main(String[] args) {
        System.out.println();  
        System.out.printf("abs(23.7): %.2f", Math.abs(23.7));
        System.out.println();    
        
        System.out.printf("ceil(9.2): %.2f", Math.ceil(9.2));
        System.out.println();    

        System.out.printf("cos(0.0): %.2f", Math.cos(0.0));
        System.out.println();    

        System.out.printf("exp(1.0): %.2f", Math.exp(1.0));
        System.out.println();    

        System.out.printf("floor(9.2): %.2f", Math.floor(9.2));
        System.out.println();    

        System.out.printf("log(Math.E* Math.E): %.2f", Math.log(Math.E* Math.E));
        System.out.println();    

        System.out.printf("max(2.3, 12.7): %.2f", Math.max(2.3, 12.7));
        System.out.println();    

        System.out.printf("min(2.3, 12.7): %.2f", Math.min(2.3, 12.7));
        System.out.println();    

        System.out.printf("pow(2.0, 7.0): %.2f", Math.pow(2.0, 7.0));
        System.out.println();    

        System.out.printf("sin(0.0): %.2f", Math.sin(0.0));
        System.out.println();    

        System.out.printf("sqrt(900.0): %.2f", Math.sqrt(900.0));
        System.out.println();    

        System.out.printf("tan(0.0): %.2f", Math.tan(0.0));
        System.out.println();    
    }
}
```

### 6.4
Forneça o cabeçalho de método para cada um dos seguintes métodos.

a) O método hypotenuse, que aceita dois argumentos de ponto flutuante de precisão dupla side1 e side2 e retorna um resultado de
ponto flutuante de dupla precisão.
```java
    double hypotenuse(double side1, double side2)
```
b) O método smallest, que recebe três inteiros x, y e z e retorna um inteiro.
```java
    int smallest(int x, int y, int z)
```
c) O método instructions, que não aceita nenhum argumento e não retorna um valor. [Observação: esses métodos são comumente
utilizados para exibição de instruções para o usuário.]
```java
    void instructions()
```
d) O método intToFloat, que recebe um argumento number do tipo inteiro e retorna um float.
```java
    float intToFloat(int number)
```

### 6.5
Encontre o erro em cada um dos seguintes segmentos de programa. Explique como corrigir o erro.

a)
```java
void g()
{
    System.out.println("Inside method g");
    void h()
    {
        System.out.println("Inside method h");
    }
}
```
**CORREÇÃO:**
```java
//Metodo h() estava sendo declarado dentro do metodo g()! Nao pode. Foi movido p fora
void g()
{
    System.out.println("Inside method g");
}
void h()
{
    System.out.println("Inside method h");
}
```
b)
```java
int sum(int x, int y)
{
    int result;
    result = x + y;
}
```
**CORREÇÃO:**
```java
//metodo nao estava retornado o valor inteiro definido no cabeçalho do metodo! Adicionado return result;
int sum(int x, int y)
{
    int result;
    result = x + y;

    return result;
}
```
c)
```java
void f(float a);
{
    float a;
    System.out.println(a);
}
```
**CORREÇÃO:**
```java
//Ponto e virgula depois do cabeçalho do metodo. Removido!
//Variável passada como parametro sendo sobrescrita no corpo do metodo. Declaração removida!
void f(float a)
{
    //float a;
    System.out.println(a);
}
```
d)
```java
void product()
{
    int a = 6, b = 5, c = 4, result;
    result = a * b * c;
    System.out.printf("Result is %d%n", result);
    return result;
}
```
**CORREÇÃO:**
```java
//metodo declarado como void no cabeçalho, e retornando result. Erro de compilação! Retorno removido!
void product()
{
    int a = 6, b = 5, c = 4, result;
    result = a * b * c;
    System.out.printf("Result is %d%n", result);
    //return result;
}
```
**OU...**
```java
//metodo declarado como void no cabeçalho, e retornando result. Erro de compilação! tipagem do metodo alterada para int!
int product()
{
    int a = 6, b = 5, c = 4, result;
    result = a * b * c;
    System.out.printf("Result is %d%n", result);
    return result;
}
```


### 6.6
Declare o método sphereVolume para calcular e retornar o volume da esfera. Utilize a seguinte instrução para calcular o volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3) 
Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera, chama sphereVolume para calcular o volu-
me e exibe o resultado.
```java
package exercicios.cap6;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nInsira um valor double para o raio de uma esfera: ");
        double radius = input.nextDouble();
        System.out.println();

        System.out.printf("Volúme da esfera com raio %.2f: %.2f", radius, sphereVolume(radius));

        input.close();
    }

    public static double sphereVolume(double radius){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}

```