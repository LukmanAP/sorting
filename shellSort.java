import java.util.Scanner;

public class shellSort {
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
                shellSortTerkecil(input());
            } else if ( no == '2') {
                shellSortTerbesar(input());
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


    public static void shellSortTerkecil(int data[]) {
        for ( int a = data.length/2; a > 0; a/=2 ) {
            for ( int i = 1; i < data.length; i++) {
                int baru = data[i];
                int j;
                for (j = i; j >= a && data[j - a] > baru; j -= a) {
                    data[j] = data[j - a];
                }
                data[j] = baru;
            }
        }
        for (int hasil : data) {
            System.out.print(hasil + ", ");
        }
    }

    public static void shellSortTerbesar( int data[]) {
        for ( int a = data.length/2; a > 0; a/=2 ) {
            for ( int i = 1; i < data.length; i++) {
                int baru = data[i];
                int j;
                for (j = i; j >= a && data[j - a] < baru; j -= a) {
                    data[j] = data[j - a];
                }
                data[j] = baru;
                
            }
        }
        for (int hasil : data) {
            System.out.print(hasil + ", ");
        }
    }
}



/*
1. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : 1
    masukan Berapa banyak angka yang ingin anda tampung : 9
    Masukan angka pada kotak ke-1 : 5
    Masukan angka pada kotak ke-2 : 8
    Masukan angka pada kotak ke-3 : 7
    Masukan angka pada kotak ke-4 : 6
    Masukan angka pada kotak ke-5 : 1
    Masukan angka pada kotak ke-6 : 4
    Masukan angka pada kotak ke-7 : 2
    Masukan angka pada kotak ke-8 : 3
    Masukan angka pada kotak ke-9 : 9
    1, 2, 3, 4, 5, 6, 7, 8, 9, 
}

2. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : 2
    masukan Berapa banyak angka yang ingin anda tampung : 8
    Masukan angka pada kotak ke-1 : 1
    Masukan angka pada kotak ke-2 : 5
    Masukan angka pada kotak ke-3 : 2
    Masukan angka pada kotak ke-4 : 4
    Masukan angka pada kotak ke-5 : 3
    Masukan angka pada kotak ke-6 : 6
    Masukan angka pada kotak ke-7 : 8
    Masukan angka pada kotak ke-8 : 7
    8, 7, 6, 5, 4, 3, 2, 1, 
}

3. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : x

    PS D:\My Drive\github\sorting> 
}
*/