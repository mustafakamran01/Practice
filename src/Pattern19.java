import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        int part = rows/2;
        int count = 1;

        for (int i = 1; i <= part+1; i++){
            int countIn = count;
            for (int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= part+1-i+1; j++){
                System.out.print(countIn + " ");
                countIn++;
            }
            count++;
            System.out.println();
        }
//        System.out.println(count);

        count -= 2;

        for (int i = 1; i <= part; i++){
            int countIn = count;
            for (int j = 1; j <= part-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1; j++){
                System.out.print(countIn + " ");
                countIn++;
            }
            count--;
            System.out.println();
        }
    }
}
/*
    PATTERN:

    1 2 3 4 5 6
     2 3 4 5 6
      3 4 5 6
       4 5 6
        5 6
         6
        5 6
       4 5 6
      3 4 5 6
     2 3 4 5 6
    1 2 3 4 5 6
 */
