package dtos;


import entities.Address;
import entities.CityInfo;
import entities.Person;

import java.util.*;

public class CityInfoDTO {
    private int id;
    private int zip;
    private String city;

    public CityInfoDTO(CityInfo cityInfo) {
        this.id = cityInfo.getId();
        this.zip = cityInfo.getZipCode();
        this.city = cityInfo.getCity();
    }

    public static List<CityInfoDTO> getDtos(List<CityInfo> cityInfoList) {
        List<CityInfoDTO> cityInfoDTOs = new ArrayList();
        cityInfoList.forEach(cityInfo -> cityInfoDTOs.add(new CityInfoDTO(cityInfo)));
        return cityInfoDTOs;
    }
}