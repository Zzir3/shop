package com.example.demo.controller;

import com.example.demo.pojo.*;
import com.example.demo.service.AddressService;
import com.example.demo.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;

@Controller
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/customer/address")

    public String addressManage(Model model, HttpServletRequest request) {

        HashMap<String, Object> prop = new HashMap<>();

        //从session中获取登录用户信息

        Customer customer = (Customer) request.getSession().getAttribute("customer");

        if (customer != null) {

            prop.put("id", customer.getId());

            //在地址表中根据用户ID查找该用户所有的地址，封装后输出到页面

            List<Address> as = addressService.findByProp(prop);

            model.addAttribute("as", as);

        }

        //封装省份信息

        HashMap<String, Object> prop1 = new HashMap<>();

        List<Province> ps = addressService.findAllProv(prop1);

        model.addAttribute("ps", ps);

        //去地址管理页面

        return "/customer/address";

    }

    /**

     * 功能：通过省ID获取所有的市

     * @param prov_id

     * @return

     */

    @ResponseBody

    @GetMapping("/customer/getCities")

    public List<City> getCities(@RequestParam("prov_id") int prov_id) {

        HashMap<String, Object> prop = new HashMap<>();

        prop.put("prov_id", prov_id);

        List<City> cities = addressService.findCities(prop);

        return cities;

    }



    /**

     * 功能：通过市ID获取所有的区

     * @param city_id

     * @return

     */

    @ResponseBody

    @GetMapping("/customer/getRegions")

    public List<Region> getRegions(@RequestParam("city_id") int city_id) {

        HashMap<String, Object> prop = new HashMap<>();

        prop.put("city_id", city_id);

        List<Region> regions = addressService.findRegions(prop);

        return regions;

    }



    /**

     * 功能：通过区ID获取所有的乡镇

     * @param region_id

     * @return

     */

    @ResponseBody

    @GetMapping("/customer/getTowns")

    public List<Town> getTowns(@RequestParam("region_id") int region_id) {

        HashMap<String, Object> prop = new HashMap<>();

        prop.put("region_id", region_id);

        List<Town> towns = addressService.findTowns(prop);

        return towns;

    }



    /**

     * 功能：通过乡镇ID获取所有的街道或社区

     * @param town_id

     * @return

     */

    @ResponseBody

    @GetMapping("/customer/getStreets")

    public List<Street> getStreets(@RequestParam("town_id") int town_id) {

        HashMap<String, Object> prop = new HashMap<>();

        prop.put("town_id", town_id);

        List<Street> streets = addressService.findStreets(prop);

        return streets;

    }
    @PostMapping("/addAddress")
    public String addAddress(HttpServletRequest request,Address address, RedirectAttributes redirectAttributes) {
        // 从Session中获取当前用户的ID
        Long customer_id = (Long) request.getSession().getAttribute("customer_id");
        // 将用户ID设置为地址的所有者ID
        address.setCustomer_id(address.getCustomer_id());
        int result = addressService.insertAddress(address);
        if (result > 0) {
            redirectAttributes.addFlashAttribute("successMessage", "地址添加成功");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", "地址添加失败，请重试");
        }
        return "redirect:/customer/address";
    }
}
