package dtos;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */

import entities.Phone;
import entities.RenameMe;

import java.util.ArrayList;
import java.util.List;

public class PhoneDTO {
    private long id;
    private String phoneNumber;
    private String description;
    private int personId;

    public PhoneDTO(Phone phone) {
        this.id = phone.getId();
        this.phoneNumber = phone.getNumber();
        this.description = phone.getDescription();
        this.personId = phone.getPerson().getId();
    }


    public static List<PhoneDTO> getDtos(List<Phone> phoneList){
        List<PhoneDTO> phoneDTOS = new ArrayList();
        phoneList.forEach(phone->phoneDTOS.add(new PhoneDTO(phone)));
        return phoneDTOS;
    }


//    public PhoneDTO(RenameMe rm) {
//        if(rm.getId() != null)
//            this.id = rm.getId();
//        this.str1 = rm.getDummyStr1();
//        this.str2 = rm.getDummyStr2();
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

//    @Override
//    public String toString() {
//        return "RenameMeDTO{" + "id=" + id + ", str1=" + str1 + ", str2=" + str2 + '}';
//    }


}
