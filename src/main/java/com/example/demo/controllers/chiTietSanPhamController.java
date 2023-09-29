package com.example.demo.controllers;


import com.example.demo.requests.chiTietSanPhamRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("chitiet-sanpham")
public class chiTietSanPhamController {
    private ArrayList<chiTietSanPhamRequest> rq;
    public chiTietSanPhamController(){
        this.rq = new ArrayList<>();
        rq.add(new chiTietSanPhamRequest("1","SP01","NSX01","Red","DongSP1",2,"Sản phẩm này rất vippro bờ hồ tây",10,12000L,20000L));
        rq.add(new chiTietSanPhamRequest("2","SP01","NSX02","Blue","DongSP2",2,"Sản phẩm này cực vippro bờ hồ tây",15,5000L,8000L));
        rq.add(new chiTietSanPhamRequest("3","SP01","NSX03","Green","DongSP3",2,"Sản phẩm này khá vippro bờ hồ tây",55,9000L,55000L));
        rq.add(new chiTietSanPhamRequest("4","SP01","NSX04","Black","DongSP4",2,"Sản phẩm này đẳng cấp vippro bờ hồ tây",20,8000L,32000L));
    }
    @GetMapping("/index")
    public String showDetails(Model model)
    {
        model.addAttribute("data",this.rq);
        return "chiTietSanPham/productsDetail";
    }

}
