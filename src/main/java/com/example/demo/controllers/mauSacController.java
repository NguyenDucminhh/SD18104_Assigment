package com.example.demo.controllers;

import com.example.demo.requests.mauSacRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@Controller
@RequestMapping("mau-sac")
public class mauSacController {
    private ArrayList<mauSacRequest> rq;

    public mauSacController(){
        this.rq = new ArrayList<>();
        rq.add(new mauSacRequest("1","Red"));
        rq.add(new mauSacRequest("2","Yello"));
        rq.add(new mauSacRequest("3","Blue"));
    }
    // Thiết lập đường dẫn ra trang màu sắc
    @GetMapping("/index")
    public String showColor(Model model)
    {
        model.addAttribute("data",this.rq);
        return "mauSac/color";
    }

    // Đường dẫn thêm mới màu sắc
    @GetMapping("/add")
    public String addNewColor(@ModelAttribute("ms") mauSacRequest req)
    {
        return "mauSac/create";
    }
    // Thêm mới
    @PostMapping("/color")
    public  String storeColor(
            @Valid @ModelAttribute("ms") mauSacRequest req,
            BindingResult result
    ){
        rq.add(req);
        return "redirect:/mau-sac/index";
    }

    // Chỉnh sửa
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma, Model m)
    {
        for(int i = 0 ; i < this.rq.size(); i++){
            mauSacRequest rq = this.rq.get(i);
            if(rq.getMa().equals(ma)){
                m.addAttribute("rq",rq);
                break;
            }
        }
        return "mauSac/edit";
    }
    // Cập nhật
    @PostMapping("update/{ma}")
    public String updateColor(@PathVariable("ma") String ma, mauSacRequest updateReq)
    {
        for(int i = 0; i < this.rq.size(); i++){
            mauSacRequest ms = this.rq.get(i);
            if(ms.getMa().equals(ma)){
                this.rq.set(i,updateReq);
                break;
            }
        }
        return "redirect:/mau-sac/index";
    }
    @GetMapping("delete/{ma}")
    public String deleteColor(@PathVariable("ma") String maMs, mauSacRequest msRq)
    {
        for(int i = 0; i< this.rq.size(); i++){
            mauSacRequest ms = this.rq.get(i);
            if(ms.getMa().equals(maMs)){
                this.rq.remove(i);
                break;
            }
        }
        return "redirect:/mau-sac/index";
    }

}
