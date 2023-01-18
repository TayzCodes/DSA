package DynamicProgramming;

public class UniquePaths3 {
   static  int ans = 0;
   // static int cnt = 0;
    public static int uniquePathsIII(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int m = grid.length;
        int n = grid[0].length;// columns
        int cnt = 0;
        int initI = -1;
        int initJ = -1;

        for(int i =0;i< m;i++){
            for(int j=0;j< n;j++){
                if(grid[i][j] == 0){
                    cnt++;
                }
                if(grid[i][j] == 1){
                    initI = i;
                    initJ = j;
                    cnt++;
                }
            }
        }
        // find ways using dfs
        findWays(grid, visited, initI, initJ, cnt);
        return ans;
    }

    public static void findWays(int[][] grid, int[][] visited, int i, int j, int cnt){
        if(i>=grid.length || i< 0 || j>=grid[0].length || j< 0|| grid[i][j] == -1 || visited[i][j] == 1){
            return;
        }

        if(grid[i][j] == 2 && cnt == 0){
            ans++;
        }
        visited[i][j] = 1;
        cnt--;

        findWays(grid, visited, i+1, j, cnt);
        findWays(grid, visited, i-1, j, cnt);
        findWays(grid, visited, i, j+1, cnt);
        findWays(grid, visited, i, j-1, cnt);

        visited[i][j] = 0;
        cnt++;


    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}};

        System.out.println(uniquePathsIII(grid));
    }
}
