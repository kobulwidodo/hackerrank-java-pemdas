import java.util.Scanner;

// https://www.hackerrank.com/contests/tes-pti-a-2020/challenges/bang-beli-xiboba

public class beliXiboba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte jml = sc.nextByte();
        int harga = sc.nextInt();

        System.out.printf("%-25s: %d\n%-25s: Rp %d\n\n", "Jumlah xiboba", jml, "Harga 1 xiboba", harga);

        double totHarga = jml * harga;
        double diskon = totHarga * 0.09;

        System.out.printf("%-25s: Rp %.1f\n%-25s: Rp " + diskon + "\n\n", "Harga seluruh xiboba", totHarga, "Diskon xiboba");

        double totDiskon = totHarga - diskon;
        double pajak = totDiskon * 0.03;

        System.out.printf("%-25s: Rp " + totDiskon + "\n%-25s: Rp " + pajak + "\n\n", "Harga setelah diskon", "Pajak xiboba");

        double total = totDiskon + pajak;
        System.out.printf("%-25s: Rp " + total, "Harga total");

    }

}
