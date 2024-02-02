import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int count = 0;
        for (int i=0; i<N; i++) {
            int target = A[i];
            int start = 0;
            int end = N - 1;

            while (start < end) {
                if (A[start] + A[end] == target) {
                    if (start!= i && end!=i) {
                        count++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if (A[start] + A[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}
