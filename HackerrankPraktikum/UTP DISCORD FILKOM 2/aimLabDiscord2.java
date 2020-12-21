import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/contests/utp-discord-filkom-ii/challenges/aimlab-bangjago-ii

public class aimLabDiscord2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[sc.nextInt()];
        for (int i= 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        for (int i = score.length-1;i >= 0; i--) {
            if (i > 0) {
                System.out.print(score[i] + " > ");
            } else {
                System.out.print(score[i]);
            }
        }
    }

}
