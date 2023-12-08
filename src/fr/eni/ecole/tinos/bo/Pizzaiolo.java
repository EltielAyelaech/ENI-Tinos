package fr.eni.ecole.tinos.bo;

public class Pizzaiolo {
    private String name;
    private Apprentice apprentice;

    public Pizzaiolo(
        String name
    ) {
        this.setName(name);
        this.setApprentice(new Apprentice("Tommy"));
    }

    public void preparePizza(
        String pizzaName
    ) {
        System.out.println("Asking apprentice for ingredients");

        this.apprentice.bring("Tomato pulp");
        this.apprentice.bring("Ham");
        this.apprentice.bring("Pineapple");
        this.apprentice.bring("Mozzarella");

        System.out.println("Cooking the pizza");
        this.cookPizza();
    }

    public void cookPizza(
    ) {
        System.out.println("The pizza is cooking...");
    }

    public String getName() { return name; }
    private void setName(String name) { this.name = name; }
    public Apprentice getApprentice() { return apprentice; }
    private void setApprentice(Apprentice apprentice) { this.apprentice = apprentice; }
}
