package zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<Predmet> items = new ArrayList<Predmet>();
        Scanner scanner = new Scanner(System.in);
        int num =0;

        System.out.print("Сколько предметов: ");
        num = scanner.nextInt();

        for (int i=0;i<num;i++){
            System.out.print("Размер цена и название предмета: \n");
            items.add( new Predmet(scanner.nextInt(), scanner.nextInt(), scanner.nextLine()));
        }

        System.out.print("Свободный объем внутри сейфа: ");
        ZapolnitelSafe test = new ZapolnitelSafe(scanner.nextInt());

        test.Resheniya(items);

        System.out.print("Заполненный сейф: \n");

        for (Predmet i : test.getNuzhniePredmeti()){
            System.out.println(i.getName() +" "+i.getVes()+" "+i.getCena());
        }
    }
}