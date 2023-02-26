package com.syventa.server.schema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sales_info")
public class SalesInfoSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sales_id")
    private Integer salesId;
    @Column(name = "pay_with")
    private Double payWith;
    private Double total;
    private Double barter;

    //============================--Asociaciones--===========================================//

    @OneToOne
    @JoinColumn(name = "sales_id", insertable = false, updatable = false)
    private SalesSchema sales;
    @OneToMany(mappedBy = "salesInfo")
    private List<SalesCarSchema> shoppingCar;

    //============================--Asociaciones--===========================================//
    public SalesSchema getSales() {
        return sales;
    }

    public void setSales(SalesSchema sales) {
        this.sales = sales;
    }

    public List<SalesCarSchema> getShoppingCar() {
        return shoppingCar;
    }

    public void setShoppingCar(List<SalesCarSchema> shoppingCar) {
        this.shoppingCar = shoppingCar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
