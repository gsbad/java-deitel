# Exercicios revisão - CAP11
### 11.1
Liste cinco exemplos de exceções comuns.
**1- Esgotamento de memória - OutOfMemoryError**
**2- Índice de array fora dos limites - ArrayIndexOutOfBoundsException**
**3- Estouro aritmético - ArithmeticException (embora não haja uma exceção específica para estouro aritmético, ArithmeticException cobre erros aritméticos gerais, como divisão por zero)**
**4- Divisão por zero - ArithmeticException**
**5- Parâmetros de método inválidos - IllegalArgumentException**

### 11.2
Por que as exceções são particularmente adequadas para lidar com erros produzidos por métodos de classes na Java API?
**É improvável que os métodos de classes na Java API possam realizar processamento de erro que atenda às necessidades particulares de todos os usuários.**

### 11.3
O que é um “vazamento de recurso”?
**Um “vazamento de recurso” ocorre quando um programa em execução não libera adequadamente um recurso quando ele não é mais necessário.**

### 11.4
Se nenhuma exceção é lançada em um bloco try, onde o controle prossegue quando o bloco try completa a execução?
**Os blocos catch para essa instrução try são pulados e o programa retoma a execução depois do último bloco catch. Se houver um bloco finally, ele será executado primeiro; então o programa retomará a execução depois do bloco finally**

### 11.5
Dê uma vantagem fundamental de utilizar catch(Exception nomeDaExceção).
**A forma catch(Exception nomeDaExceção) captura qualquer tipo de exceção lançada em um bloco try. Uma vantagem é que nenhuma Exception lançada pode passar sem ser capturada. Você pode tratar a exceção ou relançá-la.**

### 11.6
Um aplicativo convencional deve capturar objetos Error? Explique.
**Errors são problemas normalmente sérios com o sistema Java subjacente; a maioria dos programas não quer capturar Errors porque não serão capazes de se recuperar deles**

### 11.7
O que acontece se nenhuma rotina de tratamento catch corresponder ao tipo de um objeto lançado?
**Isso faz com que a pesquisa por uma correspondência continue na próxima instrução try circundante. Se houver um bloco finally, ele será executado antes de a exceção ir para a próxima instrução try circundante. Se não houver nenhuma instrução try circundante para a qual existem blocos catch correspondentes, e as exceções forem declaradas (ou não verificadas), um rastreamento de pilha é impresso e a thread atual termina antes. Se as exceções são verificadas, mas não capturadas ou declaradas, ocorrem erros de compilação.**

### 11.8
O que acontece se vários blocos catch correspondem ao tipo do objeto lançado?
**O primeiro bloco catch correspondente depois do bloco try é executado.**

### 11.9
Por que um programador especificaria um tipo de superclasse como o tipo em um bloco catch?
**Isso permite que um programa capture tipos de exceções relacionadas e os processe de maneira uniforme. Entretanto, costuma ser útil processar os tipos de subclasse individualmente para obter um tratamento de exceção mais preciso.**

### 11.10 
Qual é a razão chave para utilizar blocos finally?
**O bloco finally é o meio preferido de liberar recursos para impedir vazamentos de recurso.**

### 11.11 
O que acontece quando um bloco catch lança uma Exception?
**Primeiro, o controle passa para o bloco finally se houver algum. Em seguida, a exceção será processada por um bloco catch (se houver algum) associado com um bloco try envolvente (se houver algum)**

### 11.12 
O que a instrução throw referênciaDaExceção faz em um bloco catch?
**Ele relança a exceção para o processamento por uma rotina de tratamento de exceção de uma instrução try envolvente, depois de o bloco finally da instrução try atual executar.**

### 11.13 
O que acontece com uma referência local em um bloco try quando esse bloco lança uma Exception?
**A referência sai de escopo. Se o objeto referenciado torna-se inacessível, o objeto pode passar por coleta de lixo**