import java.util.Scanner;

public class Reverse_Array_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking the number of string user wants to give
        System.out.println("Enter the number of strings you want to give: ");
        int length = scanner.nextInt();

        // Creating new array to store user given string
        String[] str = new String[length];

        // Storing string given by user
        for(int i = 0; i < length; i++){
            System.out.println("Enter " + (i+1) + " string");
            str[i] = scanner.next();
        }

        // Creating new array to store reversed string
        String[] newStr = new String[length];

        // Reversing string and storing into new array
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = s.length() - 1; j >= 0; j--) {
                stringBuilder.append(s.charAt(j));
            }
            newStr[i] = stringBuilder.toString();
        }

        // Printing new array containing reversed string
        for(String ele: newStr){
            System.out.println("Element: " + ele + " ");
        }

    }
}
