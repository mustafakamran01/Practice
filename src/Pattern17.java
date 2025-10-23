import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        int part = rows/2;

        for (int i = 1; i <= part+1; i++){
            for (int j = 1; j <= (part+1)-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= part; i++){
            for (int j = 1; j <= i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
    PATTERN:

    * * * *
    * * *
    * *
    *
    * *
    * * *
    * * * *
 */
