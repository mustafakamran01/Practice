import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++){
                System.out.print("* ");
                if (i != rows){
                    break;
                }
            }
            for (int j = 1; j <= i-1; j++){
                if (i != rows){
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= 1; j++){
                System.out.print("* ");
            }

            System.out.println();


        }
    }
}
/*
     *
   *   *
  *     *
 *       *
* * * * * *
 */
