import java.util.Random;
import java.util.ArrayList;

public class Ordre {

    public Ordre() {}

    private int ordreNr = 0;
    private int bestillingsTid;
    private int bestillingsDato;
    private Pizza pizzaObject;
    private int antal;
    private Random random = new Random();

  //  private Menukort menukort = new Menukort();

  //  private ArrayList<Pizza> pizzaArrayList = menukort.getPizzaArrayList();

    private static String [] fornavn = {"Peyton","Sumaya", "Line", "Isabella", "Nauer", "Ole", "Henrik","Adam", "Ib", "Bo", };
    private static String [] efternavn = {"Jones","Albrektsen", "Steffensen", "Hendel", "Andersen", "Badreldin","Vestergaard", "Hunter", "Green", "Simonsen"};


    public Ordre(int oNummer, int bTid, int bDato, Pizza pObject)
    {
        ordreNr = oNummer;
        bestillingsTid = bTid;
        bestillingsDato = bDato;
        pizzaObject = pObject;
    }

    public int getOrdreNr(){
        return ordreNr;
    }

    public int getBestillingsbestillingsTid() {
        return bestillingsDato;
    }
    public int bestillingsDato(){
        return bestillingsDato;
    }

    public Pizza getPizzaObject() {
        return pizzaObject;
    }







}
