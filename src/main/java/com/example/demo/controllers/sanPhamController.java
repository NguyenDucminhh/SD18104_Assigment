package com.example.demo.controllers;

import com.example.demo.requests.sanPhamRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("san-pham")
public class sanPhamController {
//    thêm dữ liệu sản phẩm
    private ArrayList<sanPhamRequest> rq ;

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
    //Create
    @GetMapping("/add")
    public String showAddForm(@ModelAttribute("sp") sanPhamRequest req)
    {

        return "sanPham/create";
    }


    @PostMapping("/products")
    public String storeProducts(
            @Valid @ModelAttribute("sp") sanPhamRequest req,
            BindingResult result
    ) {
        System.out.println(req.getMa());
        System.out.println(req.getTen());
        rq.add(req);
        return "redirect:/san-pham/products";
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
@PostMapping("update/{ma}")
public String update(@PathVariable("ma") String ma, sanPhamRequest updatereq)
{
    for (int i = 0; i < this.rq.size(); i++) {
        sanPhamRequest sp = this.rq.get(i);
        if (sp.getMa().equals(ma)) {
            this.rq.set(i, updatereq);
            break;
        }
    }

    return "redirect:/san-pham/products";}

//    xóa
@GetMapping("delete/{ma}")
public String delete(@PathVariable("ma") String maSp)
{
    for (int i = 0; i < this.rq.size(); i++) {
        sanPhamRequest sp = this.rq.get(i);
        if (sp.getMa().equals(maSp)) {
            this.rq.remove(i);
            break;
        }
    }
    return "redirect:/san-pham/products";
}
}
