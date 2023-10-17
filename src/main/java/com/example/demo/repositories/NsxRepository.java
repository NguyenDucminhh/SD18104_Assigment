package com.example.demo.repositories;
import com.example.demo.entities.Nsx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface NsxRepository extends JpaRepository<Nsx, UUID> {
    @Query("select obj from Nsx obj where obj.ma =?1")
    public Nsx findByMa(String ma);

}
