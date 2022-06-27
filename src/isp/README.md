# SOLID

## Interface Segregation

### Do que se trata:

A classe não deve ser forçada a implementar interfaces e métodos que não utilizará.

### Violação

Como podemos ver no exemplo de violação do princípio, 
temos uma interface Chaves, que armazenam os metodos que devem
ser implementados nas classes por ela utilizados. Porém, devido
a todos os metodos estarem em uma unica interface, algumas classes
são obrigadas a implementarem metodos que elas não irão utilizar.


### Solução

Na solução, foi criado interfaces mais específicas para as necessidades
das classes existentes.