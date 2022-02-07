package zadanie2;

public class Raskladivatel {
    private int number;
    public Raskladivatel(int number)
    {
        this.number = number;
    }

    public void Razlozhit()
    {
        int delitel = 2;
        System.out.print(number + " = 1");
        while (number>1)
        {
            while(number%delitel==0)
            {
                System.out.print(" * "+delitel);
                number /= delitel;
            }
            delitel++;
        }
    }
}
