import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String string = scanner.nextLine();
        StringBuilder reversedString = new StringBuilder();

        for(int i = string.length() - 1; i >= 0; i--){
            reversedString.append(string.charAt(i));
        }
        System.out.println("The reversed string is: " + reversedString);
    }
}
