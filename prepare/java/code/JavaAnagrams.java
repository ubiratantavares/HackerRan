import java.util.Scanner;

public class JavaAnagrams {

    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {

            int frequenciaCaracterDaStringa = 0;
            int frequenciaCaracterDaStringb = 0;
            
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    frequenciaCaracterDaStringa++;
                }
                if (a.charAt(i) == (b.charAt(j))) {
                    frequenciaCaracterDaStringb++;
                }
            }
            if (frequenciaCaracterDaStringa != frequenciaCaracterDaStringb) {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams");
    }
}
