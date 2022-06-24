# SOLID

## Liskov Substitution Principle

### Do que se trata:

As classes derivadas devem ser substituíveis pela sua classe base.

### Violação

Como podemos ver no exemplo de violação do princípio, 
temos uma classe pai chamada Bird, que Herda paras classes filhas
(Aguia e Penguim) os metodos Voar e Bicar. A classe Águia consegue
dexecutar todos os metodos herdados da classe pai, mas naturalmente
penguins não voam, então a classe Penguim não conseguiria substituir
a classe pai, violando o 3° princípio do SOLID.


### Solução

Na solução, reduzimos a abstração deixando os métodos iguais
para todas as classes, para que todas possam executar sem problemas
naturalmente, e para aves que voam há uma interface específica que
lhe dão esta nova funcionalidade.