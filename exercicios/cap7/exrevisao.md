# Exercicios revisão - CAP7
### 7.1
Preencha a(s) lacuna(s) em cada uma das seguintes instruções:

a) Listas e tabelas de valores podem ser armazenadas em **arrays** e **colections**.
b) Um array é um grupo de **variáveis** (chamadas elementos ou componentes) com valores que contêm todos o mesmo **tipo**.
c) A **instrução for aprimorada** permite iterar pelos elementos de um array sem usar um contador.
d) O número utilizado para referenciar um elemento particular de array é chamado **índice** do elemento.
e) Um array que utiliza dois índices é referido como um array **bidimensional**.
f) Utilize a instrução for aprimorada **for(double number : numbers)** para percorrer array double numbers.
g) Argumentos de linha de comando são armazenados em **Array de strings (Strings[] args)**.
h) Utilize a expressão **args.length** para receber o número total de argumentos em uma linha de comando. Suponha que os argumentos da linha de comando sejam armazenados em String[] args.
i) Dado o comando java MyClass test, o primeiro argumento de linha de comando é **um objeto String "test"**.
j) **Reticências (*tipo*...*nomeParam*)** na lista de parâmetro de um método indicam que o método pode receber um número variável de argumentos.

### 7.2
Determine se cada um dos seguintes é verdadeiro ou falso. Se falso, explique por quê.

a) Um array pode armazenar muitos tipos de valores diferentes. **FALSO** - no java o array deve conter valores do mesmo tipo
b) Um índice de array deve ser normalmente do tipo float. **FALSO** - O indice deve ser um inteiro!
c) Um elemento individual de um array que é passado para um método e modificado nesse método conterá o valor modificado quando o método chamado completar sua execução. 

**FALSO - Para elementos individuais do tipo primitivo de um array: Falso. Um método chamado recebe e manipula uma cópia do valor desse 
elemento, então as modificações não afetam o valor original. Mas se a referência de um array for passada para um método, as modificações nos elementos do array feitas no método chamado são de fato refletidas no original. Para elementos individuais de um tipo 
por referência: Verdadeiro. Um método chamado recebe uma cópia da referência desse elemento e as mudanças no objeto referenciado 
serão refletidas no elemento do array original.**

d) Argumentos de linha de comando são separados por vírgulas. **FALSO** - sao separados apenas por espaços em branco

### 7.3
Realize as seguintes tarefas para um array chamado fractions:

a) Declare uma constante ARRAY_SIZE que é inicializada como 10.
```java
    final int ARRAY_SIZE = 10;
```
b) Declare um array com ARRAY_SIZE elementos do tipo double e os inicialize como 0.
```java
    double[] a = new double[ARRAY_SIZE];
```
c) Referencie o elemento 4 do array.
```java
    a[4];
```
d) Atribua o valor 1.667 ao elemento 9 do array.
```java
    a[9] = 1.667;
```
e) Atribua o valor 3.333 ao elemento 6 do array.
```java
    a[6] = 3.333;
```
f) Some todos os elementos do array, utilizando uma instrução for. Declare a variável inteira x como uma variável de controle para o loop.
```java
    double sum;
    for(int x = 0; x < a.length; x++){
        sum += a[x];
    }
```

### 7.4
Realize as seguintes tarefas para um array chamado table:

a) Declare e crie o array como um array de inteiros que tem três linhas e três colunas. Suponha que a constante ARRAY_SIZE foi declarada como 3.
```java
    int[][] tabela = new int[ARRAY_SIZE][ARRAY_SIZE];
```
b) Quantos elementos o array contém?
```
    NOVE
```
c) Utilize uma instrução for para inicializar cada elemento do array com a soma de seus índices. Suponha que as variáveis inteiras x e y sejam declaradas como variáveis de controle.
```java
    for(int x = 0; x < tabela.length; x++)
        for(int y = 0; tabela[x].length; y++)
            tabela[x][y] = x + y;
```
### 7.5
Localize e corrija o erro em cada um dos seguintes segmentos de programa:

a) 
```java
final int ARRAY_SIZE = 5;
ARRAY_SIZE = 10;
```
**CORREÇÃO:**
```java
//uma vez declarada variavel como constante, nao é possivel atribuir novo valor a ela.
final int ARRAY_SIZE = 5;
//ARRAY_SIZE = 10;
```
b) Suponha
```java
int[] b = new int[10];
for (int i = 0; i <= b.length; i++)
    b[i] = 1;
```
**CORREÇÃO:**
```java
//Vai gerar um index bound of exception por causa do operador <=, o correto seria apenas < . O indice b[10] nao existe. So vai ate b[9].
int[] b = new int[10];
for (int i = 0; i < b.length; i++)
    b[i] = 1;
```
c) Suponha
```java
int[][] a = {{1, 2}, {3, 4}};
a[1, 1] = 5;
```
**CORREÇÃO:**
```java
//a[1, 1] = 5; nao existe no Java. O correto é a[1][1] = 5;
int[][] a = {{1, 2}, {3, 4}};
a[1][1] = 5;
```