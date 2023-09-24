package com.example.demo.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class sanPhamRequest {
    @NotBlank(message = "Không được để trống mục này")
    private String ma;
    @NotBlank(message = "Không được để trống mục này")
    private String ten;
}
