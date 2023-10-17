package com.example.demo.repositories;

import com.example.demo.entities.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DongSanPhamRepository extends JpaRepository<DongSanPham, UUID> {
    @Query("select obj from DongSanPham obj where obj.ma =?1")
    public DongSanPham findByMa(String ma);

}
