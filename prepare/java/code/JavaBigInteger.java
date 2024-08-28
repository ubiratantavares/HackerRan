import java.util.*;
import java.math.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String a = entrada.nextLine();

        String b = entrada.nextLine();

        entrada.close();
        
        BigInteger num1 = new BigInteger(a);

        BigInteger num2 = new BigInteger(b);

        BigInteger soma = num1.add(num2);

        BigInteger produto = num1.multiply(num2);

        System.out.println(soma);

        System.out.println(produto);
        
    }
}
