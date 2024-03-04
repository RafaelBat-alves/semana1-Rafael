package org.example.JPA.order;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name ="pedido")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column(name = "data")
    private LocalDateTime date;
    @Column(name = "cliente_id")
    private BigInteger client_id;
    public Order(){

    }
    public Order(LocalDateTime date,BigInteger client_id){
        this.date =date;
        this.client_id = client_id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigInteger getClient_id() {
        return client_id;
    }

    public void setClient_id(BigInteger client_id) {
        this.client_id = client_id;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", client_id=" + client_id +
                '}';
    }


}
