package com.example.demo.controllers;


import com.example.demo.requests.chiTietSanPhamRequest;
import com.example.demo.requests.sanPhamRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
        rq.add(req);
        return "redirect:/chitiet-sanpham/index";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") String id, Model m)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            chiTietSanPhamRequest rq = this.rq.get(i);
            if (rq.getId().equals(id)) {
                m.addAttribute("rq", rq);
                break;
            }
        }

        return "chiTietSanPham/edit";
    }
    //    Update
    @PostMapping("update/{id}")
    public String update(@PathVariable("id") String ma, chiTietSanPhamRequest updatereq)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            chiTietSanPhamRequest sp = this.rq.get(i);
            if (sp.getId().equals(ma)) {
                this.rq.set(i, updatereq);
                break;
            }
        }

        return "redirect:/chitiet-sanpham/index";}

    //    xóa

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") String maSp)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            chiTietSanPhamRequest sp = this.rq.get(i);
            if (sp.getId().equals(maSp)) {
                this.rq.remove(i);
                break;
            }
        }
        return "redirect:/chitiet-sanpham/index";
    }

}
