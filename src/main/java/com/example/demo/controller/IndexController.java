package com.example.demo.controller;

import com.example.demo.pojo.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model){
        ArrayList<Goods> goodses = new ArrayList<>();

        for(int i=1;i<=3;i++){
            Goods goods = new Goods();
            goods.setId(5000+i);
            goods.setKeywords("商品说明"+i);
            goods.setOut_price(25.88+i);
            goods.setStock(11*i);
            goods.setImgUrl("cake"+i+".jpg");
            goodses.add(goods);
        }
        model.addAttribute("goodses",goodses);
        return "index";
    }

}
