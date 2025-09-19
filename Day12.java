package faiz;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner faiz = new Scanner(System.in);

        System.out.println("Input Biodata");
        System.out.print("Masukkan Nama      : ");
        String nama = faiz.nextLine();

        System.out.print("Masukkan NIM       : ");
        String nim = faiz.nextLine();

        System.out.print("Angkatan           : ");
        int angkatan = faiz.nextInt();

        System.out.print("Masukkan Nilai IPK : ");
        float ipk = faiz.nextFloat();

        System.out.print("Masukkan Nilai IPS : ");
        double ips = faiz.nextDouble();

        System.out.println("User bernama " + nama + ", dengan NIM " + nim + ". User adalah angkatan tahun " + angkatan + " dengan nilai IPK (Indeks Prestasi Kumulatif) " + ipk + " dan nilai IPS (Indeks Prestasi Semester) " + ips + ".");
    }
}
