package main;

import impl.Catalog;
import impl.Milk;
import impl.Oil;
import impl.Product;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Product chocolate = new Product(17, "Alpen Gold", 17352886, "Stollwerck AG", 4.5F, "13.04.2026",18);
        Milk milk = new Milk(643, "Минская марка", 39044214, "Минский молочный завод № 1", 1.86F, "03.05.2023", 33,  1, 1.5F);
        Oil oil = new Oil(2352, "Золотая семечка", 46019544, "SDJ Юг", 4.5F, "24.05.2024", 124);
        catalog.addProduct(chocolate);
        catalog.addProduct(milk);
        catalog.addProduct(oil);
        catalog.showCatalog();
        catalog.removeProduct(milk);
        System.out.print("\n\n");
        catalog.showCatalog();
        System.out.print("\n\n");
        System.out.print(catalog.getProducts().get(0).getName() + " location: " + catalog.getProducts().get(0).getLocation());
        System.out.print("\n" + catalog.getProducts().get(1).getName() + " location: " + catalog.getProducts().get(1).getLocation());
        System.out.print("\n\n");
        catalog.getProducts().get(0).moveToHall();
        catalog.getProducts().get(1).moveToStorage();
        System.out.print(catalog.getProducts().get(0).getName() + " location: " + catalog.getProducts().get(0).getLocation());
        System.out.print("\n" + catalog.getProducts().get(1).getName() + " location: " + catalog.getProducts().get(1).getLocation());
        System.out.print("\n\n");
    }
}