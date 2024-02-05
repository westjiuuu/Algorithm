import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int [] A= new int[st.length()];
        for (int i=0; i<st.length(); i++) {
            A[i] = Integer.parseInt(st.substring(i, i+1));
        }
        for (int i=0; i< st.length(); i++) {
            int max = i;
            for (int j = i+1; j< st.length(); j++) {
                if(A[j] > A[max]) {
                    max = j;
                }
            }
            if (A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        for (int a : A) {
            System.out.print(a);
        }
    }
}