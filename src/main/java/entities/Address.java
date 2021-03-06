package entities;

import javax.persistence.*;
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
    @Column(name = "additional_info")
    private String additionalInfo;


    @ManyToOne
    @JoinColumn(name = "city_info_id")
    private CityInfo cityInfo;



    @OneToMany(mappedBy = "address")
    private Set<Person> persons = new HashSet<>();


        public Address() {
    }

    public Address(String street, String additionalInfo) {
        this.street = street;
        this.additionalInfo = additionalInfo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getadditionalinfo() {
        return additionalInfo;
    }

    public void setadditionalinfo(String misc) {
        this.additionalInfo = additionalInfo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Set<Person> getPersons() {

            return this.persons;
    }

    public void addPerson(Person person) {
        this.persons.add(person);
        if(person.getAddress() != this){
            person.addAddress(this);
        }
    }

    public void removePerson(Person person) {

            this.persons.remove(person);
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }
    public void addCityInfo (CityInfo cityInfo) {
        this.cityInfo = cityInfo;
        if(!cityInfo.getAddresses().contains(this)){
            cityInfo.addAddress(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ",cityinfo id: " + cityInfo.getId() +
                '}';
    }


}