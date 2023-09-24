package com.example.demo.controllers;

import com.example.demo.requests.sanPhamRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("san-pham")
public class sanPhamController {
//    thêm dữ liệu sản phẩm
    private ArrayList<sanPhamRequest> rq;
    public sanPhamController(){
        this.rq = new ArrayList<>();
        rq.add(new sanPhamRequest("1","Sản phẩm 1"));
        rq.add(new sanPhamRequest("2","Sản phẩm 2"));
        rq.add(new sanPhamRequest("3","Sản phẩm 3"));
        rq.add(new sanPhamRequest("4","Sản phẩm 4"));
    }
    @GetMapping("/products")
    public String showProducts(Model model)
    {
        model.addAttribute("data",this.rq);
        return "sanPham/products";
    }


    @GetMapping("/add")
    public String showAddForm() {

        return "sanPham/create";
    }
//    chỉnh sửa
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            sanPhamRequest rq = this.rq.get(i);
            if (rq.getMa().equals(ma)) {
                m.addAttribute("rq", rq);
                break;
            }
        }

        return "sanPham/edit";
    }
//    Update
//@PostMapping("update/{ma}")
//public String update(@PathVariable("ma") String ma, sanPhamRequest req)
//{
//    for (int i = 0; i < this.rq.size(); i++) {
//        sanPhamRequest sp = this.rq.get(i);
//        if (rq.get.equals(ma)) {
//            this.rq.set(i, req);
//            break;
//        }
//    }

//    return "redirect:/nhan_vien/index";}
}
