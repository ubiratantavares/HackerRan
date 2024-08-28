# Pattern Syntax Checker

Usando Regex, podemos facilmente combinar ou procurar padrões em um texto. Antes de procurar um padrão, temos que especificar um usando alguma sintaxe bem definida.

Neste problema, você recebe um padrão. Você tem que verificar se a sintaxe do padrão dado é válida.

Nota : Neste problema, uma regex só é válida se você puder compilá-la usando o método Pattern.compile .

## Formato de entrada

A primeira linha de entrada contém N inteiro, denotando o número de casos de teste. O próximo N linhas contêm uma sequência de caracteres imprimíveis que representam o padrão de uma regex.

## Formato de saída

Para cada caso de teste, imprima **Valid** se a sintaxe do padrão fornecido estiver correta. Caso contrário, imprima **Invalid**. Não imprima as aspas.

## Entrada de amostra

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

## Saída de amostra

Valid
Invalid
Invalid

```Java
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        in.close();
        while (testCases > 0) {
        String pattern = in.nextLine();
        
        }
    }
}

```
