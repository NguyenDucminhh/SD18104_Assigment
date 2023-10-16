package com.example.demo.repositories;

import com.example.demo.entities.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, UUID> {
    @Query("select obj from KhachHang obj where obj.ma =?1")
    public KhachHang findByMa(String ma);
}
