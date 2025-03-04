# LeetCode 451 - Ordenar Caracteres por Frequência

## Descrição do Problema

Dada uma string `s`, ordene-a em **ordem decrescente** com base na **frequência** dos caracteres. A **frequência** de um caractere é o número de vezes que ele aparece na string.

### Exemplos

1. Entrada: `s = "tree"`
    - Saída: `"eert"` (ou `"eetr"`)
    - Explicação: 'e' aparece duas vezes, 'r' e 't' aparecem uma vez

2. Entrada: `s = "cccaaa"`
    - Saída: `"aaaccc"` (ou `"cccaaa")`
    - Ambos são válidos desde que caracteres com mesma frequência estejam agrupados

3. Entrada: `s = "Aabb"`
    - Saída: `"bbAa"` (ou `"bbaA")

### Restrições
- Tamanho da string: 1 <= s.length <= 5 * 10^5
- String consiste em letras maiúsculas e minúsculas e dígitos

## Abordagem da Solução

### Implementação Atual
A solução atual usa contagem de frequência e ordenação, mas apresenta problemas de desempenho com entradas grandes.

### Desafio de Desempenho
- **Tempo Limite Excedido (TLE)** ocorre para strings de entrada muito grandes
- A implementação existente pode ter uma complexidade de tempo que não escala de forma eficiente
