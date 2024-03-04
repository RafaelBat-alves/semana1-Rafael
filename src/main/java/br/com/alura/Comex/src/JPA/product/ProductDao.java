package org.example.JPA.product;

import org.example.JPA.order.Order;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private EntityManager manager;
    public ProductDao(EntityManager manager){
        this.manager = manager;
    }
    public void register(Product product){
        product = manager.merge(product);
        this.manager.persist(product);

    }
    public Product listId(BigInteger id){
      return  this.manager.find(Product.class,id);
    }

    public List<Product> list(){
        String jpql = "SELECT p FROM Product p";
        List<Product> products = manager.createQuery(jpql,Product.class).getResultList();
        return products;

    }
    public List<Product> listAvailable(){
        String jpql = "SELECT p FROM Product p WHERE p.available = 1";
        List<Product> products = manager.createQuery(jpql,Product.class).getResultList();
        return products;
    }
}
