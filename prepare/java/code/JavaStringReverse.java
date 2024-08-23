import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        // Verificar se a string é um palíndromo
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Método para verificar se uma string é um palíndromo
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
