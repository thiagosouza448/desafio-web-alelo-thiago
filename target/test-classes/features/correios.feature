 #language: pt
 #charset: UTF-8


 Funcionalidade: pesquisa de logradouro correios

   Esquema do Cenário: Pesquisando um cep e retornando o correto
     Dado que eu esteja na tela dos correios
     Quando quando pesquiso um endereco "<endereco>"
     Entao valido se o "<endereco>" foi encontrado na lista
     Exemplos:
       | endereco |
       | 09070240 |


   Esquema do Cenário: Pesquisando endereco retornando mais de um item na lista
     Dado que eu esteja na tela dos correios
     Quando quando pesquiso um endereco "<endereco>"
     Entao valido se o "<endereco>" foi encontrado na lista
     Exemplos:
       | endereco          |
       | Rua Porto Carrero |
