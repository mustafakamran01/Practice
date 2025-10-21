import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= (rows-i+1); j++){
                System.out.print(j + " ");
            }

            for(int j = 1; j <= (i*2)-2; j++){
                System.out.print("* ");
            }
            int count = rows-i+1;
            for(int j = 1; j <= (rows-i+1); j++){
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
    }
}
/*
    PATTERN:

    1 2 3 4 5 5 4 3 2 1
    1 2 3 4 * * 4 3 2 1
    1 2 3 * * * * 3 2 1
    1 2 * * * * * * 2 1
    1 * * * * * * * * 1

 */
