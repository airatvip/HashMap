import java.util.Objects;
import java.util.*;

public class Recipe<T extends Product> {

    private String nameRecipe;
    private Map<Product, Double> recipe = new HashMap<>();
    private double totalCost;

    public Recipe(String nameRecipe, Map<Product, Double> recipe) {
        this.nameRecipe = nameRecipe;
        this.recipe = recipe;
        this.totalCost = calcTotalCost();
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Map<Product, Double> getRecipe() {
        return recipe;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double calcTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<Product, Double> recipe1 : recipe.entrySet()) {


            totalCost = totalCost + recipe1.getKey().getPrice() * recipe1.getValue();
        }
        return totalCost;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe<?> recipe1 = (Recipe<?>) o;
        return Objects.equals(nameRecipe, recipe1.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

    @Override
    public String toString() {
        return "Рецепт: " + "\n" +
                "Название рецепта - " + nameRecipe + "\n" +
                "Продукты - " + recipe + "\n" +
                "Полная стоимость - " + calcTotalCost();
    }
}

