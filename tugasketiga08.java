import java.util.Scanner;

public class tugasketiga08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("---------------------------");
        System.out.println("----WELCOME TO THE CAFE----");
        System.out.println();
        System.out.println("-----------MENUU-----------");

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println();

        System.out.print("Masukkan nama pesanan yang ingin dicari : ");
        String dicari = sc.nextLine();

        int hasil = 0;

        for (String item : menu) {
            if (item.equalsIgnoreCase(dicari)) {
                hasil = 1;
                break;
            }
        }

        if (hasil == 1) {
            System.out.println("Pesanan " + dicari + " terdapat di menu");
        }
        else {
            System.out.println("Pesanan " + dicari + " tidak terdapat di menu");
        }
        
        System.out.println("---------------------------");
    }
}