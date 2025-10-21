import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        int count = 1;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }
}
/*
    PATTERN:

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
 */
