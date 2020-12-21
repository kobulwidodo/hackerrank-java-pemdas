import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/contests/utp-discord-filkom-ii/challenges/leaderboard-valorant-filkom/problem

public class leaderboardValor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score1 = new int[sc.nextInt()];
        int[] score2 = new int[sc.nextInt()];
        for (int i = 0; i < score1.length;i++) {
            score1[i] = sc.nextInt();
        }
        for (int i = 0; i < score2.length;i++) {
            score2[i] = sc.nextInt();
        }
        int[] score = new int[score1.length + score2.length]; //1 + 1 = 2 --> 0,1
        for (int i = 0; i < score1.length;i++) {
            score[i] = score1[i]; //score[0]
        }
        for (int i = 0; i < score2.length;i++) {
            int j = i + score1.length;
            score[j] = score2[i]; // 0 + ? = 1
        }
        Arrays.sort(score);

        System.out.println("Team || Score");
        System.out.println("=============");
        for (int i = score.length-1; i >= 0; i--) { // 2-1 = 1
            for (int j = 0; j < score1.length;j++) {
                if (score[i] == score1[j]) { //
                    System.out.printf("%-5d|| %d\n", 1, score[i]);
                    break;
                }
            }
            for (int j = 0; j < score2.length;j++) {
                if (score[i] == score2[j]) { //
                    System.out.printf("%-5d|| %d\n", 2, score[i]);
                    break;
                }
            }
        }
    }

}
