import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int num;
        for (int i=0; i<N;i++) {
            num = sc.nextInt();
            pq.add(num);
        }
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        while (pq.size()!=1) {
            num1 = pq.remove();
            num2 = pq.remove();
            count += (num1 + num2);
            pq.add(num1+num2);
        }
        System.out.println(count);
    }
}