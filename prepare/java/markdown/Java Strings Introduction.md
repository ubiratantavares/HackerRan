# Java Strings Introduction

Uma string é tradicionalmente uma sequência de caracteres, seja como uma constante literal ou como algum tipo de variável. — Wikipedia: String (ciência da computação)

Este exercício é para testar seu entendimento sobre Strings em Java. Uma declaração de String de exemplo:

```java
String myString = "Hello World!";
```

Os elementos de uma String são chamados caracteres. O número de caracteres em uma String é chamado de comprimento, e pode ser obtido com o método `String.length()

Dadas duas strings de letras minúsculas em inglês,  e, realize as seguintes operações:

1. Some os comprimentos de  A e B.
2. Determine se A é lexicograficamente maior que B  (ou seja:  B vem antes de A no dicionário?).
3. Capitalize a primeira letra de A e B e imprima-as em uma única linha, separadas por um espaço.

## Formato de Entrada

A primeira linha contém uma string A . A segunda linha contém outra string B . As strings são compostas apenas por letras minúsculas em inglês.

## Formato de Saída

São três linhas de saída:

1. Na primeira linha, some os comprimentos de  A e B.
2. Na segunda linha, escreva "Yes" se A for lexicograficamente maior que B; caso contrário, imprima "No".
3. Na terceira linha, capitalize a primeira letra de A e B e imprima-as em uma única linha, separadas por um espaço.

### Exemplo de Entrada 0

```bash
hello
java
```

### Exemplo de Saída 0

```bash
9
No
Hello Java
```
