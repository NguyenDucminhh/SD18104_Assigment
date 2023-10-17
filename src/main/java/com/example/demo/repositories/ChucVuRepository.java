package com.example.demo.repositories;


import com.example.demo.entities.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, UUID> {
    @Query("select obj from ChucVu obj where obj.ma =?1")
    public ChucVu findByMa(String ma);
}
