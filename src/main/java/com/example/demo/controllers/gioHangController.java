package com.example.demo.controllers;

import com.example.demo.requests.gioHangRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("gio-hang")
public class gioHangController {
    private ArrayList<gioHangRequest> rq;
    public gioHangController(){
        this.rq = new ArrayList<>();
//        rq.add(new gioHangRequest("KH01","NV01","01",,2023/09/20,"Minh","Hà Nội","0353616805",1))

    }
}
