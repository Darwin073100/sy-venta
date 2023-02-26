package com.syventa.server.schema;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
public class SalesSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "worker_id")
    private Integer workerId;
    @Column(name = "client_id")
    private Integer clientId;
    private Double total;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    //============================--Asociaciones--===========================================//
    @OneToOne(mappedBy = "sales")
    private SalesInfoSchema salesInfo;
    @OneToOne
    @JoinColumn(name = "worker_id", insertable = false, updatable = false)
    private WorkerSchema worker;
    @OneToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private ClientSchema client;
    // get-set

    public SalesInfoSchema getSalesInfo() {
        return salesInfo;
    }

    public void setSalesInfo(SalesInfoSchema salesInfo) {
        this.salesInfo = salesInfo;
    }

    public WorkerSchema getWorker() {
        return worker;
    }

    public void setWorker(WorkerSchema worker) {
        this.worker = worker;
    }

    public ClientSchema getClient() {
        return client;
    }

    public void setClient(ClientSchema client) {
        this.client = client;
    }

    //---END-GET-SET
    //============================--END--===========================================//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
