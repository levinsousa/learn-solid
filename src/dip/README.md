# SOLID

## Dependency Inversion

### Do que se trata:

Devemos depender de abstrações e não de implementações.

### Violação

Como podemos ver no exemplo de violação do princípio, temos um
cozinheiro que utiliza de sua faca para fatiar, porém a classe
Cozinheiro não deveria depender dos detalhes da implementação
da faca diretamente, e sim por meio de uma abstração.


### Solução

Na solução, a abstração foi utilizada por meio de uma interface, 
tanto respeitando o princípio, quanto possibilitando ao cozinheiro
utilizar de qualquer tipo de lamina que tenha como padrão um método
Fatiar.