package practicTask;

import java.util.Scanner;

/**
 * Created by prots on 11.05.2017.
 */
public class String2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name =   scan.nextLine(),
                        surname = scan.nextLine(),
                        patronymic = scan.nextLine();
        scan.close();

        StringBuffer initial1 = new StringBuffer(name.toUpperCase());
        StringBuffer initial2 = new StringBuffer(patronymic.toUpperCase());

        System.out.println(surname+" "+initial1.delete(1,initial1.length())+". "+initial2.delete(1,initial2.length())+".");
        System.out.println(name);
        System.out.println(name+" "+patronymic+" "+surname);
    }
}