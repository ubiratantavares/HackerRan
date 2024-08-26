# Java String Tokens

Dada uma string,, correspondendo à expressão regular `[A-Za-z !,?._'@]+`, divida a string em _tokens_ . Definimos um token como uma ou mais letras consecutivas do alfabeto inglês. Então, imprima o número de tokens, seguido por cada token em uma nova linha.

**Observação: o método** [String.split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-) pode ser útil para concluir este desafio.

## **Formato de entrada**

Uma única corda,.

## **Restrições**

- é composto de _qualquer um_ dos seguintes: letras do alfabeto inglês, espaços em branco, pontos de exclamação ( `!`), vírgulas ( `,`), pontos de interrogação ( `?`), pontos finais ( `.`), sublinhados ( `_`), apóstrofos ( `'`) e símbolos de arroba ( `@`).

## **Formato de saída**

Na primeira linha, imprima um inteiro,, denotando o número de tokens na string(eles _não_ precisam ser únicos). Em seguida, imprima cada um dostokens em uma nova linha na mesma ordem em que aparecem na string de entrada.

## **Entrada de amostra**

```bash
He is a very very good boy, isn't he?
```

## **Saída de amostra**

```bash
10
He
is
a
very
very
good
boy
isn
t
he
```

## **Explicação**

Consideramos um token como um segmento contíguo de caracteres alfabéticos. Há um total detais tokens em string, e cada token é impresso na mesma ordem em que aparece na string s.

```Java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
    }
}
```
