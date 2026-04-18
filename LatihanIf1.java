import java.util.Scanner;

public class LatihanIf1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simulasi Pilih Jurusan ===");
        System.out.println("1. psikologi");
        System.out.println("2. kedokteran");
        System.out.print("Masukkan pilihan jurusan (1/2): ");
        
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih jurusan psikologi.");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih jurusan kedokteran.");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
