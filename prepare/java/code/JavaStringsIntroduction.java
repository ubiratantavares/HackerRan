import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        // Imprimir a soma dos comprimentos de A e B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
        
        // Determinar se A é lexicograficamente maior que B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Capitalizar a primeira letra de A e B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Imprimi-las separadas por um espaço
        System.out.println(capitalizedA + " " + capitalizedB);
        
    }
}

