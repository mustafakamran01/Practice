import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        char start = 'A';

        for(int i = 1; i <= rows; i++){
            char count = start;
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            start++;
            System.out.println();
        }
    }
}
/*
    PATTERN:

    A
    B C
    C D E
    D E F G
    E F G H I
 */
