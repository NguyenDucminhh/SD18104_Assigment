package com.example.demo.repositories;

import com.example.demo.entities.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MauSacRepository extends JpaRepository<MauSac, UUID> {
    @Query("select obj from MauSac obj where obj.ma = ?1")
    public MauSac findByMa(String ma);
}