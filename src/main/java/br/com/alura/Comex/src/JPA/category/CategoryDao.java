package org.example.JPA.category;

import net.bytebuddy.asm.Advice;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class CategoryDao {
    private EntityManager manager;
    public CategoryDao(EntityManager manager){
        this.manager = manager;
    }
    public void register(Category category){
        category = manager.merge(category);
        this.manager.persist(category);


    }
    public void update(Category category, BigInteger id){
        category = manager.merge(category);
        category = manager.find(Category.class, id);
        category.setName("INFOR");

    }
    public void delete(Category category, BigInteger id){
        category = manager.merge(category);
        category = manager.find(Category.class,id);
        manager.remove(category);

    }
    public List<Category> list(){
         String jpql = "SELECT c FROM Category c";
         List<Category> categoryList = this.manager.createQuery(jpql,Category.class).getResultList();
         return categoryList;
    }
}
