package fr.eni.ecole.tinos.bo;

public class Apprentice {
    private String name;
    private Fridge fridge;

    public Apprentice(
        String name
    ) {
        this.setName(name);
        this.setFridge(new Fridge());
    }

    public Ingredient bring(
        String ingredientName
    ) {
        return this.fridge.take(ingredientName);
    }

    public String getName() { return name; }
    private void setName(String name) { this.name = name; }
    private Fridge getFridge() { return fridge; }
    private void setFridge(Fridge fridge) { this.fridge = fridge; }
}
