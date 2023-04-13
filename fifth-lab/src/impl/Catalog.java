package impl;

import action.CatalogAction;
import impl.Product;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements CatalogAction {
    private List<Product> products;

    public Catalog() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void showCatalog() {
        for (Product pr:this.getProducts()
        ) {
            System.out.print(pr);
        }
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
