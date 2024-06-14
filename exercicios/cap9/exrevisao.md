# Exercicios revisão - CAP9
### 9.1
Preencha as lacunas em cada uma das seguintes afirmações:

a) **Herança** é uma forma de reutilização de software em que novas classes adquirem os membros de classes existentes e as aprimoram com novas capacidades.

b) Os membros **public e protected** de uma superclasse podem ser acessados na declaração de superclasse e nas declarações de subclasse.

c) Em um relacionamento **é-um ou herança**, um objeto de uma subclasse também pode ser tratado como um objeto de sua superclasse.

d) Em um relacionamento **tem-um ou composição**, um objeto de classe tem referências a objetos de outras classes como membros.

e) Na herança simples, há uma classe em um relacionamento **hierárquico** com suas subclasses.

f) Os membros de uma superclasse **public** são acessíveis em qualquer lugar no qual o programa tem uma referência para um objeto daquela superclasse ou para um objeto de uma de suas subclasses.

g) Quando um objeto de uma subclasse é instanciado, um **construtor** é chamado de uma superclasse implícita ou explicitamente.

h) Os construtores de subclasse podem chamar construtores de superclasse via a palavra-chave **super**.

### 9.2
Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.

a) Os construtores de superclasse não são herdados por subclasses. **VERDADEIRO**

b) Um relacionamento tem-um é implementado via herança. **FALSO** - Errado, é implementado via composição

c) Uma classe Car tem um relacionamento é-um com as classes SteeringWheel e Brakes. **FALSO** - Errado. O relacionamento com esses objetos é "tem-um" (composição)

d) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse. **FALSO** - Isso é conhecido como sobrescrição e nao sobrecarga.