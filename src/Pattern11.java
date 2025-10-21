import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        int count = 1;

        for(int i = 1; i <= rows; i++){
            int countIn = count;
            for(int j = 1; j <= i; j++){
                System.out.print(countIn + " ");
                if (countIn == 1){
                    countIn = 0;
                } else {
                    countIn = 1;
                }
            }
            if (count == 1){
                count = 0;
            } else {
                count = 1;
            }
            System.out.println();
        }
    }
}
/*
    PATTERN:

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
