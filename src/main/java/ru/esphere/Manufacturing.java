package ru.esphere;

public class Manufacturing {

    public static void main(String[] args) {
        Confectionery product = new Confectionery(180, 90, "Waffle");
        /*
        Confectionery List: Cake, Pie, Waffle, Donut, Cupcake, Cookie, Brownie ...
        */
        product.bake();
    }
}