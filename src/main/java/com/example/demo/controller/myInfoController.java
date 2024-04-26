package com.example.demo.controller;

import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class myInfoController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customer/myInfo")
    public String s(Model model) {
//        model.addAttribute("currenYEAE", Calendar.getInstance().get(Calendar.YEAR));
        return "/customer/myinfo";
    }
    @PostMapping("/updateUserInfo")
    public String updateUserInfo(@ModelAttribute("customer") Customer customer, Model model, HttpServletRequest request) {
        int result = customerService.updateUserInfo(customer);
        //刷新更新数据的页面
        customerService.updateUserInfo(customer);
        Customer customer1= (Customer) request.getSession().getAttribute("customer");
        customer1.setRealname(customer.getRealname());
        customer1.setTel(customer.getTel());
        customer1.setEmail(customer.getEmail());
        customer1.setCardID(customer.getCardID());
        customer1.setGender(customer.getGender());
        customer1.setIntro(customer.getIntro());
        request.getSession().setAttribute("customer",customer1);
        if (result > 0) {
            model.addAttribute("successMsg", "更新成功！");
        } else {
            model.addAttribute("errorMsg", "更新失败！");
        }
        return "/customer/myinfo";
    }
    @ResponseBody
    @RequestMapping(value = "/customer/usernameIsCorrect", method = RequestMethod.POST)
    public int usernameIsCorrect(@RequestParam("username") String username, HttpSession session) {
        Customer customer = (Customer) session.getAttribute("customer");
        if (customer != null && customer.getUsername().equals(username)) {
            return 1; //账号正确
        } else {
            return 0; //账号错误
        }
    }
    @ResponseBody
    @PostMapping("/customer/emailIsExist")
    public int emailIsExist(String email){return customerService.emailIsExist(email);
    }
    @ResponseBody
    @PostMapping("/customer/cardIDIsExist")
    public int cardIDIsExist(String cardID){
        return customerService.cardIDIsExist(cardID);
    }
}
