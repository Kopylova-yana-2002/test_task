package zadanie5;

public class Predmet {
    private int ves;
    private int cena;
    private String name;

    public Predmet(int weight, int price, String name){
        this.ves = weight;
        this.cena = price;
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    public int getCena() {
        return cena;
    }

    public String getName() {
        return name;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setName(String name) {
        this.name = name;
    }
}
