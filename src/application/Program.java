package application;




import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {
            int[][] mat = new int[n][n];

            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    mat[i][j] = 1 + Math.abs(i - j);

                }
            }

            for (int i=0; i<n; i++) {
                System.out.printf("%3d", mat[i][0]);
                for (int j=1; j<n; j++) {
                    System.out.printf(" %3d", mat[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            n = sc.nextInt();

          }

        }

    }




