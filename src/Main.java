import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        int range;
        String playAgain;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");

            System.out.print("Masukan banyak angka yang mau dicetak [2..10] : ");
            count = input.nextInt();

            System.out.print("Masukan beda masing-masing angka [2..9] : ");
            range = input.nextInt();

            System.out.println(" ");
            System.out.println("Deret Aritmatika");
            int aritmatika = 1;
            int index_aritmatika = 0;
            while (index_aritmatika < count) {
                System.out.print(aritmatika + " ");
                aritmatika += range;
                index_aritmatika++;
            }
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Deret Geometri");
            int geometri = 1;
            int index_geometri = 0;
            while (index_geometri < count) {
                System.out.print(geometri + " ");
                geometri *= range;
                index_geometri++;
            }
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Faktorial dari " + count);
            int faktorial = 1;
            int index_faktorial = count;
            while (index_faktorial >= 1) {
                faktorial *=  index_faktorial;
                if (index_faktorial == 1) {
                    System.out.print(index_faktorial + " = ");
                } else {
                    System.out.print(index_faktorial + " * ");
                }
                index_faktorial--;
            }
            System.out.println(faktorial);
            System.out.println(" ");

            System.out.print("Anda mau ulang ? [y/t] : ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("Y"));
        System.out.println("Terima kasih, program sudah berakhir..");
    }
}
