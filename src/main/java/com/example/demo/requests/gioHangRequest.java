package com.example.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class gioHangRequest {
    private String idKH;
    private String idNV;
    private String ma;
    private LocalDate ngayTao;
    private LocalDate ngayThanhToan;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;
    private boolean tinhtrang;

}
