package org.example.JPA;

import org.example.JPA.category.Category;
import org.example.JPA.category.CategoryDao;
import org.example.JPA.client.Client;
import org.example.JPA.client.ClientDao;
import org.example.JPA.itemOrder.ItemOrder;
import org.example.JPA.order.Order;
import org.example.JPA.product.Product;
import org.example.JPA.product.ProductDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Category category = new Category("INFORMATICA");
        System.out.println(category);
        Product product = new Product("TELEFONE", BigDecimal.ZERO,BigInteger.ONE);
        System.out.println(product);
        Client client = new Client("ARMENIO");
        System.out.println(client);
        ItemOrder Iorder = new ItemOrder(BigInteger.ONE,BigInteger.ONE,BigDecimal.ZERO,10);


        Order order = new Order(LocalDateTime.now(),BigInteger.ONE);
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("comex");
        EntityManager manager = managerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(category);
        CategoryDao dao = new CategoryDao(manager);
        ClientDao daoClient = new ClientDao(manager);
        ProductDao productDao = new ProductDao(manager);
        System.out.println(productDao.list());
        manager.getTransaction().commit();
        manager.close();
    }
}
