package com.example.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class chiTietSanPhamRequest {
    private String id;
    private String idSP;
    private String idNsx;
    private String idMauSac;
    private String idDongSP;
    private Integer namBH;
    private String moTa;
    private Integer soLuongTon;
    private Long giaNhap;
    private Long giaBan;

    // Constructors, getters, and setters

}
