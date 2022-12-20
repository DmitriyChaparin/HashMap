package Product;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Product> bag = new HashSet<>();

        Product banana = new Product("Бананы", 79, 2);
        Product apple = new Product("Яблоки", 55, 2);
        Product tomato = new Product("Томаты", 123.5, 2);
        Product potato = new Product("Картошка", 19.8, 2);


        Recipe cake = new Recipe("Пирог");

        cake.addProductToList(banana);
        cake.addProductToList(banana);
        cake.addProductToList(potato);
        cake.addProductToList(tomato);
        System.out.println(cake.getTotalCostProducts());
        System.out.println(cake);
    }

}

