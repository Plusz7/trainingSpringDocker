package com.example.demo.data.entity;


import javax.persistence.*;

@Entity
@Table(name="CONTACTS")
public class Contacts {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CUSTOMER")
    private Customers customer;

    @Column(name = "TYPE")
    private int type;

    @Column(name = "CONTACT")
    private String contact;

    public Contacts(long id, Customers customer, int type, String contact) {
        this.id = id;
        this.customer = customer;
        this.type = type;
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
