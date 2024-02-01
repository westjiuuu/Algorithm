import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
       int max = A[0];
        for (int j = 1; j < n; j++) {
            if (A[j] > max) {
                max = A[j];
            }
        }
        System.out.println((double)sum*100/max/n);
    }
}