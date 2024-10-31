import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ordre {

    public Ordre() {}


    private int ordreNr;
    private LocalDateTime bestillingsTid;
    private LocalDate bestillingsDato;
    private Pizza pizzaObject;
    private boolean paid;



    public Ordre(int oNummer, LocalDateTime bTid, LocalDate bDato, Pizza pObject)
    {
        this.ordreNr = oNummer;
        this.bestillingsTid = bTid;
        this.bestillingsDato = bDato;
        this.pizzaObject = pObject;
        this.paid = false;
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

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");

        return "ORDRE:\n" +
                " - Ordre Nr: " + ordreNr + "\n" +
                " - Bestillings Tidspunkt: " + bestillingsTid.format(timeFormatter) + "\n" +
                " - Bestillings Dato: " + bestillingsDato.format(dateFormatter) + "\n" +
                " - Pizza: " + pizzaObject + "\n";

    }
}