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

/**
 
1. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : 1
    masukan Berapa banyak angka yang ingin anda tampung : 9
    Masukan angka pada kotak ke-1 : 9
    Masukan angka pada kotak ke-2 : 4
    Masukan angka pada kotak ke-3 : 6
    Masukan angka pada kotak ke-4 : 5
    Masukan angka pada kotak ke-5 : 7
    Masukan angka pada kotak ke-6 : 8
    Masukan angka pada kotak ke-7 : 1
    Masukan angka pada kotak ke-8 : 3
    Masukan angka pada kotak ke-9 : 2
    1, 2, 3, 4, 5, 6, 7, 8, 9, 
}

2. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : 2
    masukan Berapa banyak angka yang ingin anda tampung : 9
    Masukan angka pada kotak ke-1 : 6
    Masukan angka pada kotak ke-2 : 9
    Masukan angka pada kotak ke-3 : 7
    Masukan angka pada kotak ke-4 : 8
    Masukan angka pada kotak ke-5 : 5
    Masukan angka pada kotak ke-6 : 1
    Masukan angka pada kotak ke-7 : 3
    Masukan angka pada kotak ke-8 : 2
    Masukan angka pada kotak ke-9 : 4
    9, 8, 7, 6, 5, 4, 3, 2, 1, 
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