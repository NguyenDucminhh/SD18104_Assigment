package com.example.demo.controllers;


import com.example.demo.entities.ChiTietSP;
import com.example.demo.repositories.ChiTietSanPhamRepository;
import com.example.demo.requests.chiTietSanPhamRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("chitiet-sanpham")
public class chiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamRepository repository;
    public chiTietSanPhamController(){
        this.ctsp = new ArrayList<>();

    }
    public List<ChiTietSP> ctsp;
    @GetMapping("/index")
    public String showDetails(Model model)
    {
        this.ctsp = repository.findAll();
        model.addAttribute("data",this.ctsp);
        return "chiTietSanPham/productsDetail";
    }
    // create
    @GetMapping("/add")
    public String showAd(@ModelAttribute("sp") chiTietSanPhamRequest req)
    {

        return "chiTietSanPham/create";
    }
    // Fill dữ liệu lên bảng
    @PostMapping("/index")
    public String storeListDetailsProduct(
            @Valid @ModelAttribute("sp") chiTietSanPhamRequest req,
            BindingResult result
    ){
        ChiTietSP ctsp = new ChiTietSP();


        return "redirect:/chitiet-sanpham/index";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") String id, Model m)
    {

        return "chiTietSanPham/edit";
    }
    //    Update
    @PostMapping("update/{id}")
    public String update(@PathVariable("id") String ma, chiTietSanPhamRequest updatereq)
    {
//        for (int i = 0; i < this.rq.size(); i++) {
//            chiTietSanPhamRequest sp = this.rq.get(i);
//            if (sp.getId().equals(ma)) {
//                this.rq.set(i, updatereq);
//                break;
//            }
//        }
//
        return "redirect:/chitiet-sanpham/index";
    }

    //    xóa

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") String maSp)
    {
//        for (int i = 0; i < this.rq.size(); i++) {
//            chiTietSanPhamRequest sp = this.rq.get(i);
//            if (sp.getId().equals(maSp)) {
//                this.rq.remove(i);
//                break;
//            }
//        }
        return "redirect:/chitiet-sanpham/index";
    }

}
