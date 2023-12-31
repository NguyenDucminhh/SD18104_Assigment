package com.example.demo.entities;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="Ma")
    private String ma;

    @Column(name ="Ten")
    private String ten;
}
