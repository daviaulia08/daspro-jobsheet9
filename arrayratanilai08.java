import java.util.Scanner;

public class arrayratanilai08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        double nilaiLulus = 0;
        double nilaiTidakLulus = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
        }
        
        double jumlahLulus = 0;
        double jumlahTidakLulus = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) {
                nilaiLulus += nilai[i];
                jumlahLulus++;
            }
            else {
                nilaiTidakLulus += nilai[i];
                jumlahTidakLulus++;
            }    
        }

        double rataLulus = nilaiLulus/jumlahLulus;
        double rataTidakLulus = nilaiTidakLulus/jumlahTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}