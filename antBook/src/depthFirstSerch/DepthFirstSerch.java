package depthFirstSerch;

import java.util.Scanner;

public class DepthFirstSerch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();

        sc.close();

        System.out.println(solve(n, a, k));

    }

    public static String solve(int n, int[] a, int k) {
        if(dfs(0, 0, n, a, k)) {
            return "Yes";
        }
        return "No";
    }

    public static boolean dfs(int i, int sum, int n, int[] a, int k) {
        if(i == n) {
            return sum == k;
        }
        if( dfs(i + 1, sum + a[i], n, a, k) ) {
            return true;
        }
        if( dfs(i + 1, sum, n, a, k) ) {
            return true;
        }
        return false;
    }
}