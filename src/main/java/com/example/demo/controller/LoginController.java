package com.example.demo.controller;

import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   //servlet  doget  dopost   request  response

public class LoginController {

    @Autowired

    private CustomerService customerService;



    @GetMapping("/login")

    public String login() {

        return "login";

    }



    //    退出功能

    @GetMapping("/logout")

    public String logout(HttpServletRequest request) {

//        让session失效

        request.getSession().invalidate();

//        重定向至主页请求

        return "redirect:/";

    }



    /**

     * @param model 封装数据

     * @param u     接收form中传来的控件name为username的参数

     * @param p     接收form中传来的控件name为password的参数

     * @return 返回页面解析，必要时带数据返回

     */



    @PostMapping("/dologin")

    public String doLogin(HttpServletRequest request, Model model, @RequestParam("username") String u, @RequestParam("password") String p) {

        //调用服务层的login方法

        Customer customer = customerService.login(u, p);

        if (customer != null) {

            //写进session

            request.getSession().setAttribute("customer", customer);

            return "redirect:/";

        } else {

            model.addAttribute("MsgErr", "账户或密码错");

            return "login";

        }

    }

}

