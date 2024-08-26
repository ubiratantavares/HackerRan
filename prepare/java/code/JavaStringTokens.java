import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // remove todos os caracteres não alfabéticos, exceto apostrofos
        s = s.replaceAll("[^A-Za-z]", " ");

        // separa a string s em tokens
        String[] tokens = s.trim().split("\\s+");

        // Imprime o número de tokens
        System.out.println(tokens.length);

        // Imprime token a token
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
