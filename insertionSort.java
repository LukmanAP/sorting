import java.util.Scanner;

public class insertionSort {

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
                insertSortTerkecil(input());
            } else if ( no == '2') {
                insertSOrtTerbesar(input());
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

    public static void insertSortTerkecil(int data[]) {
        for (int i = 1; i < data.length; i++) {

            for (int j = i; j > 0; j--) {
                if (data[j] < data[j-1]) {
                    int baru = data[j];
                    data[j] = data[j-1];
                    data[j-1] = baru;
                }
            }
        }

        for (int hasil : data) {
            System.out.print(hasil + ", ");
        }

    }

    public static void insertSOrtTerbesar(int data[]) {
        for (int i = 1; i < data.length; i++) {

            for (int j = i; j > 0; j--) {
                if (data[j] > data[j-1]) {
                    int baru = data[j];
                    data[j] = data[j-1];
                    data[j-1] = baru;
                }
            }
        }

        for (int hasil : data) {
            System.out.print(hasil + ", ");
        }
    }
}

/**
 1. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil     
    x. Keluar
    Anda Mau yang mana (masukan no) : 2
    masukan Berapa banyak angka yang ingin anda tampung : 5
    Masukan angka pada kotak ke-1 : 1
    Masukan angka pada kotak ke-2 : 4
    Masukan angka pada kotak ke-3 : 2
    Masukan angka pada kotak ke-4 : 3
    Masukan angka pada kotak ke-5 : 5
    5, 4, 3, 2, 1, 
 }


 2. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar     
    2. Urutkan Nilai dari yang terbesar ke yang terkecil     
    x. Keluar
    Anda Mau yang mana (masukan no) : 1
    masukan Berapa banyak angka yang ingin anda tampung : 5
    Masukan angka pada kotak ke-1 : 2
    Masukan angka pada kotak ke-2 : 4
    Masukan angka pada kotak ke-3 : 1
    Masukan angka pada kotak ke-4 : 3
    Masukan angka pada kotak ke-5 : 5
    1, 2, 3, 4, 5, 
 }


 3. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar     
    2. Urutkan Nilai dari yang terbesar ke yang terkecil     
    x. Keluar
    Anda Mau yang mana (masukan no) : x

    PS D:\My Drive\github\java> 
 }

 */


