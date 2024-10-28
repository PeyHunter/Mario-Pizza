import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ordre {

    public Ordre() {}


    private int ordreNr;
    private LocalDateTime bestillingsTid;
    private LocalDate bestillingsDato;
    private Pizza pizzaObject;
    private int antal;


    private Random random = new Random();



  //  private Menukort menukort = new Menukort();

  // private ArrayList<Menukort> pizzaArrayList = Menukort.getPizzaArrayList();




    public Ordre(int oNummer, LocalDateTime bTid, LocalDate bDato, Pizza pObject)
    {
        ordreNr = oNummer;
        bestillingsTid = bTid;
        bestillingsDato = bDato;
        pizzaObject = pObject;
    }

    public int getOrdreNr(){
        return ordreNr;
    }

    public LocalDateTime getBestillingsTid() {
        return bestillingsTid;
    }
    public LocalDate bestillingsDato(){
        return bestillingsDato;
    }

    public Pizza getPizzaObject() {
        return pizzaObject;
    }



    @Override
    public String toString() {
        return "Ordre{" +
                "ordreNr=" + ordreNr +
                ", bestillingsTid=" + bestillingsTid +
                ", bestillingsDato=" + bestillingsDato +
                ", pizzaObject=" + pizzaObject +
                ", antal=" + antal +
                ", random=" + random +
                '}';
    }
}




//private static String [] fornavn = {"Peyton","Sumaya", "Line", "Isabella", "Nauer", "Ole", "Henrik","Adam", "Ib", "Bo", };
//private static String [] efternavn = {"Jones","Albrektsen", "Steffensen", "Hendel", "Andersen", "Badreldin","Vestergaard", "Hunter", "Green", "Simonsen"};
