import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Main nonStaticMain = new Main();
        nonStaticMain.run();
    }

    private void run()
    {
        Menukort menukortInstans = new Menukort(); // instans
        menukortInstans.createMenuKort();
        menukortInstans.writePizzaMenuToFile();
        System.out.println("her");
        System.out.println(menukortInstans.getRandomPizza());

        menukortInstans.createMenuKort();
       // System.out.println(menukortInstans.getPizzaArrayList());

        for(int i = 0; i < menukortInstans.getPizzaArrayList().size(); i++)
        {
            System.out.println(menukortInstans.getPizzaArrayList().get(i));
        }

        System.out.println("type the number you want");
        int number = scanner.nextInt();
        scanner.nextLine();







       /* Pizza pizza = new Pizza("Pepperoni", 60, 1);

        Ordre ordre = new Ordre(1, LocalDateTime.now(), LocalDate.now(), pizza, 2);

        Bestillingsliste bestillingsliste = new Bestillingsliste();
        bestillingsliste.addOrdreToList(ordre);*/



    }
}
