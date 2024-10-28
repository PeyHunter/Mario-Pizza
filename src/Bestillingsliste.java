import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bestillingsliste {

    public Bestillingsliste()
    {}

   private ArrayList<Menukort> ordreList = new ArrayList<>();


    //public ArrayList<Pizza> pizzaArrayList = new ArrayList<>();

    /*public void addOrdreToList(Ordre ordre)
    {
        ordreList.add(ordre);
    }*/


   /* public void writeBestillingsliste()
    {
        File bestillingsListe = new File("/Users/peytonhunter/Library/CloudStorage/OneDrive-Personal/Documents/Datamatiker/1 Semester/Programmering/InteliJ/Mario Pizza/src/bestillingsListe.txt" );
        try (FileWriter writer = new FileWriter(bestillingsListe, true)) {
            for (int i = 0; i < ordreList.size(); i++) {
                Ordre o = ordreList.get(i);

                Ordre ordrePizza = o.getPizzaObject();
                int ordreNummer = o.getOrdreNr();
                int bestillingsTid = o.getBestillingsTid();
                int ordrerDato = o.bestillingsDato();

                writer.append(ordrePizza + ", ");
                writer.append(Integer.toString(ordreNummer) + ", ");
                writer.append(Integer.toString(ordrerDato) + ", ");
                writer.append(Integer.toString(bestillingsTid) + '\n');

                System.out.println(o.getPizzaObject() + ", " + o.getBestillingsTid() + ", " + o.getOrdreNr());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


}
