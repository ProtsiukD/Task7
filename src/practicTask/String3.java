package practicTask;

import java.util.Scanner;

/**
 * Created by prots on 14.05.2017.
 */
public class String3 {
    public static String checkLanguage(String name)throws Exception {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (name.length() >= 3 && name.length() <= 15) {
            for (int i = 0; i < alphabet.length; i++) {
                for (int j = 0; j <= name.length(); j++) {
                    if (alphabet[i] == name[j]) {
                        throw new Exception("name not English");
                    }
                }
            }
        }
        return "all is good";
    }
    public static void main(String[] args) {
        char[] name = new char[10];
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println(checkLanguage(name));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}