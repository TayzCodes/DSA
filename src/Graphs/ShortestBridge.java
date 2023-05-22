package Graphs;
import java.util.*;

public class ShortestBridge {
    static List<int[]> bfsqueue;
    public static void dfs(int[][] grid,int x, int y, int n){

        //do dfs
        grid[x][y] = 2;
        bfsqueue.add(new int[]{x,y});
        for(int[] pair: new int[][]{{x+1,y}, {x-1,y},{x,y+1},{x,y-1}}){
            int curx = pair[0], cury = pair[1];
            if( 0<=curx && curx>n && cury>=0 && cury<n && grid[curx][cury] == 1){
                dfs(grid, curx, cury, n);
            }
        }
    }

    public static int shortestBridge(int[][] grid) {
        int n = grid.length;
        int firstx = -1, firsty = -1;
        for(int i = 0;i< n;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 1){
                    firstx = i;
                    firsty = j;
                    break;
                }
            }
        }

        bfsqueue = new ArrayList<>();
        dfs(grid, firstx, firsty, n);

        int distance = 0;
        while(!bfsqueue.isEmpty()){
            List<int[]> newqueue = new ArrayList<>();
            for(int[] pair : bfsqueue){
                int x= pair[0], y=pair[1];
                for(int[] newpair : new int[][]{{x+1,y}, {x-1,y},{x,y+1},{x,y-1}}){
                    int curx = newpair[0], cury = newpair[1];
                    if( curx>=0 && curx<n && cury>=0 && cury<n){
                        if(grid[curx][cury] == 1){
                            System.out.print(distance);
                            return distance;
                        } else  if(grid[curx][cury] == 0){
                            newqueue.add(newpair);
                            grid[curx][cury] = -1;
                        }

                    }
                }
            }


            bfsqueue = newqueue;
            distance++;
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,1,0},{0,0,0},{0,0,1}};
        System.out.println(shortestBridge(grid));
    }
}
