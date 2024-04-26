package com.example.demo.service;

import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AddressService {

    @Autowired

    private AddressMapper addressMapper;

    @Autowired

    private ProvinceMapper provinceMapper;

    @Autowired

    private CityMapper cityMapper;

    @Autowired

    private RegionMapper regionMapper;

    @Autowired

    private TownMapper townMapper;

    @Autowired

    private StreetMapper streetMapper;

    /**

     * 功能：修改

     *

     * @param
     * @return

     */

//    public int addAddress(Address address) {
//        return addressMapper.addAddress(address);
//    }
    public List<Address> getAllAddresses() {
        return addressMapper.getAllAddresses();
    }


    /**

     * @param id

     * @return

     */

    public Address findById(int id) {

        return addressMapper.findById(id);

    }



    /**

     * @param prop

     * @return

     */

    public List<Address> findByProp(HashMap<String, Object> prop) {

        return addressMapper.findByProp(prop);

    }



    public List<Province> findAllProv(HashMap<String, Object> prop) {

        return provinceMapper.findByProp(prop);

    }



    public List<City> findCities(HashMap<String, Object> prop) {

        return cityMapper.findByProp(prop);

    }



    public List<Region> findRegions(HashMap<String, Object> prop) {

        return regionMapper.findByProp(prop);

    }



    public List<Town> findTowns(HashMap<String, Object> prop) {

        return townMapper.findByProp(prop);

    }



    public List<Street> findStreets(HashMap<String, Object> prop) {

        return streetMapper.findByProp(prop);

    }
    public int insertAddress(Address address) {
        return addressMapper.insertAddress(address);
    }
}
