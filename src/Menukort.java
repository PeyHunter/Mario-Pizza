import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menukort {

    public Menukort()
    {
    }


    public ArrayList<Pizza> pizzaArrayList = new ArrayList<>();

    public void createMenuKort() {

        pizzaArrayList.add(new Pizza("Margherita", 60, 1));
        pizzaArrayList.add(new Pizza("Pepperoni", 70, 2));
        pizzaArrayList.add(new Pizza("Hawaiian", 75, 3));
        pizzaArrayList.add(new Pizza("BBQ Chicken", 85, 4));
        pizzaArrayList.add(new Pizza("Vegetarian", 65, 5));
        pizzaArrayList.add(new Pizza("Meat Lovers", 90, 6));
        pizzaArrayList.add(new Pizza("Four Cheese", 80, 7));
        pizzaArrayList.add(new Pizza("Buffalo Chicken", 95, 8));
        pizzaArrayList.add(new Pizza("Supreme", 100, 9));
        pizzaArrayList.add(new Pizza("Mexican", 85, 10));
        pizzaArrayList.add(new Pizza("Seafood Special", 110, 11));
        pizzaArrayList.add(new Pizza("Tuna and Sweetcorn", 95, 12));
        pizzaArrayList.add(new Pizza("Spicy Sausage", 80, 13));
        pizzaArrayList.add(new Pizza("Prosciutto and Rocket", 90, 14));
        pizzaArrayList.add(new Pizza("Mushroom and Truffle Oil", 120, 15));
        pizzaArrayList.add(new Pizza("Calzone", 85, 16));
        pizzaArrayList.add(new Pizza("Carbonara Pizza", 90, 17));
        pizzaArrayList.add(new Pizza("Pesto and Chicken", 95, 18));
        pizzaArrayList.add(new Pizza("Gorgonzola and Pear", 110, 19));
        pizzaArrayList.add(new Pizza("Salami and Olive", 80, 20));
        pizzaArrayList.add(new Pizza("Spinach and Ricotta", 70, 21));
        pizzaArrayList.add(new Pizza("Greek Pizza (Feta and Olives)", 75, 22));
        pizzaArrayList.add(new Pizza("Zucchini and Goat Cheese", 85, 23));
        pizzaArrayList.add(new Pizza("Egg and Bacon", 100, 24));
        pizzaArrayList.add(new Pizza("Shrimp and Pesto", 90, 25));
        pizzaArrayList.add(new Pizza("Tandoori Chicken", 110, 26));
        pizzaArrayList.add(new Pizza("Pastrami Pizza", 95, 27));
        pizzaArrayList.add(new Pizza("Bolognese Pizza", 85, 28));
        pizzaArrayList.add(new Pizza("Quattro Stagioni", 105, 29));
        pizzaArrayList.add(new Pizza("Lamb and Mint", 115, 30));

        for(int i = 0; i < pizzaArrayList.size(); i++) {
            System.out.println(pizzaArrayList.get(i));
        }
    }

    public void writePizzaMenuToFile()
    {
        File pizzaFile = new File("/Users/peytonhunter/Library/CloudStorage/OneDrive-Personal/Documents/Datamatiker/1 Semester/Programmering/InteliJ/Mario Pizza/src/pizzaMenu.txt" );
        try (FileWriter writer = new FileWriter(pizzaFile, true)) {
            for (int i = 0; i < pizzaArrayList.size(); i++) {
                Pizza p = pizzaArrayList.get(i);

                String pizzaName = p.getPizzaName();
                int pizzaPrice = p.getPizzaPrice();
                int pizzaNr = p.getPizzaNumber();

                writer.append(pizzaName + ", ");
                writer.append(Integer.toString(pizzaPrice) + ", ");
                writer.append(Integer.toString(pizzaNr) + '\n');

                System.out.println(p.getPizzaName() + ", " + p.getPizzaPrice() + ", " + p.getPizzaNumber());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Pizza> getPizzaArrayList() {
        return pizzaArrayList;
    }

    private Pizza randomPizza() {
        Random random = new Random();
        int randomIndex = random.nextInt(pizzaArrayList.size());
        return pizzaArrayList.get(randomIndex);
    }

    public Pizza getRandomPizza() {
        return randomPizza();
    }
}







