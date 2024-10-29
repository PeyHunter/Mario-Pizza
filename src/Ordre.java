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
    private int antal = 123445;
    private boolean paid;

    private Random random = new Random();



    public Ordre(int oNummer, LocalDateTime bTid, LocalDate bDato, Pizza pObject)
    {
        this.ordreNr = oNummer;
        this.bestillingsTid = bTid;
        this.bestillingsDato = bDato;
        this.pizzaObject = pObject;
        this.paid = false;
    }

    public void markAsPaid() {
        this.paid = true;
    }

    public boolean isPaid() {
        return this.paid;
    }


    public int getAntal()
    {
        return this.antal;
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
        return "ORDRE:\n" +
                " - Ordre Nr: " + ordreNr + "\n" +
                " - Bestillings Tidspunkt: " + bestillingsTid + "\n" +
                " - Bestillings Dato: " + bestillingsDato + "\n" +
                " - Pizza: " + pizzaObject + "\n";

    }
}




//private static String [] fornavn = {"Peyton","Sumaya", "Line", "Isabella", "Nauer", "Ole", "Henrik","Adam", "Ib", "Bo", };
//private static String [] efternavn = {"Jones","Albrektsen", "Steffensen", "Hendel", "Andersen", "Badreldin","Vestergaard", "Hunter", "Green", "Simonsen"};
