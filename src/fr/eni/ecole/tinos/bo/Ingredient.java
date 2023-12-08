package fr.eni.ecole.tinos.bo;

public class Ingredient {
    private String name;

    public Ingredient(
        String name
    ) {
        super();
        this.setName(name);
    }

    @Override
    public boolean equals(
        Object obj
    ) {
        if (this == obj)
            return true;
        if (!(obj instanceof Ingredient))
            return false;

        Ingredient other = (Ingredient) obj;

        if (this.name == null) {
            if (other.getName() != null)
                return false;
        } else if (!this.name.equals(other.getName()))
            return false;
        return true;
    }

    public String getName() { return name; }
    private void setName(String name) { this.name = name; }
}
