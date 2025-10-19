import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        if(rows <= 1){
            System.out.println("Enter number of rows more than 1");
        } else {
            for(int i = 1; i <= rows; i++){
                for(int j = 1; j <= (rows-i); j++){
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
/*
    PATTERN:

            *
          * *
        * * *
      * * * *
    * * * * *
 */
