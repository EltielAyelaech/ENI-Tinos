package fr.eni.ecole.tinos;

import fr.eni.ecole.tinos.bo.Pizzaiolo;

public class Tinos {
    public static void main(String[] args) {
        System.out.println("An hawaian for table twelve!");
        Pizzaiolo cook = new Pizzaiolo("Gina");

        try {
            cook.preparePizza("Hawaian");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("An ingredient is missing");
        }
        System.out.println("Done!");
    }
}
