package org.example.JPA.itemOrder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "item")
public class ItemOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column(name = "pedido_id")
    private BigInteger order;
    @Column(name = "produto_id")
    private BigInteger product;
    @Column(name = "preco_unitario")
    private BigDecimal coin;
    @Column(name = "quantidade")
    private int amount;
    public ItemOrder(BigInteger order,BigInteger product,BigDecimal coin,int amount){
        this.order = order;
        this.product = product;
        this.coin = coin;
        this.amount = amount;
    }


}
