import java.util.Scanner;

public class arrayratanilai08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        int[] nilai = new int[10];
        double total = 0;
        double rata;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        rata = total/nilai.length;
        System.out.println("Rata-rata nilai = " + rata );

    }
}