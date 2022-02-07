package zadanie1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.next();
        Calculator ob = new Calculator(stroka);
        System.out.println(ob.Sum());
    }
}

