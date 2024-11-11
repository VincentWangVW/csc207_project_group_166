package entity;

public interface Ingredient {
    /**
     * Returns the name of the ingredient.
     * @return the name of the ingredient.
     */
    String getName();

    /**
     * Returns the amount of the ingredient.
     * @return the amount of the ingredient.
     */
    int getAmount();

    /**
     * Returns the unit of the ingredient.
     * @return the unit of the ingredient.
     */
    String getUnit();
}
