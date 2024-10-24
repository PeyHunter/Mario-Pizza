public class Pizza {

    public Pizza() {}

    private String pizzaName;
    private int pizzaPrice;
    private int pizzaNumber;


   public Pizza(String pName, int pPrice, int pNr) {
    pizzaName = pName;
    pizzaPrice = pPrice;
    pizzaNumber = pNr;
   }

   public String getPizzaName() {
        return pizzaName;
   }

   public int getPizzaPrice() {
        return pizzaPrice;
   }

   public int getPizzaNr() {
        return pizzaNumber;
   }
    @Override
    public String toString() {
        return "Pizza: " + pizzaName + ", Price: " + pizzaPrice + ", Number: " + pizzaNumber;
    }
}
