# Java Anagrams

Duas strings, a e b, são chamados anagramas se contiverem todos os mesmos caracteres nas mesmas frequências. Para este desafio, o teste não diferencia maiúsculas de minúsculas. Por exemplo, os anagramas de CAT são CAT, ACT, tac, TCA, aTC, e CtA.

## Descrição da função

Complete a função isAnagram no editor.

isAnagram tem os seguintes parâmetros:

* string a: a primeira string
* string b: a segunda string

## Devoluções

* booleano: Seesão anagramas que não diferenciam maiúsculas de minúsculas, retornam true. Caso contrário, retornam false.

## Formato de entrada

A primeira linha contém uma string.
A segunda linha contém uma string.

## Restrições

* 1 <= length(a), length(b) <= 50
* As strings a e b consistem em caracteres alfabéticos ingleses.
* A comparação NÃO deve diferenciar maiúsculas de minúsculas.

## Entrada de amostra 0

```bash
anagram
margana
```

## Saída de amostra 0

```bash
Anagrams
```

## Explicação 0

Caracter Freqüência:anagram Freqüência:margana
A ou a      3                   3
G ou g      1                   1
N ou n      1                   1
M ou m      1                   1
R ou r      1                   1

As duas strings contêm todas as mesmas letras nas mesmas frequências, então imprimimos "Anagrams".

## Entrada de amostra 1

```bash
anagrammm 
marganaa
```

## Saída de amostra 1

```bash
Not Anagrams
```

## Explicação 1

Caracter Freqüência:anagramm Freqüência:marganaa
A ou a      3                   4
G ou g      1                   1
N ou n      1                   1
M ou m      2                   1
R ou r      1                   1

As duas strings não contêm o mesmo número de a's e m's, então imprimimos "Not Anagrams".

## Entrada de amostra 2

```bash
Hello
hello
```

## Saída de amostra 2

```bash
Anagrams
```

## Explicação 2

Caracter Freqüência:Hello Freqüência:hello
E ou e      1                   1
H ou h      1                   1
L ou l      2                   2
O ou o      1                   1

As duas strings contêm todas as mesmas letras nas mesmas frequências, então imprimimos "Anagrams".

```java
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
```
