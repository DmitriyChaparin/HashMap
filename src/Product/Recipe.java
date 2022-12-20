package Product;

import java.util.*;

public class Recipe {

    private Map<Product, Integer> products = new HashMap<>();
    private String recipeName;


    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public double getTotalCostProducts() {
        double totalCostProduct = 0.0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            totalCostProduct += product.getKey().getCost() * product.getValue();
        }
        return totalCostProduct;
    }

    public void addProductToList(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            Integer productCont = this.products.get(product);
            this.products.put(product, ++productCont);
        } else {
            this.products.put(product, 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(products, recipe.products) && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, recipeName);
    }

    @Override
    public String toString() {
        return recipeName + "  " + products;

    }
}





