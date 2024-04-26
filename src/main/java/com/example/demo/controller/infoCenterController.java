package com.example.demo.controller;

import com.example.demo.mapper.CustomerMapper;
import com.example.demo.pojo.Customer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

@Controller
public class infoCenterController {
    @Autowired
    CustomerMapper customerMapper;
    @GetMapping("/infoCenter")
    public String q(Model model){
        model.addAttribute("currenYEAE", Calendar.getInstance().get(Calendar.YEAR));
        return "/common/infoCenter";
    }
    @ResponseBody

    @PostMapping("/customer/passIsCorrect")

    public int passIsCorrect(String pass, HttpServletRequest request) {

        Customer c = (Customer) request.getSession().getAttribute("customer");

        if (c.getPass().equals(pass)) {

            return 1;

        } else {

            return 0;

        }

    }
    @PostMapping("/updatepass")
    public String updatepass(HttpServletRequest request, @RequestParam String newpass){
        Customer c=(Customer) request.getSession().getAttribute("customer");
        customerMapper.updatepass(newpass, c.getUsername());
        return "redirect:/login";
    }
}
