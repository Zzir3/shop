package com.example.demo.controller;

import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;

@Controller

public class FileUploadController {

    //    自动注入服务层bean

    @Autowired

    private CustomerService customerService;



    // 映射"/"请求

    @GetMapping("/customer/regImg")

    public String index() {

        // 根据Thymeleaf默认模板，将返回resources/templates/index.html

        return "/customer/reglmg";

    }





    // 上传文件会自动绑定到MultipartFile中

    @PostMapping("/customer/upload")

    public String UploadPicture(HttpServletRequest request, @RequestParam("cusImg") MultipartFile file, RedirectAttributes attributes) throws IOException {

        if (file.isEmpty()) {

            // 这里是我自定义的异常，可省略

            throw new IOException();

        }

        // 上传文件/图像到指定文件夹（这里可以改成你想存放地址的相对路径）

        File savePos = new File("src/main/resources/static/images/regImg");

        if (!savePos.exists()) {  // 不存在，则创建该文件夹

            savePos.mkdir();

        }

        // 获取存放位置的规范路径

        String realPath = savePos.getCanonicalPath();

        // 上传该文件/图像至该文件夹下

        String imgName = file.getOriginalFilename();

        file.transferTo(new File(realPath + "/" + imgName));

//        更改session，从当前会话中拿到session的customer，改写imgUrl后，写回session

        Customer customer = (Customer) request.getSession().getAttribute("customer");

        customer.setImgUrl(imgName);

        request.getSession().setAttribute("customer", customer);

//       头像写入数据表

        customerService.update(customer);

//        attributes.addFlashAttribute("message", "添加成功！");

        return "redirect:/customer/regImg";

    }

}