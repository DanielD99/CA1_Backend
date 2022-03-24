package dtos;


import entities.Phone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonDTO {
    private long id;
    private String eMail;
    private String firstName;
    private String lastName;
    private Set<PhoneDTO> phoneDTOSet = new HashSet<>();
    private Set<HobbyDTO> hobbyDTOSet = new HashSet<>();


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
}

