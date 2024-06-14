# Questões - CAP4

### 4.10 
Compare e contraste a instrução de seleção única if e a instrução de repetição while. Qual é a semelhança dessas duas instruções? Qual é a diferença?
```
Ambas são inicializadas com uma condicional antes do bloco de código!
```

### 4.11
Explique o que acontece quando um programa Java tenta dividir um inteiro por outro. O que acontece para a parte fracionária do cálculo?
Como você pode evitar esse resultado?
```
Quando voce divide um numero inteiro pelo outro em java o resultado é um inteiro. A parte fracionária é descartada.
Para evitar esse resultado deve-se converter o dividendo e o divisor em double ou float antes da divisão.
```

### 4.12
Descreva as duas maneiras como as instruções de controle podem ser combinadas.
```
Aninhamento (nesting) e Encadeamento (chaining)
```

### 4.13
Que tipo de repetição seria apropriado para calcular a soma dos primeiros 100 inteiros positivos? Que tipo seria apropriado para calcular a soma de um número arbitrário de inteiros positivos? Descreva brevemente como cada uma dessas tarefas poderia ser realizada.
**Soma dos primeiros 100 inteiros positivos:**
```java
int sum; 
for(int i = 1; i <= 100; i++)
    sum += i;
```

**Soma dos primeiros 100 inteiros positivos:**
```java
package exercicios.cap4;
import java.util.Scanner;

public class SomaArbitraria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        int number = 0;


        System.out.println("Digite um inteiro positivo: ");

        while(flag){
            number = input.nextInt();
            if(number <= 0){
                System.out.println("Número inválido! Digite um inteiro positivo!");
                flag = true;
            }else if(number > 0){
                int cont = 1;
                while(cont <= number){
                    sum += cont;
                    cont++;
                }
                flag = false;
            }
        }

        System.out.printf("%n%nO somatório do inteiro %d é %d%n", number, sum);
        input.close();   
    }   
}
```
### 4.14 
Qual é a diferença entre pré-incrementar e pós-incrementar uma variável?
```
O préincremento incrementa o valor da variável antes da mesma ser usada na expressão!
O pósincremento incrementa o valor da variável após a mesma ser usada na expressão!
```

### 4.15 
Identifique e corrija os erros em cada um dos seguintes fragmentos de código. [Observação: pode haver mais de um erro em cada trecho de código.]
a) 
```java
if (age >= 65); // - ERRO, PONTO E VIRGULA APOS A CONDICIONAL
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65)";
```
```java
if (age >= 65) // CORRIGIDA
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65)";
```

b) 
```java
int x = 1, total; //variavel "total" foi declarada mas nao foi inicializada
while (x <= 10)
{
    total += x;
    ++x;
}
```
```java
int x = 1, total = 0; //inicializada com o valor 0
while (x <= 10)
{
    total += x;
    ++x;
}
```
c) 
```java
while (x <= 100) //Sem chaves para delimitar o bloco de código com mais de 1 linha
    total += x;
    ++x;
```
```java
while (x <= 100){ //Corrigido
    total += x;
    ++x;
}
```
d) 
```java
while (y > 0) //Sem a chave de fechamento do bloco de código, e laço está preso num loop infinito a depender do valor inicial de y
{
    System.out.println(y);
    ++y;
```
```java
while (y > 0) //chave adicionada no fechamento do bloco, modificado o decremento considerando que o valor inicial de Y era positivo
{
    System.out.println(y);
    --y;
}
```

### 4.16
O que o seguinte programa imprime?
```java
// Exercício 4.16: Mystery.java
public class Mystery
{
    public static void main(String[] args)
    {
        int x = 1;
        int total = 0;
        while (x <= 10)
        {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.printf("Total is %d%n", total);
    }
} // fim da classe Mystery
```
**SAÍDA:**
```
1
4
9
16
25
36
49
64
81
100
Total is 365
```

### Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:

a) Leia a declaração do problema.
b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
c) Escreva um programa Java.
d) Teste, depure e execute o programa Java.
e) Processe três conjuntos completos de dados.

