package zadanie5;

import zadanie5.Predmet;

import java.util.ArrayList;

public class ZapolnitelSafe {

    private ArrayList<Predmet> nuzhniePredmeti = null;
    private int maxVes;
    private int bestCena;

    public ZapolnitelSafe(int maxWeight){
        this.maxVes = maxWeight;
    }

    private int sumVes(ArrayList<Predmet> items){
        int sum =0;
        for (Predmet i : items){
            sum += i.getVes();
        }
        return sum;
    }

    private int sumCena(ArrayList<Predmet> items){
        int sum =0;
        for (Predmet i : items){
            sum += i.getCena();
        }
        return sum;
    }

    private void proverka(ArrayList<Predmet> predmeti){
        if (nuzhniePredmeti == null){
            if (sumVes(predmeti) <= maxVes){
                nuzhniePredmeti = predmeti;
                bestCena = sumCena(predmeti);
            }
        }
        else {
            if (sumVes(predmeti) <= maxVes && sumCena(predmeti) > bestCena){
                nuzhniePredmeti = predmeti;
                bestCena = sumCena(predmeti);
            }
        }
    }

    public void Resheniya(ArrayList<Predmet> predmeti){
        if (predmeti.size() > 0)
            proverka(predmeti);
        for (int i=0;i<predmeti.size();i++){
            ArrayList<Predmet> newSolution = new ArrayList<>(predmeti);
            newSolution.remove(i);
            Resheniya(newSolution);
        }
    }

    public ArrayList<Predmet> getNuzhniePredmeti(){
        return nuzhniePredmeti;
    }
}
