import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        A = new ArrayList[N+1];
        for (int i=1; i<N+1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        visited = new boolean[N+1];
        for (int i=0; i<M; i++) {
            int s = sc.nextInt();;
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }
        bfs(1);
        System.out.println(count);
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            for (int i:A[now_node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    count++;
                }
            }
        }
    }
}
