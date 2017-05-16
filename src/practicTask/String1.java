package practicTask;


import java.util.Objects;
import java.util.Scanner;

/**
 * Created by prots on 11.05.2017.
 */
public class String1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        scan.close();

        boolean isRez=false;

        if (str1.length() < str2.length()) {
            for (int i = 0; i < str2.length()-str1.length(); i++) {
                String tmp = str2.substring(i, str1.length() + i);
                if (tmp.equals(str1)) {
                    isRez=true; break;
                }
            }
        }

        System.out.println(isRez);

    }
}
