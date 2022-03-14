package entities;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import sun.jvm.hotspot.types.CIntegerType;

import javax.persistence.*;
import java.util.Objects;
/*
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "hobby")
    private String hobby;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City city;


    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public Department getCity() {
        return City;
    }

    public void setCity(City city) {
        this.city= city;
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salery, salery) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hobby);
    }
}
*/