import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int start = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();

        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            if (value >= start) {
                for (int k = start; k <= value; k++) {
                    stack.push(k);
                    bf.append("+").append("\n");
                }
                start = value + 1;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            bf.append("-").append("\n");
        }
        System.out.println(bf);
    }
}
