import java.util.Scanner;

public class selectionSort{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        var nilai = true;
        boolean nilai1 = true;
        while (nilai == nilai1) {
        System.out.println("==== Menu ====");
            System.out.println("1. Urutkan Nilai dari yang terkecil ke yang terbesar");
            System.out.println("2. Urutkan Nilai dari yang terbesar ke yang terkecil");
            System.out.println("x. Keluar");

            System.out.print("Anda Mau yang mana (masukan no) : ");
            char no = scanner.next().charAt(0);       
        
            if ( no == '1') {
                selectionSortTerkecil(input());
            } else if ( no == '2') {
                selectionSortTerbesar(input());
            } else if ( no == 'x') {
                nilai1 = false; 
            } else {
                System.out.println("Input Salah !");
            }

        System.out.println("");
        }
    }

    public static int[] input() {
        System.out.print("masukan Berapa banyak angka yang ingin anda tampung : ");
        int isi = scanner.nextInt();
        int[] data = new int[isi];

        for (int i = 0; i < data.length; i++) {
            int angka = 0 ;
            System.out.print("Masukan angka pada kotak ke-"+ (i+1) + " : ");
            angka = scanner.nextInt();
            data[i] = angka;
        }
        return data;
    }

    public static void selectionSortTerkecil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            
            int index = i;
            for (int j = i; j < data.length; j++) {
                if (data[index] > data[j]) {
                    index = j;
                }
            }
            int baru = data[i];
            data[i] = data[index];
            data[index] = baru;
        }

        for (int b : data ) {
            System.out.print(b + ", ");
        }
    }

    public static void selectionSortTerbesar( int data[]) {
        for (int i = 0; i < data.length; i++) {
            
            int index = i;
            for (int j = i; j < data.length; j++) {
                if (data[index] < data[j]) {
                    index = j;
                }
            }
            int baru = data[i];
            data[i] = data[index];
            data[index] = baru;
        }

        for (int b : data ) {
            System.out.print(b + ", ");
        }
    }
}