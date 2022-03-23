package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "city_details")
@NamedQuery(name = "CityDetails.deleteAllRows", query = "DELETE from CityDetails")
public class CityDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "zip_code")
    private int zipCode;

    @Column(name = "city")
    private String city;


    @OneToMany (mappedBy = "cityDetails")
        private Set<Address> addresses = new HashSet<>();


    public CityDetails() {
    }

    public CityDetails(int zipCode, String city) {
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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
        if(address.getCityDetails() != this){
            address.addCityDetails(this);
        }
    }

        @Override
    public String toString() {
        return "CityDetails{" +
                "id=" + id +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                '}';
    }
}