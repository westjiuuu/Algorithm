import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for (int j=N-1; j>0; j--) {
            for (int k=0; k<j; k++) {
                if (A[k] > A[k+1]) {
                    int temp = A[k];
                    A[k] = A[k+1];
                    A[k+1] = temp;
                }
            }
        }
        for (int a : A) {
            System.out.println(a);
        }
    }
}