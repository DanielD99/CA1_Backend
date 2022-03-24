/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.*;
import utils.EMF_Creator;



/**
 *
 * @author Alexander and Daniel
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();

        EntityManager em = emf.createEntityManager();
        Facade fe = Facade.getFacadeExample(emf);
        Person person = new Person("test@test.dk","Alexander","Petersen");
        Person person2 = new Person("test2@test.dk","Daniel","Drewsen");
        Person person3 = new Person("test3@test.dk","Jonathan","Mortensen");
        Phone phone1 = new Phone("45459999","DK");
        Phone phone2 = new Phone("46469999","DK");
        Hobby hobby = new Hobby("FootBall","kick ball");
        Hobby hobby2 = new Hobby("VolleyBall","hit ball");
        Address address = new Address("Hestehaven","18");
        Address address2 = new Address("Jernbanevej 3g","1 tv");
        Address address3 = new Address("Kastanievej","2");
        CityInfo cityInfo = new CityInfo(3520,"Farum");
        CityInfo cityInfo2 = new CityInfo(2800,"Kgs. Lyngby");


        person.addPhone(phone1);
        person2.addPhone(phone2);

        person.addHobby(hobby);
        person2.addHobby(hobby);
        person3.addHobby(hobby2);

        person.addAddress(address);
        person2.addAddress(address);
        person3.addAddress(address3);

        address.addCityInfo(cityInfo);
        address2.addCityInfo(cityInfo2);
        address3.addCityInfo(cityInfo2);
        try{
            em.getTransaction().begin();
            em.persist(person);
            em.persist(person2);
            em.persist(person3);
            em.persist(phone1);
            em.persist(phone2);
            em.persist(hobby);
            em.persist(hobby2);
            em.persist(address);
            em.persist(address2);
            em.persist(address3);
            em.persist(cityInfo);
            em.persist(cityInfo2);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public static void main(String[] args) {
        populate();
    }
}
