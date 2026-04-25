import java.util.Scanner;

public class loopkotak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int panjang, lebar;

        System.out.print("panjang? ");
        panjang = input.nextInt();

        System.out.print("lebar? ");
        lebar = input.nextInt();

        int i = 1;

        while (i <= panjang) {
            int j = 1;

            while (j <= lebar) {
                System.out.print("*");
                j++;
            }

            System.out.print("\n");
            i++;
        }

        input.close();
    }
}