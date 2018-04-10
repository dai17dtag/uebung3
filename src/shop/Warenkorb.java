package shop;

public class Warenkorb
{
    private int anzahl = 0;
    private Artikel artFeld[] = new Artikel[100];

    public void add(Artikel a)
    {
        if (anzahl < artFeld.length && a != null)
        {
            artFeld[anzahl] = a;
            anzahl++;
        }
    }

    public double getSumme()
    {
        double sum = 0;

        for (int anzahlCounter = 0; anzahlCounter < anzahl; anzahlCounter++)
        {
            if (artFeld[anzahlCounter] != null)
            {
                sum += artFeld[anzahlCounter].getPreis();
            }
        }

        return sum;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public void remove(Artikel a)
    {
        try
        {
            if (a != null)
            {
                for (int anzahlCounter = 0; anzahlCounter < anzahl; anzahlCounter++)
                {
                    if (articleIsIdentical(artFeld[anzahlCounter], a))
                    {
                        artFeld[anzahlCounter] = artFeld[anzahl];
                        artFeld[anzahl] = null;
                        anzahl--;
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private boolean articleIsIdentical(Artikel a, Artikel b)
    {
        boolean articleIsIdentical = true;

        if (a == null || b == null)
        {
            return false;
        }

        if (a.getBezeichnung() == null || b.getBezeichnung() == null)
        {
            return false;
        }

        if (a.getPreis() != b.getPreis() || a.getBezeichnung() != b.getBezeichnung())
        {
            return false;
        }

        return articleIsIdentical;
    }
}
