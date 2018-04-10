package shop;

public class Kunde
{
    private String name;
    private Warenkorb wkorb = new Warenkorb();

    public Kunde(String name)
    {
        this.name = name;
    }

    public Warenkorb getWkorb()
    {
        return wkorb;
    }

    public String getName()
    {
        return name;
    }

    public void kauft(Artikel a)
    {
        wkorb.add(a);
    }

    public double bezahlt()
    {
        double sum = wkorb.getSumme();

        if(sum >= 0.01 && sum <= 9.99)
        {
            sum += 6;
        }
        else if (sum >= 10 && sum <= 29.99)
        {
            sum += 4;
        }
        else if (sum >= 30 && sum <= 99.99)
        {
            sum += (sum * 0.03);
        }

        sum = Math.round(sum* (double) 100) / (double)100;

        return sum;
    }
}
