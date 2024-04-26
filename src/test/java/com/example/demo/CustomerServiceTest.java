package com.example.demo;

import com.example.demo.pojo.Customer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.service.CustomerService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    CustomerService customerService;
    @Test
    public void  testLogin(){
        String username="admin";
        String pass="admin";
        System.out.println(customerService.login(username,pass));
    }
    @Test
    public void testIsExist(){
        String username="admin";
        System.out.println(customerService.usernameIsExist(username));

    }
@Test
    public void test1IsExist(){
    String tel="15920558888";
    System.out.println(customerService.telIsExist(tel));
}

//    @Test
//    public void test3IsCorrect(){
//        String pass="11";
//        System.out.println(customerService.passIsCorrect(pass));
//    }


}
