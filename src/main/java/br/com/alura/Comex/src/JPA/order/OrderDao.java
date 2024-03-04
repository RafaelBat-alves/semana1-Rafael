package org.example.JPA.order;

import org.example.JPA.itemOrder.ItemOrder;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    private EntityManager manager;
    public OrderDao(EntityManager manager){
        this.manager = manager;
    }
    public void register(Order order){
        order = manager.merge(order);
        this.manager.persist(order);

    }
   public Order searchid(BigInteger id){
        return manager.find(Order.class,id);

   }
    public List<Order> list(){
        String jpql = "SELECT o FROM Order o";
         List<Order> Orders = manager.createQuery(jpql,Order.class).getResultList();
         return Orders;

    }
}