### 4.17
**(Quilometragem de combustível)** Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.
```java
package exercicios.cap4;

import java.util.Scanner;

public class CalculaKmPorLitro {
    public static void main(String[] args) {
        //declara variaveis
        Scanner input = new Scanner(System.in);
        int qtdViagens = 1;
        int kmTotal = 0;
        int gasolinaTotal = 0;
        int flag = 1;
        
        while (flag != -1) {
            System.out.printf("%nInforme os dados da viagem numero %d: %n", qtdViagens);
            //recebe entradas
            System.out.println("\nInsira quantos km foram percorridos: ");
            int kmDirigidos = input.nextInt();
            System.out.println("\nInsira a quantidade de gasolina consumida: ");
            int gasolinaConsumida = input.nextInt();
            
            double litrosPorKm = (double) kmDirigidos / gasolinaConsumida;
            System.out.printf("O consumo da viagem em Kilometros por litro foi de: %.2fl/km%n", litrosPorKm);

            //incrementa variaveis kmTotal e gasolinaTotal
            kmTotal += kmDirigidos;
            gasolinaTotal += gasolinaConsumida;

            System.out.println("Relatório das viagens: ");
            System.out.printf("Km total de todas as viagens até o momento: %d%n", kmTotal);
            System.out.printf("Gasolina total consumida em todas as viagens até o momento: %d%n%n", gasolinaTotal);

            System.out.println("Digite 1 para continuar registrando novas viagens OU -1 para sair do aplicativo!");
            flag = input.nextInt();
        }
        double litrosPorKm = (double) kmTotal / gasolinaTotal;
        System.out.printf("O consumo TOTAL da todas as viagens em Kilometros por litro foi de: %.2fl/km!%nObrigado por utilizar o app! FIM!", litrosPorKm);
    
    }
}
```

### 4.18
**(Calculador de limite de crédito)** Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:

a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.

O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e
determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido".

### 4.19
**(Calculador de comissão de vendas)** Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de venda de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
vendidos por cada vendedor. Os valores desses itens são como segue:

Item   Value
1      239.99
2      129.75
3      99.95
4      350.89


Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.

### 4.20 
**(Calculador de salários)** Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados.

### 4.21 
**(Localize o maior número)** O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:

a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 nú-
meros foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora.

### 4.22 
**(Saída no formato de tabela)** Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:

### 4.23 
**(Encontre os dois números maiores)** Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]

### 4.24 
**(Validando entrada de usuário)** Modifique o programa na Figura 4.12 para validar suas entradas. Para qualquer  entrada, se o valor entrado for diferente de 1 ou 2, continue o loop até o usuário inserir um valor correto.

### 4.25 
O que o seguinte programa imprime?
```java
// Exercício 4.25: Mystery2.java
public class Mystery2
    {
    public static void main(String[] args)
        {
        int count = 1;
        while (count <= 10)
        {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
} // fim da classe Mystery2
```

#### 4.26 
O que o seguinte programa imprime?
```java
// Exercício 4.26: Mystery3.java
public class Mystery3
{
    public static void main(String[] args)
    {
        int row = 10;

        while (row >= 1)
        {
            int column = 1;
            while (column <= 10)
            {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            --row;
            System.out.println();
        }
    }
} // fim da classe Mystery3
```

### 4.27
**(Problema do else oscilante)** Determine a saída para cada um dos conjuntos dados de código quando x é 9 e y é 11 e quando x é 11 e y é 9. O compilador ignora o recuo em um programa Java. Da mesma forma, o compilador Java sempre associa um else com o if imediatamente precedente a menos que instruído a fazer de outro modo pela colocação de chaves ({}). À primeira vista, o programador pode
não ter certeza de qual if um else particular corresponde — essa situação é conhecida como "problema do else oscilante". Eliminamos o recuo do seguinte código para tornar o problema mais desafiador. [Dica: aplique as convenções de recuo que você aprendeu.]

a)
```java
if (x < 10)
if (y > 10)
    System.out.println("*****");
else
    System.out.println("#####");
    System.out.println("$$$$$");
```
b)
```java
if (x < 10)
{
    if (y > 10)
        System.out.println("*****");
}
else
{
    System.out.println("#####");
    System.out.println("$$$$$");
}
```

