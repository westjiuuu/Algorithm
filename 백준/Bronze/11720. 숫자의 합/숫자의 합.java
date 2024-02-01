
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();
        int sum = 0;

        for (int i=0; i<n; i++) {
            char digitChar = numbers.charAt(i);
            int digit = Integer.parseInt(Character.toString(digitChar));
            sum += digit;
        }
        System.out.println(sum);
    }
}
