import java.util.Scanner;

//https://www.hackerrank.com/contests/utp-discord-filkom-ii/challenges/piramida-joko

public class piramidaJoko {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angka = sc.nextInt();
        int jarak = angka;

        for (int i = 1; i <= angka; i++) {
            for (int j = 0;j < (jarak - 1)*2; j++){
                System.out.print(" ");
            }
            for (int j = i;j > 0;j--) {
                System.out.print(j + " ");
            }
            int k = 2;
            for (int j = 1; j < i;j++){
                System.out.print(k + " ");
                ++k;
            }
            jarak--;
            System.out.println();
        }

    }

}
