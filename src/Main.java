//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
    }



}
