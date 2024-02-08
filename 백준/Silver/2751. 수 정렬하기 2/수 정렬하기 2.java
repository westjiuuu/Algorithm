import java.io.*;

public class Main {
    public static int [] A, sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        sorted = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        merge_sort(0,N-1);
        for (int i=0; i<N; i++) {
            bw.write(A[i] + "\n");
        }
        bw.flush();
        bw.close();

    }
    private static void merge(int s, int middle, int e) {
        int i = s;
        int j = middle+1;
        int k = s;
        while (i<=middle && j<=e) {
            if (A[i] <= A[j]) {
                sorted[k] = A[i];
                i++;
            }
            else {
                sorted[k] = A[j];
                j++;
            }
            k++;
        }
        if (i>middle) {
            for (int t=j; t<=e; t++) {
                sorted[k] = A[t];
                k++;
            }
        }
        else {
            for (int t=i; t<=middle; t++) {
                sorted[k] = A[t];
                k++;
            }
        }
        for (int t=s; t<=e; t++) {
            A[t] = sorted[t];
        }
    }
    private static void merge_sort(int s, int e) {
        if (s<e) {
            int middle = s+(e-s)/2;
            merge_sort(s,middle);
            merge_sort(middle+1,e);
            merge(s,middle,e);
        }
    }
}