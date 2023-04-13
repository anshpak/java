package action;

import impl.Product;

public interface CatalogAction {
    void addProduct(Product product);
    void removeProduct(Product product);
}
