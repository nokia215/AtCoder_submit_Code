package fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciMemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        System.out.println(fib(n));
    }

    public static long fib(int n) {
        Map<Integer, Long> FibMap = new HashMap<>();
        
        FibMap.put(0, 0L);
        FibMap.put(1, 1L);

        return FibMap.computeIfAbsent(n, i -> fib(n - 1) + fib(n - 2));
    }
}