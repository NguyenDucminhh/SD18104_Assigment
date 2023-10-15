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
    private List<SanPham> rq ;
    @Autowired
    private SanPhamRepository spRepo;


    public sanPhamController(){
        this.rq = new ArrayList<>();
    }
    @GetMapping("/products")
    public String showProducts(Model model)
    {
        this.rq = this.spRepo.findAll();
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
    )
    {
        System.out.println(req.getMa());
        System.out.println( req.getTen());

        rq.add(req);
        return "redirect:/san-pham/products";
    }

//    chỉnh sửa
    @GetMapping("edit/{ma}")
   public String edit(@PathVariable("ma") String ma, Model m)
    {
        SanPham sp = this.spRepo.findByMa(ma);
        m.addAttribute("sp", sp);
       return "sanPham/edit";
  }
//    Update
@PostMapping("update/{ma}")
public String update(@PathVariable("ma") String ma, sanPhamRequest updatereq)
{
    SanPham oldValue = this.spRepo.findByMa(ma);
    SanPham sp = new SanPham();
    sp.setId(oldValue.getId());
    sp.setMa(updatereq.getMa());
    sp.setTen(updatereq.getTen());
    this.spRepo.save(sp);
    return "redirect:/san-pham/products";}

 //    xóa

@GetMapping("delete/{ma}")
public String delete(@PathVariable("ma") String maSp)
{
    SanPham sp = this.spRepo.findByMa(maSp);
    this.spRepo.delete(sp);
    return "redirect:/san-pham/products";
}
}
