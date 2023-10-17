package com.example.demo.repositories;

import com.example.demo.entities.ChiTietSP;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSP, UUID> {


}
