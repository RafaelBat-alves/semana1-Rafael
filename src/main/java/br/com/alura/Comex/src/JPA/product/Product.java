package org.example.JPA.product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "produto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column(name = "nome")
    private String name;
    @Column(name = "preco")
    private BigDecimal coin;
    @Column(name = "categoria_id")
    private BigInteger categoriaId;
    public Product(){
    }
    public Product(String name,BigDecimal coin,BigInteger categoriaId){
        this.name = name;
        this.coin = coin;
        this.categoriaId = categoriaId;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCoin() {
        return coin;
    }

    public void setCoin(BigDecimal coin) {
        this.coin = coin;
    }

    public BigInteger getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(BigInteger categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coin=" + coin +
                ", categoriaId=" + categoriaId +
                '}';
    }
}
