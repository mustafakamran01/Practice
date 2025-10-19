import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        if(rows <= 2){
            System.out.println("Enter number of rows more than 2");
        } else {
            for(int i = 1; i <= rows; i++){
                for(int j = 1; j <= rows; j++){
                    if(i == 1 || i == rows){
                        System.out.print("*");
                    } else {
                        if(j == 1 || j == rows){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
/*
    * * * * *
    *       *
    *       *
    *       *
    * * * * *
 */

