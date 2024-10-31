import java.util.Scanner;

public class tugaskedua08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("---------------------------");
        System.out.println("----WELCOME TO THE CAFE----");
        System.out.println();
        System.out.println("-----------MENUU-----------");
        System.out.println("1. Kopi Cold Brew   = 13 k ");
        System.out.println("2. Kopi D'Cream     = 10 k ");
        System.out.println("3. Pancong Original = 8 k ");
        System.out.println("4. Pancong Extra    = 15 k ");
        System.out.println();
        System.out.print("Jumlah pesanan pengguna : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String [jumlah];
        double[] harga = new double [jumlah];
        double total = 0;

        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan jenis pesanan ke-" + (i+1) + " : ");
            pesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i+1) + " : ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
            total += harga[i];
        }

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println("Pesanan ke-" + (i+1) + " : " + pesanan[i] + " dengan harga : " + harga[i]);
        }

        System.out.println("Total biaya pesanan : " + total);
        System.out.println("---------------------------");
    }
}