package zadanie1;

public class Calculator {
    private String stroka;
    public Calculator(String stroka)
    {
        this.stroka=stroka;
    }
    public int Sum()
    {
        int sum = 0;
        for(int i=0; i<stroka.length(); i++)
        {
          if (stroka.charAt(i)>='0' && stroka.charAt(i)<='9')
          {
              sum = sum + Character.getNumericValue(stroka.charAt(i));

          }
        }
        return sum;

    }
}
