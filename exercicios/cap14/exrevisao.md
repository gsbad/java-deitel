# Exercicios revisão - CAP11
### 14.1
Determine se cada um dos seguintes itens é verdadeiro ou falso. Se falso, explique por quê.

a) Quando os objetos String são comparados utilizando ==, o resultado é true se as Strings contiverem os mesmos valores.
**Falso. Objetos string são comparados usando o operador == para determinar se eles são o mesmo objeto na memória. Uma literal "Teste" é diferente de um objeto new String("Teste")**

b) Uma String pode ser modificada depois de criada.
**Falso. Objetos String são imutáveis e não podem ser modificados depois de criados. Objetos StringBuilder podem ser modificados depois de criados**

### 14.2 
Para cada um dos seguintes itens, escreva uma única instrução que realiza a tarefa indicada:

a) Compare a string em s1 com a string em s2 quanto à igualdade de conteúdo.
**s1.equals(s2);**

b) Acrescente a string s2 à string s1, utilizando +=.
**s1 += s2;**

c) Determine o comprimento da string em s1.
**s1.length()**