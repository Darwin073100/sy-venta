package com.syventa.server.schema;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "sales_car")
public class SalesCarSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "sales_info_id")
    private Integer salesInfoId;
    private BigInteger quantity;

    @OneToOne
    @JoinColumn(name = "product_id", insertable = false,updatable = false)
    private ProductSchema product;

    @ManyToOne
    @JoinColumn(name = "sales_info_id", insertable = false,updatable = false)
    private SalesInfoSchema salesInfo;

    public ProductSchema getProduct() {
        return product;
    }

    public void setProduct(ProductSchema product) {
        this.product = product;
    }

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

    public Integer getSalesInfoId() {
        return salesInfoId;
    }

    public void setSalesInfoId(Integer salesInfoId) {
        this.salesInfoId = salesInfoId;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

}
