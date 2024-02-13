import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []A = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        for (int i=0; i<M; i++) {
            int target = sc.nextInt();
            int s = 0;
            int e = N-1;
            boolean found = false;
            while (s <= e) {
                int middle = (s+e)/2;
                if (A[middle] == target) {
                    found = true;
                    break;
                } else if (A[middle] > target) {
                    e = middle - 1;
                } else {
                    s = middle + 1;
                }
            }
            if (found)
                System.out.println(1);
            else
                System.out.println(0);
            
        }

    }
}
