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


        }








  /*      System.out.println("Choose a pizza number:");
        int pizzaIndex = scanner.nextInt();
        scanner.nextLine();

        Pizza selectedPizza = menukortInstans.getPizzaMenuList().get(pizzaIndex);

*/










        //System.out.println(menukortInstans.getRandomPizza());
       // menukortInstans.createMenuKort();
       // System.out.println(menukortInstans.getPizzaArrayList());


      /*  for(int i = 0; i < menukortInstans.getPizzaArrayList().size(); i++)
        {
            System.out.println(menukortInstans.getPizzaArrayList().get(i));
        }




        System.out.println("type the number you want");
        int number = scanner.nextInt();
        scanner.nextLine();

        Pizza selectedPizza = menukortInstans.getPizzaArrayList().get(number);
        Pizza chosenPizza = new Pizza(selectedPizza.getPizzaName(), selectedPizza.getPizzaPrice(), selectedPizza.getPizzaNumber());



        Ordre order = new Ordre(1, LocalDateTime.now(), LocalDate.now(), chosenPizza);



         //    for(int i = 0; i < menukortInstans.getPizzaArrayList().size(); i++)

                 System.out.println(order);


*/



       /* Pizza pizza = new Pizza("Pepperoni", 60, 1);

        Ordre ordre = new Ordre(1, LocalDateTime.now(), LocalDate.now(), pizza, 2);

        Bestillingsliste bestillingsliste = new Bestillingsliste();
        bestillingsliste.addOrdreToList(ordre);*/



    }
}
