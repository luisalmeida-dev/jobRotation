import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int term = 0, term1 = 0, term2 = 1;
        boolean state = false;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num >= 2){
            while (num > term){
                term = term1 + term2;
                term1 = term2;
                term2 = term;
                if(num == term){
                    state = true;
                }
            }
            if(state){
                System.out.println("The number is present in the sequence!");
            } else {
                System.out.println("The number doesn't appear in the sequence!");
            }
        }else {
            throw new Exception("The number " + num + " is invalid! Try something greater than 1.");
        }
    }
}
