package org.example.JPA.itemOrder;

import org.example.JPA.client.Client;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class ItemOrderDao {
    private EntityManager manager;
    public ItemOrderDao(EntityManager manager){
        this.manager = manager;
    }
    public void register(ItemOrder order){
        order = manager.merge(order);
        this.manager.persist(order);

    }
    public void update(){

    }
    public void delete(){

    }
    public List<ItemOrder> list(){
         List<ItemOrder> itemOrders = new ArrayList<>();
         return itemOrders;

    }
}
