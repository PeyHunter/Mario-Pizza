import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Bestillingsliste {

    public Bestillingsliste()
    {}


    private ArrayList<Ordre> ordreList = new ArrayList<>();
    private int currentOrderNr = 1;



    public void addOrdreToList(Ordre ordre) {
        ordreList.add(ordre);
        currentOrderNr++;
        writeBestillingsliste();
    }

        public void printBestillingsListe() {
            for (int i = 0; i < ordreList.size(); i++)
            {
                Ordre ordre = ordreList.get(i);
                System.out.println(ordre);
            }
        }

        public int getCurrentOrderNr() {
        return currentOrderNr;
        }


    public void removeOrdreByNumber(int ordreNumber) {
        ordreList.removeIf(o -> o.getOrdreNr() == ordreNumber);
        writeBestillingsliste(); // Update the file after removal
    }



   public void writeBestillingsliste()
    {
        File bestillingsListe = new File("/Users/peytonhunter/Library/CloudStorage/OneDrive-Personal/Documents/Datamatiker/1 Semester/Programmering/InteliJ/Mario Pizza/src/bestillingsListe.txt" );

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");

        try (FileWriter writer = new FileWriter(bestillingsListe, false)) {
            for (int i = 0; i < ordreList.size(); i++) {
                Ordre o = ordreList.get(i);
                Pizza pizza = o.getPizzaObject(); // Get

                writer.append(String.format("ORDRE:\n" +
                                " - ordre Number: %d\n" +
                                " - bestillings Tid: %s\n" +
                                " - bestillings Dato: %s\n" +
                                " - Pizza: %s, Price: %d, Nr: %d\n",
                        o.getOrdreNr(),
                        o.getBestillingsTid().format(timeFormatter),
                        o.bestillingsDato().format(dateFormatter),
                        pizza.getPizzaName(),
                        pizza.getPizzaPrice(),
                        pizza.getPizzaNumber()));
                writer.append(System.lineSeparator());


                System.out.println(o.getPizzaObject() + ", " + o.getBestillingsTid() + ", " + o.getOrdreNr());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




//        public void removePaidOrders ()
//        {
//            ordreList.removeIf(Ordre::isPaid);
//        }

