# Exercicios revisão - CAP6
### 6.1
Preencha as lacunas em cada uma das seguintes afirmações:

a) Um método é invocado com um(a) ________.

b) Uma variável conhecida somente dentro do método em que é declarada chama-se ________.

c) A instrução ________ em um método chamado pode ser utilizada para passar o valor de uma expressão de volta para o método de
chamada.

d) A palavra-chave ________ indica que um método não retorna um valor.

e) Os dados podem ser adicionados ou removidos somente do(a) ________ de uma pilha.

f) As pilhas são conhecidas como estruturas de dados ________; o último item colocado (inserido) na pilha é o primeiro item retirado (removido) da pilha.

g) As três maneiras de retornar o controle de um método chamado a um chamador são ________, ________ e ________.

h) Um objeto da classe ________ produz números verdadeiramente aleatórios.

i) A pilha de execução de programas contém a memória criada para variáveis locais a cada invocação de método durante a execução de
um programa. Esses dados, armazenados como parte da pilha de chamadas de método, são conhecidos como ________ ou ________
da chamada de método.

j) Se houver mais chamadas de método do que pode ser armazenado na pilha de execução do programa, um erro conhecido como
________ ocorrerá.

k) O ________ de uma declaração é a parte de um programa que pode referenciar a entidade na declaração pelo nome.

l) É possível ter diversos métodos com o mesmo nome que operam, separadamente, sobre diferentes tipos ou números de argumentos.
Esse recurso é chamado de ________.


### 6.2
Para a classe Craps na Figura 6.8, declare o escopo de cada uma das seguintes entidades:

a) a variável randomNumbers.
b) a variável die1.
c) o método rollDice.
d) o método main.
e) a variável sumOfDice.

### 6.3
Escreva um aplicativo que teste se os exemplos de chamadas de método da classe Math mostrada na Figura 6.2 realmente produzem os
resultados indicados.

### 6.4
Forneça o cabeçalho de método para cada um dos seguintes métodos.

a) O método hypotenuse, que aceita dois argumentos de ponto flutuante de precisão dupla side1 e side2 e retorna um resultado de
ponto flutuante de dupla precisão.
b) O método smallest, que recebe três inteiros x, y e z e retorna um inteiro.
c) O método instructions, que não aceita nenhum argumento e não retorna um valor. [Observação: esses métodos são comumente
utilizados para exibição de instruções para o usuário.]
d) O método intToFloat, que recebe um argumento number do tipo inteiro e retorna um float.

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
b)
```java
int sum(int x, int y)
{
    int result;
    result = x + y;
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

### 6.6
Declare o método sphereVolume para calcular e retornar o volume da esfera. Utilize a seguinte instrução para calcular o volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3) 
Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera, chama sphereVolume para calcular o volu-
me e exibe o resultado.