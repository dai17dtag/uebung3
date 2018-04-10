package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        boolean allItemsDeleted;

        try
        {
            if (a != null)
            {
                do
                {
                    allItemsDeleted = true;
                    for (int anzahlCounter = 0; anzahlCounter < artFeld.length; anzahlCounter++)
                    {
                        if (articleIsIdentical(artFeld[anzahlCounter], a))
                        {
                            --anzahl;
                            artFeld[anzahlCounter] = artFeld[anzahl];
                            artFeld[anzahl] = null;
                            allItemsDeleted = false;
                        }
                    }
                } while (!allItemsDeleted);

            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    private boolean articleIsIdentical(Artikel a, Artikel b)
    {
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

        return true;
    }
}
