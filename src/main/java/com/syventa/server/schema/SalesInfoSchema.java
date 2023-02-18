package com.syventa.server.schema;

import jakarta.persistence.*;

@Entity
@Table(name = "sales_info")
public class SalesInfoSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "sales_id")
    private Integer salesId;
    @Column(name = "pay_with")
    private Double payWith;
    private Double total;
    private Double barter;

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

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Double getPayWith() {
        return payWith;
    }

    public void setPayWith(Double payWith) {
        this.payWith = payWith;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getBarter() {
        return barter;
    }

    public void setBarter(Double barter) {
        this.barter = barter;
    }
}
