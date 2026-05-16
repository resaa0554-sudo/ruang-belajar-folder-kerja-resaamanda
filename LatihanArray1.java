import java.util.Scanner;

 public class LatihanArray1 {
    public static void main(String[] args) {

        String[] nama = new String[5];

        Scanner scan = new Scanner(System.in);


        for(int i = 0; i < nama.length; i++) {
            System.out.print("Nama " + (i + 1) + ": ");
            nama[i] = scan.nextLine();
        }

        System.out.println("================");

        for(String b : nama) {
            System.out.println(b);
        }

        scan.close();
    }
}