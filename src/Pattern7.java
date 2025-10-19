import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        char count = 'A';

        for(int i = 1; i <= rows; i++){
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

    A
    B C
    D E F
    G H I J
    K L M N O
 */
