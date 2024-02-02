import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1;

        while (end !=N) {
            if (N==sum) {
                count++;
                end++;
                sum = sum + end;
            } else if (N < sum) {
                sum = sum-start;
                start++;
            } else if (N > sum) {
                end++;
                sum = sum + end;
            }
        }
        System.out.println(count);
    }
}