package Elab01_PasswordValid;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistrationSystem regis = new RegistrationSystem();
        regis.setPasswordValidator(new SimpleValidator());
        System.out.println(regis.register("kwan", "abcd")); // print true
        regis.setPasswordValidator(new DigitValidator());
        System.out.println(regis.register("kwan", "abc1")); // print false
        System.out.println(regis.register("kwan", "abcd11"));
        // print true
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] st = s.split(" ");

        System.out.println(st[1]);
    }

}
