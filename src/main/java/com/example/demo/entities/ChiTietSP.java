package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "ChiTietSP")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChiTietSP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", columnDefinition = "UNIQUEIDENTIFIER", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "IdSP", columnDefinition = "UNIQUEIDENTIFIER", nullable = false)
    private UUID idSP;

    @Column(name = "IdNsx", columnDefinition = "UNIQUEIDENTIFIER", nullable = false)
    private UUID idNsx;

    @Column(name = "IdMauSac", columnDefinition = "UNIQUEIDENTIFIER", nullable = false)
    private UUID idMauSac;

    @Column(name = "IdDongSP", columnDefinition = "UNIQUEIDENTIFIER", nullable = false)
    private UUID idDongSP;

    @Column(name = "NamBH", nullable = true)
    private Integer namBH;

    @Column(name = "MoTa", columnDefinition = "NVARCHAR(50)", nullable = true)
    private String moTa;

    @Column(name = "SoLuongTon", nullable = false)
    private Integer soLuongTon;

    @Column(name = "GiaNhap", columnDefinition = "DECIMAL(20,0)", nullable = false)
    private Long giaNhap;

    @Column(name = "GiaBan", columnDefinition = "DECIMAL(20,0)", nullable = false)
    private Long giaBan;

    // Getters and setters
}
