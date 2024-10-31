import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Main nonStaticMain = new Main();
        nonStaticMain.run();
    }

    private void run()
    {
        //MENUKORTET:

        Menukort menukortInstans = new Menukort(); // instans
        menukortInstans.createMenuKort();
        menukortInstans.writePizzaMenuToFile();

        for (Pizza p : menukortInstans.getPizzaMenuList()) {
            System.out.println("Pizza: " + p.getPizzaName() + ", Price: " + p.getPizzaPrice() + ", Number: " + p.getPizzaNumber());
        }


        //BESTILLINGSLISTE:

        Bestillingsliste bestillingsliste = new Bestillingsliste(); //instans

        while (true) {

            //INPUT ORDRER
            System.out.println("Choose a pizza (or type 'exit' to finish, or 'remove' to remove an order)");
            String input = scanner.nextLine();

            // REMOVE ORDRER

            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if user types 'exit'


            } else if (input.equalsIgnoreCase("remove")) {
                System.out.println("Enter the order number to remove:");
                int ordreToRemove;

                try {
                    ordreToRemove = Integer.parseInt(scanner.nextLine());
                    bestillingsliste.removeOrdreByNumber(ordreToRemove);
                    System.out.println("Order number " + ordreToRemove + " has been removed.");
                } catch (NumberFormatException e)
                {
                    System.out.println("Invalid input! Please enter a valid order number.");
                }
                continue; // Go to the next iteration of the loop
            }


            // VÆLG PIZZA UD FRA PIZZA NR:

            try {
                int pizzaNr = Integer.parseInt(input) - 1; // Parse the input til en integer. - 1 så den passer til arrayList

                // Er pizza Nr valid?

                if (pizzaNr < 0 ||  pizzaNr >= menukortInstans.getPizzaMenuList().size()) {
                    System.out.println("Invalid pizza number. Please choose a valid number.");
                    continue; // KØR VIDERE HVIS VALID
                }

                Pizza selectedPizza = menukortInstans.getPizzaMenuList().get(pizzaNr);

                Ordre ordre = new Ordre(bestillingsliste.getCurrentOrderNr(), LocalDateTime.now(), LocalDate.now(), selectedPizza);
                bestillingsliste.addOrdreToList(ordre);

                // PRINT ny ordre Pizza info

                System.out.println("Order added: " + ordre);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid pizza number or 'exit' to finish.");
            }

            bestillingsliste.addRemovedOrdersToFile();
            bestillingsliste.findPizzaDuplicates();
            menukortInstans.writePizzaMenuToFile();


        }

    }
}