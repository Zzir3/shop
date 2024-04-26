package com.example.demo.mapper;

import com.example.demo.pojo.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface AddressMapper {
    //    public int addAddress(Address address);
    public Address findById(int id);
    public List<Address> findByProp(HashMap<String, Object> prop);
    public List<Address> getAllAddresses();
    int insertAddress(Address address);
    List<Address> selectAddressesByCustomerId(int customerId);
    Address selectAddressById(int id);
    int updateAddress(Address address);
    int deleteAddress(int id);
}
