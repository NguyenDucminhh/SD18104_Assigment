package com.example.demo.controllers;
import com.example.demo.config.DemoBeanConfig;
import com.example.demo.entities.SanPham;
import com.example.demo.repositories.SanPhamRepository;
import com.example.demo.requests.sanPhamRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("san-pham")
public class sanPhamController {
//    thêm dữ liệu sản phẩm
@Autowired
private SanPhamRepository repository;

    public List<SanPham> sanpham;

    public sanPhamController() {
        this.sanpham = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model) {
        this.sanpham = this.repository.findAll();
        model.addAttribute("sanpham", sanpham);
        return "sanPham/products";
    }

    //create
    @GetMapping("create")
    public String index(@ModelAttribute("sanpham") sanPhamRequest request) {
        return "sanPham/create";
    }

    @PostMapping("index")
    public String store(@Valid @ModelAttribute("sanpham") sanPhamRequest request, BindingResult result) {
        SanPham sp = new SanPham();
        sp.setMa(request.getMa());
        sp.setTen(request.getTen());
        this.repository.save(sp);

        return "redirect:/san-pham/index";
    }

    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma, sanPhamRequest request) {
        SanPham sp = this.repository.findByMa(ma);
        this.repository.delete(sp);
        return "redirect:/san-pham/index";
    }

    //update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model model, sanPhamRequest request) {
        SanPham sp = this.repository.findByMa(ma);
        model.addAttribute("sanpham", sp);
        return "sanPham/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, Model model, sanPhamRequest request) {
        SanPham find = this.repository.findByMa(ma);
        SanPham sp = new SanPham();
        sp.setId(find.getId());
        sp.setMa(request.getMa());
        sp.setTen(request.getTen());
        this.repository.save(sp);
        return "redirect:/san-pham/index";
    }
}
