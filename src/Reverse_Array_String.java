import java.util.Scanner;

public class Reverse_Array_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings you want to give: ");
        int length = scanner.nextInt();

        String[] str = new String[length];

        for(int i = 0; i < length; i++){
            System.out.println("Enter " + (i+1) + " string");
            str[i] = scanner.next();
        }

        String[] newStr = new String[length];

        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = s.length() - 1; j >= 0; j--) {
                stringBuilder.append(s.charAt(j));
            }
            newStr[i] = stringBuilder.toString();
        }

        for(String ele: newStr){
            System.out.println("Element: " + ele + " ");
        }

    }
}
