package com.example.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class KhachHangRequest {
        private String ma;
        private String ten;
        private String tenDem;
        private String ho;
        //    @Future
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
        private LocalDate ngaySinh ;
        private String sdt;
        private String diaChi;
        private String thanhPho;
        private String quocGia;
        private String matKhau;
}
