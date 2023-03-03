package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    @Test
    public void testAdd1() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);
        Product[] actual = productRepository.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book1);

        Product[] actual = productRepository.findAll();
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd3() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book2);


        Product[] actual = productRepository.findAll();
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenIdExisted() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);
        productRepository.removeById(1);

        Product[] actual = productRepository.findAll();
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenIdNotExisted() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);

        Assertions.assertThrows(NotFoundException.class,
                () -> productRepository.removeById(5)
                );
    }

    @Test
    public void testRemoveWhenIdExisted1() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);
        productRepository.removeById(1);
        productRepository.removeById(3);

        Product[] actual = productRepository.findAll();
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddBooks() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");
        Book book4 = new Book(4, "X", 830, "XXX");

        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);
        productRepository.save(book4);


        Product[] actual = productRepository.findAll();
        Product[] expected = {book1, book2, book3, book4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddBooks7() {
        ProductRepository productRepository = new ProductRepository();


        Product[] actual = productRepository.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddBooks6() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "", 0, "");
        Book book2 = new Book(2, "", 0, "");
        Book book3 = new Book(3, "", 0, "");


        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);

        Product[] actual = productRepository.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddBooks1() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");
        Book book4 = new Book(4, "X", 830, "XXX");


        Product[] actual = productRepository.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddBooks4() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");
        Book book4 = new Book(4, "X", 830, "XXX");


        productRepository.save(book4);


        Product[] actual = productRepository.findAll();
        Product[] expected = {book4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenIdExisted2() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "The Master and Margarita", 150, "Mikhail Bulgakov");
        Book book2 = new Book(2, "Heart of a Dog", 550, "Mikhail Bulgakov");
        Book book3 = new Book(3, "Dead Souls", 330, "Nikolai Gogol");

        productRepository.save(book1);
        productRepository.save(book2);
        productRepository.save(book3);
        productRepository.removeById(1);
        productRepository.removeById(2);
        productRepository.removeById(3);

        Product[] actual = productRepository.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}
