import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int rows = scanner.nextInt();

        if(rows <= 1){
            System.out.println("Enter number of rows more than 1");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}
/*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 */
