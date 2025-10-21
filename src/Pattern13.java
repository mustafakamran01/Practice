import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }
            int count = i;
            for(int j = 1; j <= i-1; j++){
                System.out.print(count + " ");
                count--;
            }
            count = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
/*
    PATTERN:

          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
 */
