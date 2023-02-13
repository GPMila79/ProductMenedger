package ru.netology;
import ru.netology.Product;

public class ProductRepository {
    Product[] products = new Product[0];

    public Product[] findAll() {
        return products;
    }

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeById(int removedId) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != removedId) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }

    public Product[] getItems() {
        return products;
    }
}
