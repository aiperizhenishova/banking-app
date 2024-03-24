package com.example.bankingapp.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Consultant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public Consultant setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Consultant setName(String name) {
        this.name = name;
        return this;
    }

    public List<Client> getClients() {
        return clients;
    }

    public Consultant setClients(List<Client> clients) {
        this.clients = clients;
        return this;
    }

    @OneToMany(mappedBy = "consultant")
    private List<Client> clients;

}
