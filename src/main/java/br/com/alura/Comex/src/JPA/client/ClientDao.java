package org.example.JPA.client;

import org.example.JPA.category.Category;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    private EntityManager manager;
    public ClientDao(EntityManager manager){
        this.manager = manager;
    }
    public void register(Client client){
        client = manager.merge(client);
        this.manager.persist(client);

    }
    public void update(Client client, BigInteger id, String name){
        client = this.manager.merge(client);
        client = this.manager.find(Client.class,id);
        client.setName(name);

    }
    public void delete(Client client, BigInteger id){
        client = manager.merge(client);
        client = manager.find(Client.class,id);
        manager.remove(client);

    }
    public List<Client> list(){
        String jpql = "SELECT c FROM Client c";
        List<Client> clients = this.manager.createQuery(jpql,Client.class).getResultList();
        return clients;
    }
    public List<String> listName(){
        String jpql = "SELECT c.name FROM Client c";
        List<String> clients = this.manager.createQuery(jpql,String.class).getResultList();
        return clients;

    }
    public Client searceId(BigInteger id){
     return manager.find(Client.class,id);

    }
}
