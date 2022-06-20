# SOLID

## Open-Closed Principle

### Do que se trata:

As classes, funções, módulos e outras entidades devem ser 
abertas para extensão, mas fechadas para modificação.

### Violação

Como podemos ver no exemplo de violação do princípio, 
temos uma classe celular, onde há os atributos de volume e 
somente vibrar, que posteriormente será modificado conforme
a necessidade do usuário. Temos uma classe PerfilMode, onde
são armazenados todos os perfís existentes, e uma classe EventHandler
que será responsável por realizar a troca de perfil, modificando
tanto o volume do celular, quanto se irá ativar a vibração.
Ao necessitar de outro perfil além dos existentes, será necessário
a modificação de duas classes, PerfilMode e EventHandler, onde no PerfilMode
será adicionado o novo perfil, e no EventHandler será adicionado
as modificações que este perfil causa aos atributos do celular, 
violando o 2° princípio do SOLID

### Solução

Na solução, o PerfilMode se torna uma interface que padroniza
os metodos dos perfis, que agora são classes independentes
que implementam o PerfilMode. A classe EventHandler não terá mais
a responsabilidade de qualificar cada perfil e modificar os 
atributos do celular, agora só atribuindo os valores recebidos.
A responsabilidade dos valores dos atributos a serem modificados
ficou para as classes independentes dos Perfis que implementam o 
PerfilMode, respeitando o 1° princípio. Desse modo, não será mais necessário
modificar outras classes para adicionar um perfil novo, respeitando
o 2° princípio do SOLID.