package zadanie3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String stroka = scanner.nextLine();
            RabotaSoSlovami ob = new RabotaSoSlovami(stroka);
            ob.zapolnitGlasnie();
            ob.zaglavnie();
            ob.sort();
            ob.vivod();
    }
}
