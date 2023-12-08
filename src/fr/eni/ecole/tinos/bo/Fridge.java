package fr.eni.ecole.tinos.bo;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<Ingredient> ingredients;

    public Fridge(
    ) {
        this.setIngredients(new ArrayList<Ingredient>());

        this.fillWithGroceries();
    }

    private void fillWithGroceries(
    ) {
        this.ingredients.add(new Ingredient("Mozzarella"));
        this.ingredients.add(new Ingredient("Tomato pulp"));
        this.ingredients.add(new Ingredient("Egg"));
        this.ingredients.add(new Ingredient("Ham"));
    }

    public Ingredient take(
        String ingredient
    ) {
        System.out.printf(
            "Taking %s from the fridge\n",
            ingredient
        );

        int ingredientIndex = this.ingredients.indexOf(new Ingredient(ingredient));

        return this.ingredients.get(ingredientIndex);
    }

    private List<Ingredient> getIngredients() { return ingredients; }
    private void setIngredients(List<Ingredient> ingredients) { this.ingredients = ingredients; }
}
