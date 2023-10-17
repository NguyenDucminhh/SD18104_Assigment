package com.example.demo.config;

import com.example.demo.requests.sanPhamRequest;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Configurable
public class DemoBeanConfig {

    @Bean("Bean1")
    public sanPhamRequest getBean(){
        sanPhamRequest r = new sanPhamRequest("SP09","San Pham Vip pro");
        return r;
    }
    @Bean("Bean2")
    public sanPhamRequest getBean2(){
        sanPhamRequest r = new sanPhamRequest("SP08","San Pham binh thuong");
        return r;
    }
}
