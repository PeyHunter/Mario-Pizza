    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.time.format.DateTimeFormatter;

    // PRECONDITION: ITEMS ARE ONLY REMOVED FOR WHEN PAID FOR

    public class Bestillingsliste {

        public Bestillingsliste()
        {}


        private ArrayList<Ordre> bestillingsListeArray = new ArrayList<>();
        private ArrayList<Ordre> ordreHistorikArray = new ArrayList<>();
        private int currentOrderNr = 1;


        public void addOrdreToList(Ordre ordre) {
            bestillingsListeArray.add(ordre);
            currentOrderNr++;
            writeBestillingsliste();
        }

            public void printBestillingsListe() {
                for (int i = 0; i < bestillingsListeArray.size(); i++)
                {
                    Ordre ordre = bestillingsListeArray.get(i);
                    System.out.println(ordre);
                }
            }

            public int getCurrentOrderNr() {
            return currentOrderNr;
            }

        public void removeOrdreByNumber(int ordreNumber) {
            for (int i = 0; i < bestillingsListeArray.size(); i++) {
                Ordre o = bestillingsListeArray.get(i);
                if (o.getOrdreNr() == ordreNumber) {
                    ordreHistorikArray.add(o);
                    bestillingsListeArray.remove(i);
                    writeBestillingsliste(); // Updater fil
                    writeRemovedOrdersToFile();
                    break; // Exit loop
                }
            }
        }



       public void writeBestillingsliste()
        {
            File bestillingsListe = new File("/Users/peytonhunter/Library/CloudStorage/OneDrive-Personal/Documents/Datamatiker/1 Semester/Programmering/InteliJ/Mario Pizza/src/bestillingsListe.txt" );

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");

            try (FileWriter writer = new FileWriter(bestillingsListe, false)) {
                if (bestillingsListe.length() == 0) {
                    writer.write("ACTIVE ORDERS / BESTILLINGSLISTE \n\n");
                }
                for (int i = 0; i < this.bestillingsListeArray.size(); i++) {
                    Ordre o = this.bestillingsListeArray.get(i);
                    Pizza pizza = o.getPizzaObject(); // Get

                    //UDSKRIVER TEKSTEN PÅ EN BESTEMT MÅDE. LINJERNE PASSER SAMMEN.



                    writer.append(String.format(
                                    "ORDRE:\n" +
                                    " - Ordre Number: %d\n" +
                                    " - Bestillings Tid: %s\n" +
                                    " - Bestillings Dato: %s\n" +

                                    " - Pizza: %s, Price: %d, Nr: %d\n",

                            o.getOrdreNr(),
                            o.getBestillingsTid().format(timeFormatter),
                            o.bestillingsDato().format(dateFormatter),

                            pizza.getPizzaName(), pizza.getPizzaPrice(), pizza.getPizzaNumber()));

                    writer.append(System.lineSeparator());

                    //System.out.println(o.getPizzaObject() + ", " + o.getBestillingsTid() + ", " + o.getOrdreNr());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //WRITE AND UPDATE ORDRERHISTORIK:




        public void writeRemovedOrdersToFile()
        {
            File ordrerHistorik = new File("/Users/peytonhunter/Library/CloudStorage/OneDrive-Personal/Documents/Datamatiker/1 Semester/Programmering/InteliJ/Mario Pizza/src/ordrerHistorik.txt" );

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
            int totalPrice = 0;

            try (FileWriter writer = new FileWriter(ordrerHistorik, false)) {
                if (ordrerHistorik.length() == 0) {
                    writer.write("FINISHED / PAID FOR ORDERS  \n\n");
                }
                for (int i = 0; i < this.ordreHistorikArray.size(); i++) {
                    Ordre o = this.ordreHistorikArray.get(i);
                    Pizza pizza = o.getPizzaObject(); // Get


                    //Udskriver tekst:

                    writer.append(String.format("ORDRE:\n" +
                                    " - Ordre Number: %d\n" +
                                    " - Bestillings Tid: %s\n" +
                                    " - Bestillings Dato: %s\n" +

                                    " - Pizza: %s, Price: %d, Nr: %d\n",

                            o.getOrdreNr(),
                            o.getBestillingsTid().format(timeFormatter),
                            o.bestillingsDato().format(dateFormatter),

                            pizza.getPizzaName(), pizza.getPizzaPrice(), pizza.getPizzaNumber()));

                    writer.append(System.lineSeparator());

                    totalPrice += pizza.getPizzaPrice();
                }

                writer.append("TOTAL INCOME FOR TODAY:\n");
                writer.append(String.format("%d DKK\n", totalPrice));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void addRemovedOrdersToFile()
        {
            for(int i = 0; i < ordreHistorikArray.size(); i++)
            {
                Ordre ordre = ordreHistorikArray.get(i);
                System.out.println(ordre);
            }
        }
    }

