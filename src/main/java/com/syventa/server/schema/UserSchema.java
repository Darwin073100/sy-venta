package com.syventa.server.schema;

import jakarta.persistence.*;

@Entity
@Table(name = "user", schema="public")
public class UserSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "worker_id")
    private Integer workerId;
    private String password;
    @Column(name = "user_name")
    private String userName;
    private String recover;

    @OneToOne()
    @JoinColumn(name = "worker_id", insertable = false, updatable = false)
    private WorkerSchema worker;

    public WorkerSchema getWorker() {
        return worker;
    }

    public void setWorker(WorkerSchema worker) {
        this.worker = worker;
    }

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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRecover() {
        return recover;
    }

    public void setRecover(String recover) {
        this.recover = recover;
    }
}