### 4.28 
**(Outro problema do else oscilante)** Modifique o código dado para produzir a saída mostrada em cada parte do problema. Utilize técnicas de recuo adequadas. Não faça nenhuma alteração além de inserir chaves e alterar o recuo do código. O compilador ignora recuo em um programa Java. Eliminamos o recuo do código fornecido para tornar o problema mais desafiador. [Observação: é possível que não seja necessária nenhuma modificação para algumas das partes.]
```java
if (y == 8)
    if (x == 5)
        System.out.println("@@@@@");
else
    System.out.println("#####");
    System.out.println("$$$$$");
    System.out.println("&&&&&");
```
a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
```
@@@@@
$$$$$
&&&&&
```

b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
```
@@@@@
```
c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
```
@@@@@
```
d) Supondo que x = 5 e y = 7, a seguinte saída é produzida. [Observação: todas as três últimas instruções de saída depois do else são partes de um bloco].
```
#####
$$$$$
&&&&&
```

### 4.29 
**(Quadrado de asteriscos)** Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis
entre 1 e 20.

### 4.30 
**(Palíndromos)** Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
### 4.31 
**(Imprimindo o equivalente decimal de um número binário)** Escreva um aplicativo que insere um número inteiro que contém somente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para
pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
### 4.32 
**(Padrão de tabuleiro de damas de asteriscos)** Escreva um aplicativo que utiliza apenas as instruções de saída
```java
System.out.print("* ");
System.out.print(" ");
System.out.println();
```
para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com que o pro-
grama gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]

### 4.33 
**(Múltiplos de 2 com um loop infinito)** Escreva um aplicativo que continue exibindo na janela de comando os múltiplos do inteiro 2 — a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é, deve criar um loop infinito). O que acontece quando
você executa esse programa?

### 4.34 
**(O que há de errado com esse código?)** O que há de errado com a seguinte instrução? Forneça a instrução correta para adicionar 1 à soma de x e y.
```java
System.out.println(++(x + y));
```
### 4.35 
**(Lados de um triângulo)** Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, determina e imprime se eles poderiam representar os lados de um triângulo.

### 4.36 
**(Lados de um triângulo direito)** Escreva um aplicativo que lê três inteiros diferentes de zero, determina e imprime  se eles poderiam representar os lados de um triângulo direito.

### 4.37 
**(Fatorial)** O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
```
n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
```
e
```
n! = 1 (para n = 0)
Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
```
a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
b) Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a seguir. Permita ao usuário inserir o número
de termos a calcular.
c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.


## Fazendo a diferença
### 4.38 
**(Impondo privacidade com criptografia)** O crescimento explosivo de comunicação e armazenamento de dados na internet e em computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de dados para torná-los difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. Uma empresa que
quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos com maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos
inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante
depois da divisão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado e o descriptografe
(revertendo o esquema de criptografia) para formar o número original. [Projeto de leitura opcional: pesquise a “criptografia de chave pública” em geral e o esquema de chave pública específica PGP (Pretty Good Privacy). Você também pode querer investigar o esquema
RSA, que é amplamente usado em aplicativos robustos industriais.]

### 4.39 
**(Crescimento demográfico mundial)** A população mundial cresceu consideravelmente ao longo dos séculos. O crescimento contínuo pode, por fim, desafiar os limites de ar respirável, água potável, terra fértil para agricultura e outros recursos limitados. Há evidência de que o crescimento tem reduzido a velocidade nos últimos anos e que a população mundial pode chegar ao ponto máximo em algum momento nesse século e, então, começar a diminuir.
Para esse exercício, pesquise questões de crescimento demográfico mundial on-line. Não deixe de investigar vários pontos de vista.
Obtenha estimativas da população mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente aumentará neste ano). Escreva um programa que calcule o crescimento demográfico mundial anual dos próximos 75 anos, utilizando a premissa simplifi cadora de que a taxa de crescimento atual ficará constante. Imprima os resultados em uma tabela. A primeira coluna deve exibir os anos do ano 1 ao ano 75. A segunda coluna deve exibir a população mundial esperada no fim desse ano. A terceira deve exibir o aumento numérico na população mundial que ocorreria nesse ano. Utilizando os seus resultados, determine o ano em que a população dobraria com relação ao número de hoje se a taxa de crescimento do ano atual persistisse.

