# SOLID

## Single Responsability Principle

### Do que se trata:

A classe deverá ter uma única responsabilidade, 
tendo assim um unico motivo para mudar.

### Violação

Como podemos ver no exemplo de violação do princípio, 
a classe Carro tem atributos necessários em um carro
relacionado a gasolina, como valor em tanque e a capacidade maxima.
Porém, o carro não tem a responsabilidade de se abastecer.

### Solução

Na solução, o metodo reabastecer foi 'deslinkado' do carro, tendo
uma classe só para esta operação, retirando esta responsabilidade
do carro e obedecendo o 1° princípio do SOLID.