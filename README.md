# Hashing-de-strings
Projeto de uma maneira bem simplificada de se implementar um hash de strings em Kotlin.

Para cada letra do alfabeto existe um número natural associado de maneira sequencial:

a - 1; b - 2; c - 3 .... x - 24; y - 25; z - 26.

Nesse projeto trabalhei apenas com letras minúsculas. Foi implementado uma função que recebe uma string com uma única palavra e, então, retorna um número inteiro calculado a partir dessa string. O cálculo deve foi feito da seguinte forma:

Para cada letra na palavra, é calculado um valor associado. Este valor será igual ao número que representa a letra vezes a posição da letra na palavra.

O valor associado à palavra será igual à soma dos valores associados a cada uma de suas letras — é esse valor que deve ser retornado.
Exemplo: café

LETRA - (número inteiro associado) * (posição na palavra)

EXEMPLO:
 C - 3 * 1 = 3
 A - 1 * 2 = 2
 F - 6 * 3 = 18
 E - 5 * 4 = 20
 café = 3 + 2 + 18 + 20 = 43
  
