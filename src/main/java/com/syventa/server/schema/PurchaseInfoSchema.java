package com.syventa.server.schema;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "purchase_info")
public class PurchaseInfoSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "purchase_id")
    private Integer purchaseId;
    private Double total;
    private BigInteger amounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public BigInteger getAmounts() {
        return amounts;
    }

    public void setAmounts(BigInteger amounts) {
        this.amounts = amounts;
    }
}
