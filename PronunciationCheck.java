import java.util.Scanner;

public class PronunciationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String vowels = "aeiou";
        int consecutiveConsonants = 0;
        boolean isHard = false;
        
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                consecutiveConsonants = 0;
            } else {
                consecutiveConsonants++;
            }
            
            if (consecutiveConsonants >= 4) {
                isHard = true;
                break;
            }
        }
        
        if (isHard) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        
        scanner.close();
    }
}