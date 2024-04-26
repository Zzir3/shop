package com.example.demo.service;

import com.example.demo.mapper.CustomerMapper;
import com.example.demo.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //服务层Bean

public class CustomerService {

    @Autowired

    private CustomerMapper customerMapper;


    /**
     * 功能：登录
     *
     * @param username 账号
     * @param pass     密码
     * @return
     */

    public Customer login(String username, String pass) {

        return customerMapper.findByUandP(username, pass);

    }


    /**
     * 功能：账号是否存在
     *
     * @param username 账号
     * @return
     */

    public int usernameIsExist(String username) {

        return customerMapper.usernameIsExist(username);

    }


    /**
     * 功能：添加
     *
     * @param customer
     * @return
     */

    public int register(Customer customer) {

        return customerMapper.insert(customer);

    }


    /**
     * 功能：修改
     *
     * @param customer
     * @return
     */

    public int update(Customer customer) {

        return customerMapper.update(customer);

    }


    public Customer findById(int id) {

        return customerMapper.findById(id);

    }

    public int telIsExist(String tel) {

        return customerMapper.telIsExist(tel);


    }
    public int emailIsExist(String eamil) {

        return customerMapper.emailIsExist(eamil);


    }
    public int cardIDIsExist(String cardID) {

        return customerMapper.cardIDIsExist(cardID);


    }
    public int updateUserInfo(Customer customer){
        return customerMapper.updateUserInfo(customer);
    }


public int passIsCorrect(String pass){
        return customerMapper.passIsCorrect(pass);
}
}