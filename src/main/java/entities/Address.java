package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "address")
@NamedQuery(name = "Address.deleteAllRows", query = "DELETE from Address ")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "street")
    private String street;
    @Column(name = "misc")
    private String misc;
        public Address() {
    }

    public Address(String street, String misc) {
        this.street = street;
        this.misc = misc;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}