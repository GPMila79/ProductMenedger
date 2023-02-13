package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {


    @Test
    public void testSearch1() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 150, "Nikolai Gogol");

        productManager.save(book1);
        productManager.save(book2);
        productManager.save(book3);
        Product[] actual = productManager.searchBy("Margarita");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testSearch2() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Dead Souls", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 150, "Nikolai Gogol");

        productManager.save(book1);
        productManager.save(book2);
        productManager.save(book3);
        Product[] actual = productManager.searchBy("Dead Souls");
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testSearch3() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "Dead Souls", 150, "Nikolai Gogol");
        Book book2 = new Book(2, "Dead Souls", 550, "Nikolai Gogol");
        Book book3 = new Book(3, "Dead Souls", 150, "Nikolai Gogol");

        productManager.save(book1);
        productManager.save(book2);
        productManager.save(book3);
        Product[] actual = productManager.searchBy("Dead Souls");
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAdd5() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 150, "Nikolai Gogol");

        productManager.save(book1);
        productManager.save(book2);
        productManager.save(book3);
        Product[] actual = productManager.searchBy("Dog");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAdd1() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 150, "Nikolai Gogol");

        productManager.save(book1);
        productManager.save(book2);
        productManager.save(book3);
        Product[] actual = productRepository.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testAdd6() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 150, "Nikolai Gogol");


        Product[] actual = productRepository.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearch() {
        ProductRepository productRepository = new ProductRepository();
        ProductManager productManager = new ProductManager(productRepository);

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productManager.save(book1);
        productManager.save(book2);
        productManager.save(book3);
        Product[] actual = productManager.searchBy("Cat");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}