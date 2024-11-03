import java.util.Scanner;

public class searchnilai08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int [jumlah];

        for (int i=0 ; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                System.out.println();
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
                System.out.println();
                break;
            }
            else {
                System.out.println("Nilai yang dicari tidak ditemukan.");
                break;
            }
        }
    }
}