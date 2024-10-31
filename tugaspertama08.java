import java.util.Scanner;

public class tugaspertama08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan banyaknya mahasiswa : ");
        int jumlah = sc.nextInt();

        int[] nilai = new int [jumlah];

        double total = 0;
        double rata;

        for (int i=0; i<nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        rata = total/jumlah;

        int terendah = 100;
        int tertinggi = 0;


        for (int i=0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        for (int i=0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " : " + nilai[i]);
        }

        System.out.println("Rata-rata dari nilai mahasiswa : " + rata);
        System.out.println("Tertinggi dari nilai mahasiswa : " + tertinggi);
        System.out.println("Terendah dari nilai mahasiswa : " + terendah);

    } 
}