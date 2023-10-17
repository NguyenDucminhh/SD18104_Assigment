package com.example.demo.controllers;
import com.example.demo.entities.DongSanPham;
import com.example.demo.repositories.DongSanPhamRepository;
import com.example.demo.requests.dongSanPhamRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("dong-sanpham")
public class dongSanPhamController {
    @Autowired
    private DongSanPhamRepository repository;

    public List<DongSanPham> dongsp;

    public dongSanPhamController() {
        this.dongsp = new ArrayList<>();

    }

    @GetMapping("index")
    public String index(Model model) {
        this.dongsp = repository.findAll();
        model.addAttribute("dongsp", dongsp);
        return "dongSanPham/index";
    }
    //thêm
    @GetMapping("create")
    public String create(@ModelAttribute("dongsp") dongSanPhamRequest req  ){
        return "/dongSanPham/create";

    }
    @PostMapping("store")
    public String store(@ModelAttribute("dongsp") dongSanPhamRequest req , BindingResult result){
        DongSanPham sp = new DongSanPham();
        sp.setMa(req.getMa());
        sp.setTen(req.getTen());
        this.repository.save(sp);
        return "redirect:/dong-sanpham/index";
    }
    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
        DongSanPham sp = this.repository.findByMa(ma);
        this.repository.delete(sp);
        return "redirect:/dong-sanpham/index";
    }
    //form update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,Model model){
        DongSanPham sp = this.repository.findByMa(ma);
        model.addAttribute("dongsp",sp);
        return "/dongSanPham/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma , dongSanPhamRequest request){
        DongSanPham find = this.repository.findByMa(ma);
        DongSanPham sp = new DongSanPham();
        sp.setId(find.getId());
        sp.setMa(request.getMa());
        sp.setTen(request.getTen());
        this.repository.save(sp);
        return "redirect:/dong-sanpham/index";
    }
}
