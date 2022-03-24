package dtos;


import entities.Hobby;
import entities.Person;
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
    private Set<PhoneDTO> phones = new HashSet<>();
    private Set<HobbyDTO> hobbies = new HashSet<>();
    private AddressDTO address;


    public PersonDTO(Person person) {
        this.id = person.getId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.eMail = person.getEmail();
        for (Hobby hobby: person.getHobbies()) {
            this.hobbies.add(new HobbyDTO(hobby));
        }
        for (Phone phone: person.getPhones()){
            this.phones.add(new PhoneDTO(phone));
        }
        this.address = new AddressDTO(person.getAddress());
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

