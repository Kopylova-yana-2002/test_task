package zadanie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextFloat();
        if(n == (int)n)
        {
            Raskladivatel r = new Raskladivatel((int)n);
            r.Razlozhit();
        }
        else
        {
            System.out.println("Введите целое число");
        }
    }
}
