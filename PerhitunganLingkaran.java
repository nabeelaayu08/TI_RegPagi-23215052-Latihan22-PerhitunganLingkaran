package PerhitunganLingkaran;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini digunakan untuk menghitung jari-jari, luas, serta keliling lingkaran
 */

import java.util.Scanner;

public class PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        double diameter = 0;

            System.out.println("====== Perhitungan Lingkaran ======");
        
        // Loop untuk validasi input
        while (!inputValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String inputDiameter = input.nextLine();

            try {
                // Mencoba mengonversi input menjadi angka
                diameter = Double.parseDouble(inputDiameter);
                if (diameter > 0) {
                    inputValid = true; // Jika input valid
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    System.out.println(); // Menambahkan jarak kosong
                }
            } catch (NumberFormatException e) {
                // Jika input bukan angka
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println(); // Menambahkan jarak kosong
            }
        }

        // Jika input valid, lakukan perhitungan
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2); // Luas lingkaran = πr²
        double keliling = 2 * Math.PI * jariJari; // Keliling lingkaran = 2πr

        // Menampilkan hasil
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm^2%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);

        input.close(); // Menutup scanner
    }
}
