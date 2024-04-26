package com.example.demo.controller;

import com.example.demo.mapper.CustomerMapper;
import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegisterController {
    @GetMapping("/reg")
    public String reg(){
        return "register";
    }

    @PostMapping("/doReg")
    public String doReg(Customer customer){
        customerService.register(customer);
        return "redirect:/";
    }
    @Autowired
    private CustomerService customerService;
    @ResponseBody

    @PostMapping("/customer/usernameIsExist")
    public int usernameIsExist(String username){

        return customerService.usernameIsExist(username);
    }
    @ResponseBody
    @PostMapping("/customer/telIsExist")
    public int telIsExist(String tel){
        return customerService.telIsExist(tel);
    }


}
