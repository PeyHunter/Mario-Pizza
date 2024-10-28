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

            System.out.println("Choose a pizza (or type 'exit' to finish)");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if user types 'exit'
            }


            try {
                int pizzaIndex = Integer.parseInt(input) - 1; // Parse the input as an integer

                // Check if the index is valid
                if (pizzaIndex < 0 || pizzaIndex >= menukortInstans.getPizzaMenuList().size()) {
                    System.out.println("Invalid pizza number. Please choose a valid number.");
                    continue; // Skip to the next iteration
                }

                Pizza selectedPizza = menukortInstans.getPizzaMenuList().get(pizzaIndex);

                Ordre ordre = new Ordre(bestillingsliste.getCurrentOrderNr(), LocalDateTime.now(), LocalDate.now(), selectedPizza);
                bestillingsliste.addOrdreToList(ordre);

                // Print the order details after adding the new one
                System.out.println("Order added: " + ordre);



            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid pizza number or 'exit' to finish.");
            }






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
