package Matris;

import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int N = scanner.nextInt();
        int i, j;


        int[][] matris = new int[N][N];

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.println((i + 1) + ". satir " + (j + 1) + ". sutun:");
                matris[i][j] = scanner.nextInt();
            }
        }


        int x, y;

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        int sayac = 1;
        for (x = 1; x < N; x++) {
            for (y = 1; y < N; y++) {
                if (matris[x][y] != matris[y][x]) {
                    sayac = 0;
                    break;
                }
            }
        }
        System.out.println("\n");
        System.out.println(sayac == 1 ? "Simetrik" : "Simetrik Değil");
    }

}
