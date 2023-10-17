package com.example.demo.controllers;

import com.example.demo.entities.ChucVu;
import com.example.demo.repositories.ChucVuRepository;
import com.example.demo.requests.ChucVuRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("chuc-vu")
public class chucVuController {
    @Autowired
    private ChucVuRepository repository;

    public List<ChucVu> chucvu;

    public chucVuController() {
        this.chucvu = new ArrayList<>();

    }

    @GetMapping("index")
    public String index(Model model) {
        chucvu = this.repository.findAll();
        model.addAttribute("chucvu", chucvu);
        return "chucVu/index";
    }

    //create
    @GetMapping("create")
    public String create(@ModelAttribute("chucvu") ChucVuRequest request) {

        return "chucVu/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("chucvu") ChucVuRequest request, BindingResult result) {
        ChucVu cv = new ChucVu();
        cv.setMa(request.getMa());
        cv.setTen(request.getTen());
        this.repository.save(cv);
        return "redirect:/chuc-vu/index";
    }

    //delete
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma) {
        ChucVu cv = this.repository.findByMa(ma);
        this.repository.delete(cv);
        return "redirect:/chuc-vu/index";
    }

    //Update
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m) {
        ChucVu cv = this.repository.findByMa(ma);
        m.addAttribute("chucvu", cv);
        return "chucVu/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, ChucVuRequest request) {
        ChucVu find = this.repository.findByMa(ma);
        ChucVu cv = new ChucVu();
        cv.setId(find.getId());
        cv.setMa(request.getMa());
        cv.setTen(request.getTen());
        this.repository.save(cv);
        return "redirect:/chuc-vu/index";
    }
}
