package depthFirstSerch;

import java.util.Scanner;

public class DepthFirstSerch_2 {

    static int M;
    static int N;
    static char[][] FIELD;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        FIELD = new char[N][M];

        for(int i = 0; i < N; i++) {
            FIELD[i] = sc.next().toCharArray();
        }

        sc.close();
        int ans = 0;
        
        for(int i = 0; i < N; i++) {
            for( int j = 0; j < M; j++) {
                if(FIELD[i][j] == 'w') {
                    dfs(i, j);
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
        
    }
    
    public static void dfs(int i, int j) {
        FIELD[i][j] = '.';
        for(int x = i - 1; x <= i + 1; x++) {
            for(int y = j - 1; y <= j + 1; y++) {
                if( x >= 0 && x < N && y >= 0 && y < M && FIELD[x][y] == 'w') {
                    dfs(x, y);
                    System.out.println("-------------------");
                }
                    
            }
            for(char a: FIELD[i]){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}