package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NamedQuery(name = "City.deleteAllRows", query = "DELETE from City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "zip_code")
    private int zipCode;

    @Column(name = "city")
    private String city;

    public City() {
    }

    public City(int zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

        @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                '}';
    }
}