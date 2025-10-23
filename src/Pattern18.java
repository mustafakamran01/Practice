import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        int count = 1;

        for (int i = 1; i <= rows; i++){
            int countIn = count;
            for (int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= rows-i+1; j++){
                System.out.print(countIn + " ");
                countIn++;
            }
            count++;
            System.out.println();
        }
    }
}
/*
    PATTERN:

    1 2 3 4 5 6 7
     2 3 4 5 6 7
      3 4 5 6 7
       4 5 6 7
        5 6 7
         6 7
          7
 */
