package twoDArray;
import java.io.*;
/**
 * @javaDoc
 standard input/output: 2s/128000 kB

 Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed
adjacently along both the axis.
 On his birthday, Tom has been gifted a board which is in the form an NxN grid.
Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard,
he will try to convert the board that has been gifted to him identical to a chessboard.
He has both black and white colours available to him. Help him find out the minimum number of the cell
he will have to recolour to get a chessboard like board.
 Input
 First line contains an integer N, denoting the size of the board
 Next N lines contains N space separated integers and each integer being either '0' or '1'
 '1' represent black cell
 '0' represents white cell

 Constraints
 1 <= N <= 1000
 Output
 A single integer that is the minimum number of cells that Tom will
have to colour to convert the given board to a chess board



Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus we will have to colour 4 cells.

Input:
3
0 1 0
1 0 1
0 1 0

Output:
0
 */
public class chessBoard {
 public static void main (String[] args) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  int n = Integer.parseInt(br.readLine());

  String[] a = new String[n];

  for(int i=0; i<n; i++){

   a[i] = br.readLine();

  }

  int initial = 0;
  int countForZero = 0;
  int countForOne = 0;

  // count when it should be start from zero
  for(int i=0; i<n; i++){
   int curr = initial;
   for(int j=0; j< a[i].length(); j=j+2){
    int val = a[i].charAt(j)-48;
    if(val != curr){
     countForZero++;
    }
    curr = 1-curr;
   }
   initial = 1-initial;
  }


  // count when it should be start from one
  initial = 1;
  for(int i=0; i<n; i++){
   int curr = initial;
   for(int j=0; j<a[i].length(); j=j+2){
    int val = a[i].charAt(j)-48;
    if(val != curr){
     countForOne++;
    }
    curr = 1-curr;
   }
   initial = 1-initial;
  }
  System.out.println(Math.min(countForZero,countForOne));






 }

}
