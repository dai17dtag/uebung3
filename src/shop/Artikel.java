package shop;

public class Artikel
{
    private String bezeichnung;
    private double preis;

    public Artikel(String bezeichnung, double preis)
    {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getPreis()
    {
        return preis;
    }
}
