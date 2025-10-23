import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        int part = rows/2;

        for (int i = 1; i <= part+1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

        }


    }
}
//*           *
//*  *     *  *
//*  *  *  *  *
//*  *     *  *
//*           *

//       *
//    *  *
// *  *  *
//    *  *
//       *

//import java.util.Scanner;
//
//public class Pattern16 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of rows: ");
//        int rows = scanner.nextInt();
//
//        // Upper half
//        for (int i = 1; i <= rows; i++) {
//            // Left stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            // Spaces in the middle
//            for (int j = i; j < rows; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < rows; j++) {
//                System.out.print("  ");
//            }
//
//            // Right stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//        // Lower half
//        for (int i = rows; i >= 1; i--) {
//            // Left stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            // Spaces in the middle
//            for (int j = i; j < rows; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < rows; j++) {
//                System.out.print("  ");
//            }
//
//            // Right stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}
