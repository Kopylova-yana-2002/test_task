package zadanie3;

public class RabotaSoSlovami {
    private String[] slova;
    private int[] glasnie;

    public RabotaSoSlovami(String stroka)
    {
        slova=stroka.split(" ");
        glasnie=new int[slova.length];
    }
    public void zapolnitGlasnie()
    {
        for (int i =0; i<slova.length; i++)
        {
            glasnie[i]=countGlasnie(slova[i]);
        }
    }
    public int countGlasnie(String slovo)
    {
        int k=0;
        for (int i = 0; i<slovo.length();i++)
        {
           if ("aeiouAEIOUауеыоэяиюУЕЫАОЭЯИЮ".indexOf(slovo.charAt(i))!=-1)
               k++;
        }
        return k;
    }
    public void sort()
    {
        for (int i=0 ; i<glasnie.length; i++)
        {
            for (int j=0;j<glasnie.length-1-i;j++)
            {
                if(glasnie[j]<glasnie[j+1])
                {
                    String temp1  = slova[j];
                    int temp2 = glasnie[j];
                    slova[j] = slova[j+1];
                    glasnie[j]=glasnie[j+1];
                    slova[j+1]=temp1;
                    glasnie[j+1]=temp2;
                }
            }
        }
    }
    public void zaglavnie()
    {
        for (int i =0 ; i<slova.length; i++)
        {
            for (int j = 0; j<slova[i].length(); j++)
            {
                if ("aeiouAEIOUауеыоэяиюУЕЫАОЭЯИЮ".indexOf(slova[i].charAt(j))!=-1)
                {
                    System.out.println(slova[i].length());
                    System.out.println(j);
                    slova[i] = slova[i].substring(0,j) + slova[i].substring(j,1).toUpperCase() + slova[i].substring(j+1);
                    j=slova[i].length();
                }
            }
        }
    }
    public void vivod()
    {
        for(int i=0; i< slova.length;i++)
        {
            System.out.print(slova[i]+ " ");
        }
    }


}
