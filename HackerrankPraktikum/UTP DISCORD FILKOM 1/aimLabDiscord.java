import java.util.Scanner;

// soal : https://www.hackerrank.com/contests/utp-discord-filkom-ub/challenges/aim-lab-bangjago

public class aimLabDiscord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jml = sc.nextInt();
        int[] huda = new int[jml];
        int[] forga = new int[jml];
        int scoreHuda=0, scoreForga=0;

        for (int i = 0; i < jml; i++) {
            huda[i] = sc.nextInt();
        }
        for (int i = 0; i < jml; i++) {
            forga[i] = sc.nextInt();
        }
        for (int i = 0; i < jml; i++) {
            if (huda[i] > forga[i]) {
                scoreHuda++;
            } else if (huda[i] < forga[i]) {
                scoreForga++;
            }
        }
        System.out.printf("Huda : %d - %d : Forga",scoreHuda,scoreForga);

    }

}
