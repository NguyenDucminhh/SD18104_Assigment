package com.example.demo.controllers;


import com.example.demo.entities.Nsx;
import com.example.demo.repositories.NsxRepository;
import com.example.demo.requests.NhaSXRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("nha-san-xuat")
public class nhaSanXuatController {
    @Autowired
    private NsxRepository repository;

    public List<Nsx> nhaSX;

    public nhaSanXuatController() {
        this.nhaSX = new ArrayList<>();
    }

    @GetMapping("index")
    public String index(Model model) {
        this.nhaSX = this.repository.findAll();
        model.addAttribute("data", this.nhaSX);
        return "NSX/index";
    }

    //them
    @GetMapping("create")
    public String create(@ModelAttribute("nsx") NhaSXRequest request) {

        return "/NSX/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nsx") NhaSXRequest request, BindingResult result) {
        Nsx nsx = new Nsx();
        nsx.setMa(request.getMa());
        nsx.setTen(request.getTen());
        this.repository.save(nsx);
        return "redirect:/nha-san-xuat/index";
    }

    //sua
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        Nsx nsx = this.repository.findByMa(ma);
        m.addAttribute("nsx", nsx);
        return "/NSX/store";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, NhaSXRequest request) {

        Nsx find = this.repository.findByMa(ma);
        Nsx nsx = new Nsx();
        nsx.setId(find.getId());
        nsx.setMa(request.getMa());
        nsx.setTen(request.getTen());
        this.repository.save(nsx);
        return "redirect:/nha-san-xuat/index";
    }

    //xoa
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma) {
        Nsx nsx = this.repository.findByMa(ma);
        this.repository.delete(nsx);
        return "redirect:/nha-san-xuat/index";
    }
}
