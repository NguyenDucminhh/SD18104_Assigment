package com.example.demo.controllers;

import com.example.demo.requests.chiTietSanPhamRequest;
import com.example.demo.requests.gioHangRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("gio-hang")
public class gioHangController {
    private ArrayList<gioHangRequest> rq;
    public gioHangController(){
        LocalDate datenow =  LocalDate.now();
        LocalDate previousDate = datenow.minusDays(1);
        this.rq = new ArrayList<>();
        rq.add(new gioHangRequest("KH01","NV01","01",previousDate,datenow,"Minh","Hà Nội","0353616805",true));

    }

    @GetMapping("/index")
    public String showcart(Model model)
    {
        model.addAttribute("data",this.rq);
        return "gioHang/gioHangIndex";
    }
    //Them
    @GetMapping("/add")
    public String addcart(@ModelAttribute("gh") gioHangRequest req)
    {
        return "gioHang/create";
    }
    //fill dữ liệu lên bảng
    @PostMapping("/index")
    public String storeCart(@Valid @ModelAttribute("gh")
                                        gioHangRequest req,
                            BindingResult result){
        rq.add(req);
        return "redirect:/gio-hang/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String id, Model m)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            gioHangRequest rq = this.rq.get(i);
            if (rq.getMa().equals(id)) {
                m.addAttribute("rq", rq);
                break;
            }
        }

        return "chiTietSanPham/edit";
    }
    //    Update
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String ma, gioHangRequest updatereq)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            gioHangRequest sp = this.rq.get(i);
            if (sp.getMa().equals(ma)) {
                this.rq.set(i, updatereq);
                break;
            }
        }

        return "redirect:/gio-hang/index";}

    //    xóa

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maSp)
    {
        for (int i = 0; i < this.rq.size(); i++) {
            gioHangRequest sp = this.rq.get(i);
            if (sp.getMa().equals(maSp)) {
                this.rq.remove(i);
                break;
            }
        }
        return "redirect:/gio-hang/index";
    }
}
