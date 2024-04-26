package com.example.demo.mapper;

import com.example.demo.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface CustomerMapper {
    public Customer findByUandP(String username, String pass);
    public  int usernameIsExist(String u);
    public int telIsExist(String u);

    public Customer findById(int id);

    public int passIsCorrect(String u);

    public int insert(Customer customer);
    public int updatepass(String newpass,String username);
    public int update(Customer customer);
    public int emailIsExist(String u);
    public int updateUserInfo(Customer customer);
    public int cardIDIsExist(String u);
}



