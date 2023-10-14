package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SanPham")
public class SanPham {
    @Id
    @Column(name="Id")
    private UUID id;

    @Column(name="Ma")
    private String ma;

    @Column(name ="Ten")
    private String ten;
}
