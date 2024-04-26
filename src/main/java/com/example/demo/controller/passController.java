package com.example.demo.controller;


import com.example.demo.mapper.CustomerMapper;
import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

@Controller
public class passController {
    @Autowired
    CustomerMapper customerMapper;
    @GetMapping("/customer/pass")
    public String pass(Model model){
        return "/customer/pass";

    }
//    @ResponseBody
//    @RequestMapping(value = "/customer/passIsCorrect", method = RequestMethod.POST)
//    public int passIsCorrect(@RequestParam("pass") String pass, HttpSession session) {
//        Customer customer = (Customer) session.getAttribute("customer");
//        if (customer != null && customer.getPass().equals(pass)) {
//            return 1; //密码正确
//        } else {
//            return 0; //密码错误
//        }
//    }
//    @PostMapping("/updatepass")
//    public String updatepass(HttpServletRequest request, @RequestParam String newpass){
//        Customer c=(Customer) request.getSession().getAttribute("customer");
//        customerMapper.updatepass(newpass, c.getUsername());
//        return "redirect:/login";
//    }
}
