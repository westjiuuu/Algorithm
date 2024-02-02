import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] A = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int count = 0;
        int start = 0;
        int end = N - 1;

        while (start < end) {
            int res = A[start] + A[end];

            if (res == M) {
                count++;
                start++;
                end--;
            } else if (res < M) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}