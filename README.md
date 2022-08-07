# ativProgramacaoAvancada
Atividade para responder em sala no dia 25 de julho de 2022

Pede-se:

- O projeto deve estar no pacote br.uern.di.pa.abb.xxx.yyy onde xxxx é seu sobrenome e yyy é seu primeino nome.

- Defina uma interface chamada Ave com os métodos cantar() voar();
  * cantar não recebe parâmetro e não retorna valor;
  * voar recebe um inteiro e retorna um inteiro;

- Defina uma classe abstrata chamada Passaro que implementa a interface;

- Defina duas classes concretas chamadas Papagaio e Currupio que estendem Passaro;
  * O método voar() retorna o menor valor entre o valor informado e a distancia máxima de voo definida no construtor do objeto  

  * Na classe Papagaio:
    + O método cantar() mostra na saída padrão a string "Papagaio legal"
 
  * Na classe Currupio:
    + O método cantar() mostra na saída padrão a string "Piu frio fru fri Pió"

Faça uma aplicação que utilize estas classes definidas por você, aplique o princípio de substituição de Liskov (LSP).

A atividade foi feita durante a aula no LEC por Isaú Lucas e Liza Magalhães para a materia do professor Allyson. 
