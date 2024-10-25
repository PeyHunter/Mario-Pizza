public class Ordre {

    public Ordre() {}

    private int ordreNr;
    private int bestillingsTid;
    private int bestillingsDato;
    private Pizza pizzaObject;

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
