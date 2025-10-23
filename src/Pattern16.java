import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= 2*rows; j++){
                if (j > i && j <= 2*rows-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= 2*rows; j++){
                if (j > i && j <= 2*rows-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
/*
    PATTERN:

    *        *
    **      **
    ***    ***
    ****  ****
    **********
    **********
    ****  ****
    ***    ***
    **      **
    *        *
 */


