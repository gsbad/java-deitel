# Exercicios revisão - CAP10
### 10.1
Preencha as lacunas em cada uma das seguintes afirmações:

a) Se uma classe contiver pelo menos um método abstrato, ela será uma classe **abstrata**.

b) As classes a partir das quais os objetos podem ser instanciados são chamadas **concretas**.

c) **Polimorfismo** envolve a utilização de uma variável de superclasse para invocar métodos nos objetos de superclasse e de subclasse, permitindo que você “programe no geral”.

d) Os métodos que não são métodos de interface e que não fornecem implementações devem ser declarados com a palavra-chave **abstract**.

e) Fazer uma coerção em uma referência armazenada em uma variável da superclasse para um tipo de subclasse é chamado **downcasting**.

### 10.2 
Determine se cada uma das instruções a seguir é verdadeira ou falsa. Se falsa, explique por quê.

a) Todos os métodos em uma classe abstract devem ser declarados como métodos abstract.
**FALSA** - Uma classe abstrata pode incluir métodos com implementações e métodos abstract

b) Não é permitido invocar um método “somente de subclasse” por meio de uma variável de subclasse.
**FALSA** - Tentar invocar um método "somente de subclasse" com uma variável de superclasse não é permitido

c) Se uma superclasse declarar um método como abstract, uma subclasse deverá implementar esse método.
**FALSA** - Somente se a subclasse for uma classe concreta

d) Um objeto de uma classe que implementa uma interface pode ser pensado como um objeto desse tipo de interface.
**VERDADEIRA**

### 10.3 
(Interfaces Java SE 8) Preencha os espaços em branco em cada uma das seguintes instruções:

a) No Java SE 8, uma interface pode declarar **métodos default**, isto é, métodos public com implementações concretas que especificam como
uma operação deve ser realizada.

b) A partir do Java SE 8, as interfaces agora podem incluir métodos auxiliares **static**.

c) A partir do Java SE 8, qualquer interface que contém um único método é conhecida como  **interface funcional**.